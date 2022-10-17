package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SyncTaskActiveDirectoryClientConfig {
    /**
     * 身份源唯一标志
     */
    @JsonProperty("syncIdentityProviderCode")
    private String syncIdentityProviderCode;
    /**
     * Provisioning Ticket Url
     */
    @JsonProperty("ticket_url")
    private String ticketUrl;

    public String getSyncIdentityProviderCode() {
        return syncIdentityProviderCode;
    }
    public void setSyncIdentityProviderCode(String syncIdentityProviderCode) {
        this.syncIdentityProviderCode = syncIdentityProviderCode;
    }

    public String getTicketUrl() {
        return ticketUrl;
    }
    public void setTicketUrl(String ticketUrl) {
        this.ticketUrl = ticketUrl;
    }



}