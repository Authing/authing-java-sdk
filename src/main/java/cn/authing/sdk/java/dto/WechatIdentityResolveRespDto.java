package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.WechatIdentityResolveRespDataDto;


public class WechatIdentityResolveRespDto {
    /**
     * 异常 ID：需要中间操作才能完成登录。
     */
    @JsonProperty("uniqueId")
    private String uniqueId;
    /**
     * （仅用于兼容旧版代码）细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("code")
    private Integer code;
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
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