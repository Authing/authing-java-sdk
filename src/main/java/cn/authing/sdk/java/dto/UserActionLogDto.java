package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GeoIp;
import cn.authing.sdk.java.dto.ParsedUserAgent;

public class UserActionLogDto {
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户头像
     */
    @JsonProperty("userAvatar")
    private String userAvatar;
    /**
     * 用户显示名称，按照以下用户字段顺序进行展示：nickname > username > name > givenName > familyName -> email -> phone -> id
     */
    @JsonProperty("userDisplayName")
    private String userDisplayName;
    /**
     * 用户登录次数
     */
    @JsonProperty("userLoginsCount")
    private Integer userLoginsCount;
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 应用名称
     */
    @JsonProperty("appName")
    private String appName;
    /**
     * 客户端 IP，可根据登录时的客户端 IP 进行筛选。默认不传获取所有登录 IP 的登录历史。
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 事件类型：
     * - `login`: 登录
     * - `logout`: 登出
     * - `register`: 注册
     * - `verifyMfa`: 验证 MFA
     * - `updateUserProfile`: 修改用户信息
     * - `updateUserPassword`: 修改密码
     * - `updateUserEmail`: 修改邮箱
     * - `updateUserPhone`: 修改手机号
     * - `bindMfa`: 绑定 MFA
     * - `bindEmail`: 绑定邮箱
     * - `bindPhone`: 绑定手机号
     * - `unbindPhone`: 解绑手机号
     * - `unbindEmail`: 解绑邮箱
     * - `unbindMFA`: 解绑 MFA
     * - `deleteAccount`: 注销账号
     * - `verifyFirstLogin`: 首次登录验证
     *
     */
    @JsonProperty("eventType")
    private EventType eventType;
    /**
     * 事件详情
     */
    @JsonProperty("eventDetail")
    private String eventDetail;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 应用登录地址
     */
    @JsonProperty("appLoginUrl")
    private String appLoginUrl;
    /**
     * 应用 Logo
     */
    @JsonProperty("appLogo")
    private String appLogo;
    /**
     * User Agent
     */
    @JsonProperty("userAgent")
    private String userAgent;
    /**
     * 解析过后的 User Agent
     */
    @JsonProperty("parsedUserAgent")
    private ParsedUserAgent parsedUserAgent;
    /**
     * 地理位置
     */
    @JsonProperty("geoip")
    private GeoIp geoip;
    /**
     * 时间
     */
    @JsonProperty("timestamp")
    private String timestamp;
    /**
     * 请求 ID
     */
    @JsonProperty("requestId")
    private String requestId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAvatar() {
        return userAvatar;
    }
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }
    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
    }

    public Integer getUserLoginsCount() {
        return userLoginsCount;
    }
    public void setUserLoginsCount(Integer userLoginsCount) {
        this.userLoginsCount = userLoginsCount;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public EventType getEventType() {
        return eventType;
    }
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public String getEventDetail() {
        return eventDetail;
    }
    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getAppLoginUrl() {
        return appLoginUrl;
    }
    public void setAppLoginUrl(String appLoginUrl) {
        this.appLoginUrl = appLoginUrl;
    }

    public String getAppLogo() {
        return appLogo;
    }
    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ParsedUserAgent getParsedUserAgent() {
        return parsedUserAgent;
    }
    public void setParsedUserAgent(ParsedUserAgent parsedUserAgent) {
        this.parsedUserAgent = parsedUserAgent;
    }

    public GeoIp getGeoip() {
        return geoip;
    }
    public void setGeoip(GeoIp geoip) {
        this.geoip = geoip;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * 事件类型：
     * - `login`: 登录
     * - `logout`: 登出
     * - `register`: 注册
     * - `verifyMfa`: 验证 MFA
     * - `updateUserProfile`: 修改用户信息
     * - `updateUserPassword`: 修改密码
     * - `updateUserEmail`: 修改邮箱
     * - `updateUserPhone`: 修改手机号
     * - `bindMfa`: 绑定 MFA
     * - `bindEmail`: 绑定邮箱
     * - `bindPhone`: 绑定手机号
     * - `unbindPhone`: 解绑手机号
     * - `unbindEmail`: 解绑邮箱
     * - `unbindMFA`: 解绑 MFA
     * - `deleteAccount`: 注销账号
     * - `verifyFirstLogin`: 首次登录验证
     *
     */
    public static enum EventType {

        @JsonProperty("login")
        LOGIN("login"),

        @JsonProperty("logout")
        LOGOUT("logout"),

        @JsonProperty("register")
        REGISTER("register"),

        @JsonProperty("verifyMfa")
        VERIFY_MFA("verifyMfa"),

        @JsonProperty("updateUserPrefile")
        UPDATE_USER_PREFILE("updateUserPrefile"),

        @JsonProperty("updateUserPassword")
        UPDATE_USER_PASSWORD("updateUserPassword"),

        @JsonProperty("updateUserEmail")
        UPDATE_USER_EMAIL("updateUserEmail"),

        @JsonProperty("updateUserPhone")
        UPDATE_USER_PHONE("updateUserPhone"),

        @JsonProperty("bindMfa")
        BIND_MFA("bindMfa"),

        @JsonProperty("bindEmail")
        BIND_EMAIL("bindEmail"),

        @JsonProperty("bindPhone")
        BIND_PHONE("bindPhone"),

        @JsonProperty("unbindPhone")
        UNBIND_PHONE("unbindPhone"),

        @JsonProperty("unbindEmail")
        UNBIND_EMAIL("unbindEmail"),

        @JsonProperty("unbindMFA")
        UNBIND_MFA("unbindMFA"),

        @JsonProperty("refreshUserTokenBySelf")
        REFRESH_USER_TOKEN_BY_SELF("refreshUserTokenBySelf"),

        @JsonProperty("deleteAccount")
        DELETE_ACCOUNT("deleteAccount"),

        @JsonProperty("verifyFirstLogin")
        VERIFY_FIRST_LOGIN("verifyFirstLogin"),

        @JsonProperty("securityResourceAccess")
        SECURITY_RESOURCE_ACCESS("securityResourceAccess"),
        ;

        private String value;

        EventType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}