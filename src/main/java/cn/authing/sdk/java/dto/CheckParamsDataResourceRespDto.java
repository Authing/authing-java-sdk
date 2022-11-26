package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckParamsDataResourceRespDto {
    /**
     * 数据资源名称或者 Code 校验是否有效
     */
    @JsonProperty("isValid")
    private Boolean isValid;
    /**
     * 数据资源名称或者 Code 校验失败提示信息,如果校验成功, message 不返回
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