package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UploadDto {
    /**
     * 上传的目录
     */
    @JsonProperty("folder")
    private String folder;
    /**
     * 是否为私有资源
     */
    @JsonProperty("isPrivate")
    private Boolean isPrivate;

    public String getFolder() {
        return folder;
    }
    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getIsPrivate() {
        return isPrivate;
    }
    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }



}