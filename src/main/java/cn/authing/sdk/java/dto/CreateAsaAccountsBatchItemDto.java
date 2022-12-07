package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAsaAccountsBatchItemDto {
    /**
     * 账号信息，一般为包含 "account", "password" key 的键值对
     */
    @JsonProperty("accountInfo")
    private Object accountInfo;

    public Object getAccountInfo() {
        return accountInfo;
    }
    public void setAccountInfo(Object accountInfo) {
        this.accountInfo = accountInfo;
    }



}