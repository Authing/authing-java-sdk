package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.LoginTokenResponseDataDto;
import cn.authing.sdk.java.dto.QRCodeStatusBriefUserInfoDto;

public class CheckQRCodeStatusDataDto {
    /**
     * 二维码状态。按照用户扫码顺序，共分为 PENDING(未扫码)、SCANNED(已扫码等待用户确认)、AUTHORIZED(用户已授权)、CANCELLED(取消授权)、EXPIRED(二维码过期)以及 ERROR(未知错误)六种状态。
     */
    @JsonProperty("status")
    private Status status;
    /**
     * 当二维码状态为已授权时返回。如果在控制台应用安全 - 通用安全 - 登录安全 - APP 扫码登录 Web 安全中未开启「Web 轮询接口返回完整用户信息」（默认处于关闭状态），会返回此 ticket，用于换取完整的用户信息。
     */
    @JsonProperty("ticket")
    private String ticket;
    @JsonProperty("briefUserInfo")
    private QRCodeStatusBriefUserInfoDto briefUserInfo;
    /**
     * 当二维码状态为已授权并且在控制台应用安全 - 通用安全 - 登录安全 - APP 扫码登录 Web 安全中开启了「Web 轮询接口返回完整用户信息」（默认处于关闭状态）开关，此数据才会返回。推荐使用 ticket 换取用户信息。
     */
    @JsonProperty("tokenSet")
    private LoginTokenResponseDataDto tokenSet;

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTicket() {
        return ticket;
    }
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public QRCodeStatusBriefUserInfoDto getBriefUserInfo() {
        return briefUserInfo;
    }
    public void setBriefUserInfo(QRCodeStatusBriefUserInfoDto briefUserInfo) {
        this.briefUserInfo = briefUserInfo;
    }

    public LoginTokenResponseDataDto getTokenSet() {
        return tokenSet;
    }
    public void setTokenSet(LoginTokenResponseDataDto tokenSet) {
        this.tokenSet = tokenSet;
    }


    /**
     * 二维码状态。按照用户扫码顺序，共分为 PENDING(未扫码)、SCANNED(已扫码等待用户确认)、AUTHORIZED(用户已授权)、CANCELLED(取消授权)、EXPIRED(二维码过期)以及 ERROR(未知错误)六种状态。
     */
    public static enum Status {

        @JsonProperty("PENDING")
        PENDING("PENDING"),

        @JsonProperty("SCANNED")
        SCANNED("SCANNED"),

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