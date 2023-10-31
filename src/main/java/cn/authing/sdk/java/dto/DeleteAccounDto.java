package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class DeleteAccounDto {
    /**
     * 注销账户的 token
     */
    @JsonProperty("deleteAccountToken")
    private String deleteAccountToken;

    public String getDeleteAccountToken() {
        return deleteAccountToken;
    }
    public void setDeleteAccountToken(String deleteAccountToken) {
        this.deleteAccountToken = deleteAccountToken;
    }



}