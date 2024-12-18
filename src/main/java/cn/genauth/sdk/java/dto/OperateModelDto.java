package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OperateModelDto {
    /**
     * 操作 id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 用户池 id
     */
    @JsonProperty("userPoolId")
    private String userPoolId;
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 操作名称
     */
    @JsonProperty("operateName")
    private String operateName;
    /**
     * 操作方法 key
     */
    @JsonProperty("operateKey")
    private String operateKey;
    /**
     * 是否展示:
     * - true: 展示
     * - false: 不展示
     *
     */
    @JsonProperty("show")
    private Boolean show;
    /**
     * 是否为默认操作:
     * - true 是默认操作
     * - fasle 不是默认操作
     *
     */
    @JsonProperty("isDefault")
    private Boolean isDefault;
    /**
     * 创建时间
     */
    @JsonProperty("createdAt")
    private String createdAt;
    /**
     * 更新时间
     */
    @JsonProperty("updatedAt")
    private String updatedAt;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserPoolId() {
        return userPoolId;
    }
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getOperateName() {
        return operateName;
    }
    public void setOperateName(String operateName) {
        this.operateName = operateName;
    }

    public String getOperateKey() {
        return operateKey;
    }
    public void setOperateKey(String operateKey) {
        this.operateKey = operateKey;
    }

    public Boolean getShow() {
        return show;
    }
    public void setShow(Boolean show) {
        this.show = show;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }



}