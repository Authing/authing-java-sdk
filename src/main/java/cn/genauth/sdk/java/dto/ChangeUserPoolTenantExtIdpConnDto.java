package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ChangeUserPoolTenantExtIdpConnDto {
    /**
     * 是否开启身份源连接
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("connIds")
    private List<String> connIds;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getConnIds() {
        return connIds;
    }
    public void setConnIds(List<String> connIds) {
        this.connIds = connIds;
    }



}