package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerateLinkExtidpUrlDto {
    /**
     * 外部身份源连接唯一标志
     */
    @JsonProperty("ext_idp_conn_identifier")
    private String extIdpConnIdentifier;
    /**
     * Authing 应用 ID
     */
    @JsonProperty("app_id")
    private String appId;
    /**
     * 用户的 id_token
     */
    @JsonProperty("id_token")
    private String idToken;
    /**
     * 是否使用 URL 重定向的方式返回绑定信息
     */
    @JsonProperty("need_url_redirect")
    private String needUrlRedirect;
    /**
     * 当使用 URL 重定向的方式返回绑定信息时，是否只返回 token 信息，传入此参数，因为某些浏览器会限制 URL 长度
     */
    @JsonProperty("only_redirect_token")
    private String onlyRedirectToken;
    /**
     * 是否使用 form post 的方式返回绑定信息
     */
    @JsonProperty("need_form_post")
    private String needFormPost;
    /**
     * 当使用 URL 重定向或 form post 方式返回绑定信息时，接收信息的 URL
     */
    @JsonProperty("target_url")
    private String targetUrl;

    public String getExtIdpConnIdentifier() {
        return extIdpConnIdentifier;
    }
    public void setExtIdpConnIdentifier(String extIdpConnIdentifier) {
        this.extIdpConnIdentifier = extIdpConnIdentifier;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getIdToken() {
        return idToken;
    }
    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getNeedUrlRedirect() {
        return needUrlRedirect;
    }
    public void setNeedUrlRedirect(String needUrlRedirect) {
        this.needUrlRedirect = needUrlRedirect;
    }

    public String getOnlyRedirectToken() {
        return onlyRedirectToken;
    }
    public void setOnlyRedirectToken(String onlyRedirectToken) {
        this.onlyRedirectToken = onlyRedirectToken;
    }

    public String getNeedFormPost() {
        return needFormPost;
    }
    public void setNeedFormPost(String needFormPost) {
        this.needFormPost = needFormPost;
    }

    public String getTargetUrl() {
        return targetUrl;
    }
    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }



}