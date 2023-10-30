package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetPublicAccountBatchReqDto {
    /**
     * 用户唯一标志，可以是用户 ID、用户名、邮箱、手机号、外部 ID、在外部身份源的 ID。
     */
    @JsonProperty("publicAccountId")
    private String publicAccountId;
    /**
     * 用户 ID 数组
     */
    @JsonProperty("userIds")
    private List<String> userIds;

    public String getPublicAccountId() {
        return publicAccountId;
    }
    public void setPublicAccountId(String publicAccountId) {
        this.publicAccountId = publicAccountId;
    }

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}