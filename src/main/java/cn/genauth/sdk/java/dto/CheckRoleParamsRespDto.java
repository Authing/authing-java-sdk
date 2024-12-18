package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckRoleParamsRespDto {
    /**
     * 权限空间名称或者权限空间 Code 校验是否有效
     */
    @JsonProperty("isValid")
    private Boolean isValid;
    /**
     * 权限空间名称或权限空间 Code 校验失败提示信息,如果校验成功, Message 不返回
     */
    @JsonProperty("message")
    private Boolean message;

    public Boolean getIsValid() {
        return isValid;
    }
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Boolean getMessage() {
        return message;
    }
    public void setMessage(Boolean message) {
        this.message = message;
    }



}