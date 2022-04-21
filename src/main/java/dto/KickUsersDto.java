package dto;


public class KickUsersDto {
    /**
     * APP ID 集合
     */
    private Array<string> appIds
    /**
     * 用户 ID
     */
    private String userId

    public Array<string> getAppIds() {
        return appIds;
    }
    public void setAppIds(Array<string> appIds) {
        this.appIds = appIds;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

};