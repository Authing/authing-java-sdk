package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOperateModelDto {
    /**
     * 图标
     */
    @JsonProperty("icon")
    private String icon;
    /**
     * 操作配置
     */
    @JsonProperty("config")
    private Object config;
    /**
     * 操作名称
     */
    @JsonProperty("operateName")
    private String operateName;
    /**
     * 操作 Key 值
     */
    @JsonProperty("operateKey")
    private String operateKey;
    /**
     * 是否展示:
     * - true: 展示
     * - true: 不展示
     *
     */
    @JsonProperty("show")
    private Boolean show;
    /**
     * modelId
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * id
     */
    @JsonProperty("id")
    private String id;

    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getConfig() {
        return config;
    }
    public void setConfig(Object config) {
        this.config = config;
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

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }



}