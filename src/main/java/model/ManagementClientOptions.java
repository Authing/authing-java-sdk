package model;

import enums.LanguageEnum;
import okhttp3.Headers;

public class ManagementClientOptions {

    /** 用户池 ID **/
    private String accessKeyId;

    /** 用户池/应用密钥 **/
    private String accessKeySecret;

    /** 租户 ID **/
    private String tenantId;

    /** 超时时间 */
    private int timeout = 10000;

    /** 请求来源 */
    private String requestFrom;

    /** 语言 */
    private LanguageEnum lang = LanguageEnum.CHINESE;

    /** Authing 服务器地址 */
    private String host = "https://core.authing.cn";

    public ManagementClientOptions() {}

    public ManagementClientOptions(String accessKeyId, String accessKeySecret) {
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getRequestFrom() {
        return requestFrom;
    }

    public void setRequestFrom(String requestFrom) {
        this.requestFrom = requestFrom;
    }

    public LanguageEnum getLang() {
        return lang;
    }

    public void setLang(LanguageEnum lang) {
        this.lang = lang;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
