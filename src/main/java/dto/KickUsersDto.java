package dto;

import java.util.List;


public class KickUsersDto {
    /**
     * APP ID 集合
     */
    private List<string> appIds;
    /**
     * 用户 ID
     */
    private String userId;

    public List<string> getAppIds() {
        return appIds;
    }
    public void setAppIds(List<string> appIds) {
        this.appIds = appIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}