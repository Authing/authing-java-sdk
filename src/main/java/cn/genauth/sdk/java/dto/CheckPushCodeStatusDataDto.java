package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckPushCodeStatusDataDto {
    /**
     * 推送码状态。按照推送登录顺序，共分为 PUSHED(已推送)、AUTHORIZED(用户已授权)、CANCELLED(取消授权)、EXPIRED(推送登录过期)以及 ERROR(未知错误)五种状态。
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 当推送码状态为已授权，此数据才会返回。
     */
    @JsonProperty("tokenSet")
    private LoginTokenResponseDataDto tokenSet;

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public LoginTokenResponseDataDto getTokenSet() {
        return tokenSet;
    }
    public void setTokenSet(LoginTokenResponseDataDto tokenSet) {
        this.tokenSet = tokenSet;
    }


    /**
     * 推送码状态。按照推送登录顺序，共分为 PUSHED(已推送)、AUTHORIZED(用户已授权)、CANCELLED(取消授权)、EXPIRED(推送登录过期)以及 ERROR(未知错误)五种状态。
     */
    public static enum Status {

        @JsonProperty("PUSHED")
        PUSHED("PUSHED"),

        @JsonProperty("AUTHORIZED")
        AUTHORIZED("AUTHORIZED"),

        @JsonProperty("CANCELLED")
        CANCELLED("CANCELLED"),

        @JsonProperty("EXPIRED")
        EXPIRED("EXPIRED"),

        @JsonProperty("ERROR")
        ERROR("ERROR"),
        ;

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}