package cn.authing.core.business;


import com.google.gson.TypeAdapter;

import java.io.IOException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

import cn.authing.core.http.Call;
import cn.authing.core.http.Callback;
import cn.authing.core.result.ErrorInfo;
import okhttp3.Request;
import okhttp3.Response;

class NormalCall<ResultType> implements Call<ResultType> {
    private final Request request;
    private final okhttp3.Call.Factory callFactory;
    private final TypeAdapter<ResultType> adapter;

    private volatile boolean canceled;

    @GuardedBy("this")
    @Nullable private okhttp3.Call rawCall;
    @GuardedBy("this") // Either a RuntimeException, non-fatal Error, or IOException.
    @Nullable private Throwable creationFailure;
    @GuardedBy("this")
    private boolean executed;

    public NormalCall(Request request, okhttp3.Call.Factory callFactory, TypeAdapter<ResultType> adapter) {
        this.request = request;
        this.callFactory = callFactory;
        this.adapter = adapter;
    }

    @Override
    public synchronized Request request() {
        okhttp3.Call call = rawCall;
        if (call != null) {
            return call.request();
        }
        if (creationFailure != null) {
            if (creationFailure instanceof IOException) {
                throw new RuntimeException("Unable to create request.", creationFailure);
            } else if (creationFailure instanceof RuntimeException) {
                throw (RuntimeException) creationFailure;
            } else {
                throw (Error) creationFailure;
            }
        }
        try {
            return (rawCall = createRawCall()).request();
        } catch (RuntimeException | Error e) {
            throwIfFatal(e); // Do not assign a fatal error to creationFailure.
            creationFailure = e;
            throw e;
        } catch (IOException e) {
            creationFailure = e;
            throw new RuntimeException("Unable to create request.", e);
        }
    }

    @Override
    public void enqueue(@Nonnull final Callback<ResultType> callback) {
        okhttp3.Call call;
        Throwable failure;

        synchronized (this) {
            if (executed) throw new IllegalStateException("Already executed.");
            executed = true;

            call = rawCall;
            failure = creationFailure;
            if (call == null && failure == null) {
                try {
                    call = rawCall = createRawCall();
                } catch (Throwable t) {
                    throwIfFatal(t);
                    failure = creationFailure = t;
                }
            }
        }

        if (failure != null) {
            callback.onFailure(ErrorInfo.generate(ErrorInfo.CODE_EXCEPTION, failure.getLocalizedMessage()));
            return;
        }

        if (canceled) {
            call.cancel();
        }

        call.enqueue(new okhttp3.Callback() {
            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response rawResponse) {
                if (!rawResponse.isSuccessful()) {
                    callback.onFailure(ErrorInfo.generate(rawResponse.code(), rawResponse.message()));
                } else {
                    callback.onSuccess(parseResponse(rawResponse));
                }
            }

            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                e.printStackTrace();
                callback.onFailure(ErrorInfo.generate(ErrorInfo.CODE_EXCEPTION, e.getLocalizedMessage()));
            }
        });
    }

    @Override
    public synchronized boolean isExecuted() {
        return executed;
    }

    @Override
    public ResultType execute() throws IOException {
        okhttp3.Call call;

        synchronized (this) {
            if (executed) throw new IllegalStateException("Already executed.");
            executed = true;

            if (creationFailure != null) {
                if (creationFailure instanceof IOException) {
                    throw (IOException) creationFailure;
                } else if (creationFailure instanceof RuntimeException) {
                    throw (RuntimeException) creationFailure;
                } else {
                    throw (Error) creationFailure;
                }
            }

            call = rawCall;
            if (call == null) {
                try {
                    call = rawCall = createRawCall();
                } catch (IOException | RuntimeException | Error e) {
                    throwIfFatal(e); //  Do not assign a fatal error to creationFailure.
                    creationFailure = e;
                    throw e;
                }
            }
        }

        if (canceled) {
            call.cancel();
        }

        Response response = call.execute();
        return response.isSuccessful() ? parseResponse(response) : null;
    }

    private okhttp3.Call createRawCall() throws IOException {
        okhttp3.Call call = callFactory.newCall(request);
        if (call == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        return call;
    }

    private ResultType parseResponse(okhttp3.Response rawResponse) {
        if (rawResponse.body() == null) {
            return null;
        }
        ResultType result = null;
        try {
            result = adapter.fromJson(rawResponse.body().charStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void cancel() {
        canceled = true;

        okhttp3.Call call;
        synchronized (this) {
            call = rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override
    public boolean isCanceled() {
        if (canceled) {
            return true;
        }
        synchronized (this) {
            return rawCall != null && rawCall.isCanceled();
        }
    }

    private void throwIfFatal(Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError) t;
        } else if (t instanceof ThreadDeath) {
            throw (ThreadDeath) t;
        } else if (t instanceof LinkageError) {
            throw (LinkageError) t;
        }
    }
}
