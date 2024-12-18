package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailProviderDto {
    /**
     * 是否启用，如果不启用，将默认使用 Authing 内置的邮件服务
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 第三方邮件服务商类型:
     * - `custom`: 自定义 SMTP 邮件服务
     * - `ali`: [阿里企业邮箱](https://www.ali-exmail.cn/Land/)
     * - `qq`: [腾讯企业邮箱](https://work.weixin.qq.com/mail/)
     * - `sendgrid`: [SendGrid 邮件服务](https://sendgrid.com/)
     *
     */
    @JsonProperty("type")
    private Type type;
    /**
     * SMTP 邮件服务配置
     */
    @JsonProperty("smtpConfig")
    private SMTPEmailProviderConfig smtpConfig;
    /**
     * SendGrid 邮件服务配置
     */
    @JsonProperty("sendGridConfig")
    private SendGridEmailProviderConfig sendGridConfig;
    /**
     * 阿里企业邮件服务配置
     */
    @JsonProperty("aliExmailConfig")
    private AliExmailEmailProviderConfig aliExmailConfig;
    /**
     * 腾讯企业邮件服务配置
     */
    @JsonProperty("tencentExmailConfig")
    private TencentExmailEmailProviderConfig tencentExmailConfig;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public SMTPEmailProviderConfig getSmtpConfig() {
        return smtpConfig;
    }
    public void setSmtpConfig(SMTPEmailProviderConfig smtpConfig) {
        this.smtpConfig = smtpConfig;
    }

    public SendGridEmailProviderConfig getSendGridConfig() {
        return sendGridConfig;
    }
    public void setSendGridConfig(SendGridEmailProviderConfig sendGridConfig) {
        this.sendGridConfig = sendGridConfig;
    }

    public AliExmailEmailProviderConfig getAliExmailConfig() {
        return aliExmailConfig;
    }
    public void setAliExmailConfig(AliExmailEmailProviderConfig aliExmailConfig) {
        this.aliExmailConfig = aliExmailConfig;
    }

    public TencentExmailEmailProviderConfig getTencentExmailConfig() {
        return tencentExmailConfig;
    }
    public void setTencentExmailConfig(TencentExmailEmailProviderConfig tencentExmailConfig) {
        this.tencentExmailConfig = tencentExmailConfig;
    }


    /**
     * 第三方邮件服务商类型:
     * - `custom`: 自定义 SMTP 邮件服务
     * - `ali`: [阿里企业邮箱](https://www.ali-exmail.cn/Land/)
     * - `qq`: [腾讯企业邮箱](https://work.weixin.qq.com/mail/)
     * - `sendgrid`: [SendGrid 邮件服务](https://sendgrid.com/)
     *
     */
    public static enum Type {

        @JsonProperty("ali")
        ALI("ali"),

        @JsonProperty("qq")
        QQ("qq"),

        @JsonProperty("sendgrid")
        SENDGRID("sendgrid"),

        @JsonProperty("custom")
        CUSTOM("custom"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}