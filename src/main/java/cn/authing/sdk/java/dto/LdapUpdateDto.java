package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LdapUpdateDto {
    /**
     * bindDn 密码
     */
    @JsonProperty("bindPwd")
    private String bindPwd;

    public String getBindPwd() {
        return bindPwd;
    }
    public void setBindPwd(String bindPwd) {
        this.bindPwd = bindPwd;
    }



}