package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SendUserResetPasswordEmailLinkBatchResultRespDto {
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("success")
    private boolean success;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
