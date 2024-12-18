package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PreviewEmailTemplateDto {
    /**
     * 模版类型:
     * - `WELCOME_EMAIL`: 欢迎邮件
     * - `FIRST_CREATED_USER`: 首次创建用户通知
     * - `REGISTER_VERIFY_CODE`: 注册验证码
     * - `LOGIN_VERIFY_CODE`: 登录验证码
     * - `MFA_VERIFY_CODE`: MFA 验证码
     * - `INFORMATION_COMPLETION_VERIFY_CODE`: 注册信息补全验证码
     * - `FIRST_EMAIL_LOGIN_VERIFY`: 首次邮箱登录验证
     * - `CONSOLE_CONDUCTED_VERIFY`: 在控制台发起邮件验证
     * - `USER_PASSWORD_UPDATE_REMIND`: 用户到期提醒
     * - `ADMIN_RESET_USER_PASSWORD_NOTIFICATION`: 管理员重置用户密码成功通知
     * - `USER_PASSWORD_RESET_NOTIFICATION`: 用户密码重置成功通知
     * - `RESET_PASSWORD_VERIFY_CODE`: 重置密码验证码
     * - `SELF_UNLOCKING_VERIFY_CODE`: 自助解锁验证码
     * - `EMAIL_BIND_VERIFY_CODE`: 绑定邮箱验证码
     * - `EMAIL_UNBIND_VERIFY_CODE`: 解绑邮箱验证码
     *
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 邮件内容模版，可选，如果不传默认使用用户池配置的邮件模版进行渲染。
     */
    @JsonProperty("content")
    private String content;
    /**
     * 邮件主题，可选，如果不传默认使用用户池配置的邮件模版进行渲染。
     */
    @JsonProperty("subject")
    private String subject;
    /**
     * 邮件发件人名称，可选，如果不传默认使用用户池配置的邮件模版进行渲染。
     */
    @JsonProperty("sender")
    private String sender;
    /**
     * 验证码/邮件有效时间，只有验证类邮件才有有效时间。可选，如果不传默认使用用户池配置的邮件模版进行渲染。
     */
    @JsonProperty("expiresIn")
    private Integer expiresIn;
    /**
     * 模版渲染引擎。Authing 邮件模版目前支持两种渲染引擎：
     * - `handlebar`: 详细使用方法请见：[handlebars 官方文档](https://handlebarsjs.com/)
     * - `ejs`: 详细使用方法请见：[ejs 官方文档](https://ejs.co/)
     *
     * 默认将使用 `handlerbar` 作为模版渲染引擎。
     *
     */
    @JsonProperty("tplEngine")
    private TplEngine tplEngine;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }
    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public TplEngine getTplEngine() {
        return tplEngine;
    }
    public void setTplEngine(TplEngine tplEngine) {
        this.tplEngine = tplEngine;
    }


    /**
     * 模版类型:
     * - `WELCOME_EMAIL`: 欢迎邮件
     * - `FIRST_CREATED_USER`: 首次创建用户通知
     * - `REGISTER_VERIFY_CODE`: 注册验证码
     * - `LOGIN_VERIFY_CODE`: 登录验证码
     * - `MFA_VERIFY_CODE`: MFA 验证码
     * - `INFORMATION_COMPLETION_VERIFY_CODE`: 注册信息补全验证码
     * - `FIRST_EMAIL_LOGIN_VERIFY`: 首次邮箱登录验证
     * - `CONSOLE_CONDUCTED_VERIFY`: 在控制台发起邮件验证
     * - `USER_PASSWORD_UPDATE_REMIND`: 用户到期提醒
     * - `ADMIN_RESET_USER_PASSWORD_NOTIFICATION`: 管理员重置用户密码成功通知
     * - `USER_PASSWORD_RESET_NOTIFICATION`: 用户密码重置成功通知
     * - `RESET_PASSWORD_VERIFY_CODE`: 重置密码验证码
     * - `SELF_UNLOCKING_VERIFY_CODE`: 自助解锁验证码
     * - `EMAIL_BIND_VERIFY_CODE`: 绑定邮箱验证码
     * - `EMAIL_UNBIND_VERIFY_CODE`: 解绑邮箱验证码
     *
     */
    public static enum Type {

        @JsonProperty("WELCOME_EMAIL")
        WELCOME_EMAIL("WELCOME_EMAIL"),

        @JsonProperty("FIRST_CREATED_USER")
        FIRST_CREATED_USER("FIRST_CREATED_USER"),

        @JsonProperty("REGISTER_VERIFY_CODE")
        REGISTER_VERIFY_CODE("REGISTER_VERIFY_CODE"),

        @JsonProperty("LOGIN_VERIFY_CODE")
        LOGIN_VERIFY_CODE("LOGIN_VERIFY_CODE"),

        @JsonProperty("MFA_VERIFY_CODE")
        MFA_VERIFY_CODE("MFA_VERIFY_CODE"),

        @JsonProperty("INFORMATION_COMPLETION_VERIFY_CODE")
        INFORMATION_COMPLETION_VERIFY_CODE("INFORMATION_COMPLETION_VERIFY_CODE"),

        @JsonProperty("FIRST_EMAIL_LOGIN_VERIFY")
        FIRST_EMAIL_LOGIN_VERIFY("FIRST_EMAIL_LOGIN_VERIFY"),

        @JsonProperty("CONSOLE_CONDUCTED_VERIFY")
        CONSOLE_CONDUCTED_VERIFY("CONSOLE_CONDUCTED_VERIFY"),

        @JsonProperty("USER_PASSWORD_UPDATE_REMIND")
        USER_PASSWORD_UPDATE_REMIND("USER_PASSWORD_UPDATE_REMIND"),

        @JsonProperty("ADMIN_RESET_USER_PASSWORD_NOTIFICATION")
        ADMIN_RESET_USER_PASSWORD_NOTIFICATION("ADMIN_RESET_USER_PASSWORD_NOTIFICATION"),

        @JsonProperty("USER_PASSWORD_RESET_NOTIFICATION")
        USER_PASSWORD_RESET_NOTIFICATION("USER_PASSWORD_RESET_NOTIFICATION"),

        @JsonProperty("RESET_PASSWORD_VERIFY_CODE")
        RESET_PASSWORD_VERIFY_CODE("RESET_PASSWORD_VERIFY_CODE"),

        @JsonProperty("SELF_UNLOCKING_VERIFY_CODE")
        SELF_UNLOCKING_VERIFY_CODE("SELF_UNLOCKING_VERIFY_CODE"),

        @JsonProperty("EMAIL_BIND_VERIFY_CODE")
        EMAIL_BIND_VERIFY_CODE("EMAIL_BIND_VERIFY_CODE"),

        @JsonProperty("EMAIL_UNBIND_VERIFY_CODE")
        EMAIL_UNBIND_VERIFY_CODE("EMAIL_UNBIND_VERIFY_CODE"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 模版渲染引擎。Authing 邮件模版目前支持两种渲染引擎：
     * - `handlebar`: 详细使用方法请见：[handlebars 官方文档](https://handlebarsjs.com/)
     * - `ejs`: 详细使用方法请见：[ejs 官方文档](https://ejs.co/)
     *
     * 默认将使用 `handlerbar` 作为模版渲染引擎。
     *
     */
    public static enum TplEngine {

        @JsonProperty("handlebar")
        HANDLEBAR("handlebar"),

        @JsonProperty("ejs")
        EJS("ejs"),
        ;

        private String value;

        TplEngine(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}