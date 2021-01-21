package cn.authing.core.types

data class LoginByLdapParam @JvmOverloads constructor(
    /**
     * 用户名
     */
    var username: String,

    /**
     * 密码
     */
    var password: String,

    var options: LoginByLdapParamOptions? = null
) {

    fun withOptions(options: LoginByLdapParamOptions): LoginByLdapParam {
        this.options = options
        return this
    }

    fun build(): LoginByLdapParam {
        return this
    }
}

data class LoginByLdapParamOptions(
    /**
     * 是否自动注册。如果检测到用户不存在，会根据登录账密自动创建一个账号。
     */
    var autoRegister: Boolean? = false,

    /**
     * 图形验证码
     */
    var captchaCode: String? = null,

    /**
     * 客户端真实 IP，如果你在服务器端调用此接口，请务必将此参数设置为终端用户的真实 IP。
     */
    var clientIp: String? = null
) {
    fun withAutoRegister(autoRegister: Boolean): LoginByLdapParamOptions {
        this.autoRegister = autoRegister
        return this
    }

    fun withCaptchaCode(captchaCode: String): LoginByLdapParamOptions {
        this.captchaCode = captchaCode
        return this
    }

    fun withClientIp(clientIp: String): LoginByLdapParamOptions {
        this.clientIp = clientIp
        return this
    }

    fun build(): LoginByLdapParamOptions {
        return this
    }
}
