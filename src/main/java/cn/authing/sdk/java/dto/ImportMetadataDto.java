package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportMetadataDto {
    /**
     * 导入的 json 文件地址
     */
    @JsonProperty("file")
    private String file;

    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }



}