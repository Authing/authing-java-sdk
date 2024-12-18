package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserPasswordCiphertextDataDto {
    /**
     * 用户密码加密的密文
     */
    @JsonProperty("ciphertext")
    private String ciphertext;

    public String getCiphertext() {
        return ciphertext;
    }
    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }



}