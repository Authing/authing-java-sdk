package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateEmailDto {
    /**
     * 用于临时修改邮箱的 token，可从**发起修改邮箱的验证请求**接口获取。
     */
    @JsonProperty("updateEmailToken")
    private String updateEmailToken;

    public String getUpdateEmailToken() {
        return updateEmailToken;
    }
    public void setUpdateEmailToken(String updateEmailToken) {
        this.updateEmailToken = updateEmailToken;
    }



}