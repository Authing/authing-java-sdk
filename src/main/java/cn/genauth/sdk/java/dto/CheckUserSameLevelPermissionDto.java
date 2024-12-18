package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckUserSameLevelPermissionDto {
    /**
     * 当前树资源路径子节点 Code
     */
    @JsonProperty("resourceNodeCodes")
    private List<String> resourceNodeCodes;
    /**
     * 树资源路径,允许多层级路径，示例如下所示
     * - treeResourceCode
     * - treeResourceCode/structCode
     * - treeResourceCode/structCode/struct1Code
     * - treeResourceCode/.../structCode
     */
    @JsonProperty("resource")
    private String resource;
    /**
     * 数据资源权限操作
     */
    @JsonProperty("action")
    private String action;
    /**
     * 用户 ID
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 权限空间 Code
     */
    @JsonProperty("namespaceCode")
    private String namespaceCode;
    /**
     * 是否开启条件判断，默认 false 不开启
     */
    @JsonProperty("judgeConditionEnabled")
    private Boolean judgeConditionEnabled;
    /**
     * 条件环境属性，若开启条件判断则使用
     */
    @JsonProperty("authEnvParams")
    private AuthEnvParams authEnvParams;

    public List<String> getResourceNodeCodes() {
        return resourceNodeCodes;
    }
    public void setResourceNodeCodes(List<String> resourceNodeCodes) {
        this.resourceNodeCodes = resourceNodeCodes;
    }

    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
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