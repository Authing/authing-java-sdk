package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class KickUsersDto {
    /**
     * APP ID 集合
     */
    @JsonProperty("getAppIds")
    private List<String> appIds;
    /**
     * 用户 ID
     */
    @JsonProperty("getUserId")
    private String userId;

    public List<String> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<String> appIds) {
        this.appIds = appIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}