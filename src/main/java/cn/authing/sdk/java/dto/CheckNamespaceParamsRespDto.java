package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckNamespaceParamsRespDto {
    /**
     * 角色名称或者角色 Code 校验是否有效
     */
    @JsonProperty("isValid")
    private Boolean isValid;
    /**
     * 角色名称或角色 Code 校验失败提示信息,如果校验成功, Message 不返回
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