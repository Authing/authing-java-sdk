package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportModelDto {
    /**
     * 导入的 excel 文件地址
     */
    @JsonProperty("file")
    private String file;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;

    public String getFile() {
        return file;
    }
    public void setFile(String file) {
        this.file = file;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }



}