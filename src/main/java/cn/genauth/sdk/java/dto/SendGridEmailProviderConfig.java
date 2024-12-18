package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SendGridEmailProviderConfig {
    /**
     * 用户名
     */
    @JsonProperty("sender")
    private String sender;
    /**
     * SendGrid API Key，详情请见 [SendGrid 文档](https://docs.sendgrid.com/ui/account-and-settings/api-keys)。
     */
    @JsonProperty("apikey")
    private String apikey;

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getApikey() {
        return apikey;
    }
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }



}