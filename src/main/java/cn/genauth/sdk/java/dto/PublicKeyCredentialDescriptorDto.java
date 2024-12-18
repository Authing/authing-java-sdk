package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PublicKeyCredentialDescriptorDto {
    /**
     * 允许的凭证 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 凭证所需的认证器与用户代理的通信方式:
     * - `ble`: 可以通过蓝牙连接的认证器
     * - `internal`: 平台内置的、无法移除的认证器
     * - `nfc`: 可以通过 NFC 连接的认证器
     * - `usb`: 可以通过 USB 连接的认证器
     *
     */
    @JsonProperty("transports")
    private List<String> transports;
    /**
     * 固定值，public-key
     */
    @JsonProperty("type")
    private String type;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTransports() {
        return transports;
    }
    public void setTransports(List<String> transports) {
        this.transports = transports;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}