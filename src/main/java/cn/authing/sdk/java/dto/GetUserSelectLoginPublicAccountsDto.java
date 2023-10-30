package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetUserSelectLoginPublicAccountsDto {
    /**
     * 是否包含当前个人用户基本信息
     */
    @JsonProperty("withOriginUser")
    private Boolean withOriginUser;

    public Boolean getWithOriginUser() {
        return withOriginUser;
    }
    public void setWithOriginUser(Boolean withOriginUser) {
        this.withOriginUser = withOriginUser;
    }



}