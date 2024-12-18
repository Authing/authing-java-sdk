package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WechatIdentityResolveRespDto {
    /**
     * 异常 ID：需要中间操作才能完成登录。
     */
    @JsonProperty("uniqueId")
    private String uniqueId;
    /**
     * （仅用于兼容旧版代码）细分错误码，可通过此错误码得到具体的错误类型（成功请求不返回）。
     */
    @JsonProperty("code")
    private Integer code;
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型（成功请求不返回）。详细错误码列表请见：[API Code 列表](https://api-explorer.authing.cn/?tag=group/%E5%BC%80%E5%8F%91%E5%87%86%E5%A4%87#tag/%E5%BC%80%E5%8F%91%E5%87%86%E5%A4%87/%E9%94%99%E8%AF%AF%E5%A4%84%E7%90%86/apiCode)
     */
    @JsonProperty("apiCode")
    private Integer apiCode;
    /**
     * 描述信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private WechatIdentityResolveRespDataDto data;

    public String getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getApiCode() {
        return apiCode;
    }
    public void setApiCode(Integer apiCode) {
        this.apiCode = apiCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public WechatIdentityResolveRespDataDto getData() {
        return data;
    }
    public void setData(WechatIdentityResolveRespDataDto data) {
        this.data = data;
    }



}