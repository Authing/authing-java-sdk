package cn.authing.core.http;

import cn.authing.core.result.ErrorInfo;

/**
 * copy from retrofit2
 */
public interface Callback<T> {
    void onSuccess(T result);

    void onFailure(ErrorInfo error);
}

