package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RightItemDto {
    /**
     * 权益编码
     */
    @JsonProperty("rightsModelCode")
    private String rightsModelCode;
    /**
     * 权益名称
     */
    @JsonProperty("rightsModelName")
    private String rightsModelName;
    /**
     * 权益数据类型
     */
    @JsonProperty("dataType")
    private String dataType;
    /**
     * 权益值
     */
    @JsonProperty("dataValue")
    private String dataValue;

    public String getRightsModelCode() {
        return rightsModelCode;
    }
    public void setRightsModelCode(String rightsModelCode) {
        this.rightsModelCode = rightsModelCode;
    }

    public String getRightsModelName() {
        return rightsModelName;
    }
    public void setRightsModelName(String rightsModelName) {
        this.rightsModelName = rightsModelName;
    }

    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getDataValue() {
        return dataValue;
    }
    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }



}