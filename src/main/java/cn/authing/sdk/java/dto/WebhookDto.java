package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WebhookDto {
    /**
     * Webhook ID
     */
    @JsonProperty("webhookId")
    private String webhookId;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;
    /**
     * Webhook 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * Webhook 回调地址
     */
    @JsonProperty("url")
    private String url;
    /**
     * 请求数据格式
     */
    @JsonProperty("contentType")
    private ContentType contentType;
    /**
     * 是否启用
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 用户真实名称，不具备唯一性。 示例值: 张三
     */
    @JsonProperty("events")
    private List<> events;
    /**
     * 请求密钥
     */
    @JsonProperty("secret")
    private String secret;

    public String getWebhookId() {
        return webhookId;
    }
    public void setWebhookId(String webhookId) {
        this.webhookId = webhookId;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public ContentType getContentType() {
        return contentType;
    }
    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<> getEvents() {
        return events;
    }
    public void setEvents(List<> events) {
        this.events = events;
    }

    public String getSecret() {
        return secret;
    }
    public void setSecret(String secret) {
        this.secret = secret;
    }


    /**
     * 请求数据格式
     */
    public static enum ContentType {

        @JsonProperty("application/json")
        APPLICATION_JSON("application/json"),

        @JsonProperty("application/x-www-form-urlencoded")
        APPLICATION_X_WWW_FORM_URLENCODED("application/x-www-form-urlencoded"),
        ;

        private String value;

        ContentType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}