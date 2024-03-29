package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.AuthEnvParams;

public class CheckExternalUserPermissionDto {
    /**
     * 资源路径列表,**树资源需到具体树节点**
     */
    @JsonProperty("resources")
    private List<String> resources;
    /**
     * 数据资源权限操作, read、get、write 等动作
     */
    @JsonProperty("action")
    private String action;
    /**
     * 外部用户 ID
     */
    @JsonProperty("externalId")
    private String externalId;
    /**
     * 权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 是否开启条件判断，默认 true 开启
     */
    @JsonProperty("judgeConditionEnabled")
    private Boolean judgeConditionEnabled;
    /**
     * 条件环境属性，若开启条件判断则使用
     */
    @JsonProperty("authEnvParams")
    private AuthEnvParams authEnvParams;

    public List<String> getResources() {
        return resources;
    }
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }
    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode;
    }

    public Boolean getJudgeConditionEnabled() {
        return judgeConditionEnabled;
    }
    public void setJudgeConditionEnabled(Boolean judgeConditionEnabled) {
        this.judgeConditionEnabled = judgeConditionEnabled;
    }

    public AuthEnvParams getAuthEnvParams() {
        return authEnvParams;
    }
    public void setAuthEnvParams(AuthEnvParams authEnvParams) {
        this.authEnvParams = authEnvParams;
    }



}