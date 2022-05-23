package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UpdateNamespaceDto;

public class UpdateNamespaceRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("code")
    private Integer code;
    /**
     * 描述信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("errorCode")
    private Integer errorCode;
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private UpdateNamespaceDto data;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public UpdateNamespaceDto getData() {
        return data;
    }
    public void setData(UpdateNamespaceDto data) {
        this.data = data;
    }



}