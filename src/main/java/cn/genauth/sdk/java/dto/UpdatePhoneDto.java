package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePhoneDto {
    /**
     * 用于临时修改手机号的 token，可从**发起修改手机号的验证请求**接口获取。
     */
    @JsonProperty("updatePhoneToken")
    private String updatePhoneToken;

    public String getUpdatePhoneToken() {
        return updatePhoneToken;
    }
    public void setUpdatePhoneToken(String updatePhoneToken) {
        this.updatePhoneToken = updatePhoneToken;
    }



}