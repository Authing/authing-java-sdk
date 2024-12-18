package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AliExmailEmailProviderConfig {
    /**
     * 用户名
     */
    @JsonProperty("sender")
    private String sender;
    /**
     * 密码
     */
    @JsonProperty("senderPass")
    private String senderPass;

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSenderPass() {
        return senderPass;
    }
    public void setSenderPass(String senderPass) {
        this.senderPass = senderPass;
    }



}