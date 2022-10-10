package cn.authing.sdk.java.dto;


import com.alibaba.fastjson.annotation.JSONType;
import com.fasterxml.jackson.annotation.JsonProperty;


@JSONType(orders = {"qrcodeExpiresIn", "ticketExpiresIn", "allowExchangeUserInfoFromBrowser", "returnFullUserInfo"})
public class QrcodeLoginStrategyDto {
    /**
     * 二维码有效时间（秒）
     */
    @JsonProperty("qrcodeExpiresIn")
    private Integer qrcodeExpiresIn;
    /**
     * ticket 有效时间（秒）
     */
    @JsonProperty("ticketExpiresIn")
    private Integer ticketExpiresIn;
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

    public Integer getTicketExpiresIn() {
        return ticketExpiresIn;
    }
    public void setTicketExpiresIn(Integer ticketExpiresIn) {
        this.ticketExpiresIn = ticketExpiresIn;
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