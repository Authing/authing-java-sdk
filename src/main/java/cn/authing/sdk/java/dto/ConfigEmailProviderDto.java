package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AliExmailEmailProviderConfigInput;
import cn.authing.sdk.java.dto.SendGridEmailProviderConfigInput;
import cn.authing.sdk.java.dto.SMTPEmailProviderConfigInput;
import cn.authing.sdk.java.dto.TencentExmailEmailProviderConfigInput;

public class ConfigEmailProviderDto {
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
     * 是否启用，如果不启用，将默认使用 Authing 内置的邮件服务
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * SMTP 邮件服务配置
     */
    @JsonProperty("smtpConfig")
    private SMTPEmailProviderConfigInput smtpConfig;
    /**
     * SendGrid 邮件服务配置
     */
    @JsonProperty("sendGridConfig")
    private SendGridEmailProviderConfigInput sendGridConfig;
    /**
     * 阿里企业邮件服务配置
     */
    @JsonProperty("aliExmailConfig")
    private AliExmailEmailProviderConfigInput aliExmailConfig;
    /**
     * 腾讯企业邮件服务配置
     */
    @JsonProperty("tencentExmailConfig")
    private TencentExmailEmailProviderConfigInput tencentExmailConfig;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SMTPEmailProviderConfigInput getSmtpConfig() {
        return smtpConfig;
    }
    public void setSmtpConfig(SMTPEmailProviderConfigInput smtpConfig) {
        this.smtpConfig = smtpConfig;
    }

    public SendGridEmailProviderConfigInput getSendGridConfig() {
        return sendGridConfig;
    }
    public void setSendGridConfig(SendGridEmailProviderConfigInput sendGridConfig) {
        this.sendGridConfig = sendGridConfig;
    }

    public AliExmailEmailProviderConfigInput getAliExmailConfig() {
        return aliExmailConfig;
    }
    public void setAliExmailConfig(AliExmailEmailProviderConfigInput aliExmailConfig) {
        this.aliExmailConfig = aliExmailConfig;
    }

    public TencentExmailEmailProviderConfigInput getTencentExmailConfig() {
        return tencentExmailConfig;
    }
    public void setTencentExmailConfig(TencentExmailEmailProviderConfigInput tencentExmailConfig) {
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