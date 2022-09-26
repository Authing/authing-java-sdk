package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CheckDomainAvailable {
    /**
     * 域名
     */
    @JsonProperty("domain")
    private String domain;

    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }



}