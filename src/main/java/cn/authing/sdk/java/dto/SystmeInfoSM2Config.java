package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SystmeInfoSM2Config {
    /**
     * SM2 公钥
     */
    @JsonProperty("publicKey")
    private String publicKey;

    public String getPublicKey() {
        return publicKey;
    }
    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }



}