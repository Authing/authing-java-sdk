package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserOfPublicAccountBatchReqDto {
    /**
     * 用户的唯一标志，可以是用户 ID、用户名、邮箱、手机号、externalId、在外部身份源的 ID，详情见 userIdType 字段的说明。默认为用户 id 。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 用户 ID 数组
     */
    @JsonProperty("publicAccountIds")
    private List<String> publicAccountIds;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getPublicAccountIds() {
        return publicAccountIds;
    }
    public void setPublicAccountIds(List<String> publicAccountIds) {
        this.publicAccountIds = publicAccountIds;
    }



}