package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GetUserSelectLoginPublicAccountsOriginUserDto;
import cn.authing.sdk.java.dto.ListPublicAccountDataDto;

public class GetUserSelectLoginPublicAccountsDataDto {
    /**
     * 公共账号列表
     */
    @JsonProperty("publicAccounts")
    private List<ListPublicAccountDataDto> publicAccounts;
    /**
     * 个人账号信息
     */
    @JsonProperty("originUser")
    private GetUserSelectLoginPublicAccountsOriginUserDto originUser;

    public List<ListPublicAccountDataDto> getPublicAccounts() {
        return publicAccounts;
    }
    public void setPublicAccounts(List<ListPublicAccountDataDto> publicAccounts) {
        this.publicAccounts = publicAccounts;
    }

    public GetUserSelectLoginPublicAccountsOriginUserDto getOriginUser() {
        return originUser;
    }
    public void setOriginUser(GetUserSelectLoginPublicAccountsOriginUserDto originUser) {
        this.originUser = originUser;
    }



}