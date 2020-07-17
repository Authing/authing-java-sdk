package cn.authing.core.http;


import org.jetbrains.annotations.Nullable;

import java.io.IOException;

import okhttp3.Request;

/**
 * copy from retrofit2
 */
public interface Call<T> {

    @Nullable T execute() throws IOException;

    void enqueue(Callback<T> callback);

    boolean isExecuted();

    void cancel();

    boolean isCanceled();

    Request request();
}
