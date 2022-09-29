package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CookieSettingsDto {
    /**
     * Cookie 有效时间：用户登录状态的有效时间（默认为 1209600 秒/ 14 天），过期后用户需要重新登录。对于应用面板及已加入应用面板的应用，将使用此 cookie  过期时间。
     */
    @JsonProperty("cookieExpiresIn")
    private Integer cookieExpiresIn;
    /**
     * Cookie 过期时间基于浏览器会话：当前浏览器关闭后立即过期，下次打开需重新登录。
     */
    @JsonProperty("cookieExpiresOnBrowserSession")
    private Boolean cookieExpiresOnBrowserSession;

    public Integer getCookieExpiresIn() {
        return cookieExpiresIn;
    }
    public void setCookieExpiresIn(Integer cookieExpiresIn) {
        this.cookieExpiresIn = cookieExpiresIn;
    }

    public Boolean getCookieExpiresOnBrowserSession() {
        return cookieExpiresOnBrowserSession;
    }
    public void setCookieExpiresOnBrowserSession(Boolean cookieExpiresOnBrowserSession) {
        this.cookieExpiresOnBrowserSession = cookieExpiresOnBrowserSession;
    }



}