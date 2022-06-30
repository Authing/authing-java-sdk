package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MakeRequestReqDto {
    /**
     * method: GET/POST
     */
    @JsonProperty("method")
    private String method;
    /**
     * url: 请求 URL，不包含 host 部分
     */
    @JsonProperty("url")
    private String url;

    /**
     * data: 请求数据
     */
    @JsonProperty("data")
    private Object data;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}