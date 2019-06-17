package cn.authing.core.http;

import cn.authing.core.result.ErrorInfo;

/**
 * copy from retrofit2
 *
 * @param <T>
 */
public interface Callback<T> {
    void onSuccess(T result);

    void onFailure(ErrorInfo error);
}

