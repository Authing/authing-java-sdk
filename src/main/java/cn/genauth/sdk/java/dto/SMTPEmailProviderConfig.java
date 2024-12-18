package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SMTPEmailProviderConfig {
    /**
     * SMTP 地址
     */
    @JsonProperty("smtp_host")
    private String smtpHost;
    /**
     * SMTP 端口
     */
    @JsonProperty("smtp_port")
    private Integer smtpPort;
    /**
     * 用户名
     */
    @JsonProperty("sender")
    private String sender;
    /**
     * 密码
     */
    @JsonProperty("senderPass")
    private String senderPass;
    /**
     * 是否启用 SSL
     */
    @JsonProperty("secure")
    private Boolean secure;

    public String getSmtpHost() {
        return smtpHost;
    }
    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public Integer getSmtpPort() {
        return smtpPort;
    }
    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderPass() {
        return senderPass;
    }
    public void setSenderPass(String senderPass) {
        this.senderPass = senderPass;
    }

    public Boolean getSecure() {
        return secure;
    }
    public void setSecure(Boolean secure) {
        this.secure = secure;
    }



}