package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class QrcodeLoginStrategyDto {
    /**
     * 二维码有效时间，单位秒
     */
    @JsonProperty("qrcodeExpiresIn")
    private Integer qrcodeExpiresIn;
    /**
     * 时间长度单位，Second/Minute/Hour/Day，仅做显示用
     */
    @JsonProperty("qrcodeExpiresInUnit")
    private String qrcodeExpiresInUnit;
    /**
     * ticket 有效时间，单位秒
     */
    @JsonProperty("ticketExpiresIn")
    private Integer ticketExpiresIn;
    /**
     * 时间长度单位，Second/Minute/Hour/Day，仅作显示用
     */
    @JsonProperty("ticketExpiresInUnit")
    private String ticketExpiresInUnit;
    /**
     * Web 轮询接口返回完整用户信息，详情见此文档：Web 轮询接口返回完整用户信息
     */
    @JsonProperty("allowExchangeUserInfoFromBrowser")
    private Boolean allowExchangeUserInfoFromBrowser;
    /**
     * 允许在浏览器使用 ticket 换取用户信息，详情见此文档：Web 轮询接口返回完整用户信息
     */
    @JsonProperty("returnFullUserInfo")
    private Boolean returnFullUserInfo;

    public Integer getQrcodeExpiresIn() {
        return qrcodeExpiresIn;
    }
    public void setQrcodeExpiresIn(Integer qrcodeExpiresIn) {
        this.qrcodeExpiresIn = qrcodeExpiresIn;
    }

    public String getQrcodeExpiresInUnit() {
        return qrcodeExpiresInUnit;
    }
    public void setQrcodeExpiresInUnit(String qrcodeExpiresInUnit) {
        this.qrcodeExpiresInUnit = qrcodeExpiresInUnit;
    }

    public Integer getTicketExpiresIn() {
        return ticketExpiresIn;
    }
    public void setTicketExpiresIn(Integer ticketExpiresIn) {
        this.ticketExpiresIn = ticketExpiresIn;
    }

    public String getTicketExpiresInUnit() {
        return ticketExpiresInUnit;
    }
    public void setTicketExpiresInUnit(String ticketExpiresInUnit) {
        this.ticketExpiresInUnit = ticketExpiresInUnit;
    }

    public Boolean getAllowExchangeUserInfoFromBrowser() {
        return allowExchangeUserInfoFromBrowser;
    }
    public void setAllowExchangeUserInfoFromBrowser(Boolean allowExchangeUserInfoFromBrowser) {
        this.allowExchangeUserInfoFromBrowser = allowExchangeUserInfoFromBrowser;
    }

    public Boolean getReturnFullUserInfo() {
        return returnFullUserInfo;
    }
    public void setReturnFullUserInfo(Boolean returnFullUserInfo) {
        this.returnFullUserInfo = returnFullUserInfo;
    }



}