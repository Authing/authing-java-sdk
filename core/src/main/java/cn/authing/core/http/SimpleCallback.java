package cn.authing.core.http;

import cn.authing.core.result.ErrorInfo;

public class SimpleCallback implements Callback<Object> {
    @Override
    public void onSuccess(Object result) { }

    @Override
    public void onFailure(ErrorInfo error) { }
}
