package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class FastpassUserInfoDto {
    /**
     * 用户 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 用户名称
     */
    @JsonProperty("displayName")
    private String displayName;
    /**
     * 用户头像地址
     */
    @JsonProperty("photo")
    private String photo;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

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