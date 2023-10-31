package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class QRCodeStatusBriefUserInfoDto {
    /**
     * 用户显示昵称
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * 用户头像
     */
    @JsonProperty("photo")
    private String photo;

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }



}