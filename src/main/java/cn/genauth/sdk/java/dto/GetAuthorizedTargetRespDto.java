package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAuthorizedTargetRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * 描述信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("apiCode")
    private Integer apiCode;
    /**
     * 请求 ID。当请求失败时会返回。
     */
    @JsonProperty("requestId")
    private String requestId;
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private GetAuthorizedTargetDataDto data;

    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getApiCode() {
        return apiCode;
    }
    public void setApiCode(Integer apiCode) {
        this.apiCode = apiCode;
    }

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public GetAuthorizedTargetDataDto getData() {
        return data;
    }
    public void setData(GetAuthorizedTargetDataDto data) {
        this.data = data;
    }



}