package cn.authing.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SendUserResetPasswordEmailLinkBatchDto {

    @JsonProperty("users")
    private List<SendUserResetPasswordEmailLinkDto> users;


    public List<SendUserResetPasswordEmailLinkDto> getUsers() {
        return users;
    }
    public void setUsers(List<SendUserResetPasswordEmailLinkDto> users) {
        this.users = users;
    }
}
