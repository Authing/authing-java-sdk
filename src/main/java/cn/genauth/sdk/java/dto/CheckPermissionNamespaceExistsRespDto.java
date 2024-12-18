package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckPermissionNamespaceExistsRespDto {
    /**
     * 校验权限空间名称或者权限空间名称 Code 是否有效
     */
    @JsonProperty("isValid")
    private Boolean isValid;
    /**
     * 权限空间名称或权限空间 Code 校验失败提示信息,如果校验成功, Message 不返回
     */
    @JsonProperty("message")
    private String message;

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }



}