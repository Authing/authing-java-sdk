package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSyncTaskDto {
    /**
     * 字段映射配置
     */
    @JsonProperty("fieldMapping")
    private List<SyncTaskFieldMapping> fieldMapping;
    /**
     * 同步任务触发类型：
     * - `manually`: 手动触发执行
     * - `timed`: 定时触发
     * - `automatic`: 根据事件自动触发
     *
     */
    @JsonProperty("syncTaskTrigger")
    private SyncTaskTrigger syncTaskTrigger;
    /**
     * 同步任务数据流向：
     * - `upstream`: 作为上游，将数据同步到 Authing
     * - `downstream`: 作为下游，将 Authing 数据同步到此系统
     *
     */
    @JsonProperty("syncTaskFlow")
    private SyncTaskFlow syncTaskFlow;
    /**
     * 同步任务配置信息
     */
    @JsonProperty("clientConfig")
    private SyncTaskClientConfig clientConfig;
    /**
     * 同步任务类型:
     * - `lark`: 飞书
     * - `lark-international`: 飞书国际版
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `active-directory`: Windows AD
     * - `ldap`: LDAP
     * - `italent`: 北森
     * - `maycur`: 每刻报销
     * - `moka`: Moka
     * - `fxiaoke`: 纷享销客
     * - `xiaoshouyi`: 销售易
     * - `kayang`: 嘉扬 HR
     * - `scim`: 自定义同步源
     *
     */
    @JsonProperty("syncTaskType")
    private SyncTaskType syncTaskType;
    /**
     * 同步任务名称
     */
    @JsonProperty("syncTaskName")
    private String syncTaskName;
    /**
     * 此同步任务绑定的组织机构。针对上游同步，需执行一次同步任务之后才会绑定组织机构；针对下游同步，创建同步任务的时候就需要设置。
     */
    @JsonProperty("organizationCode")
    private String organizationCode;
    /**
     * 同步范围，**只针对下游同步任务有效**。为空表示同步整个组织机构。
     */
    @JsonProperty("provisioningScope")
    private SyncTaskProvisioningScope provisioningScope;
    /**
     * 定时同步时间设置
     */
    @JsonProperty("timedScheduler")
    private SyncTaskTimedScheduler timedScheduler;

    public List<SyncTaskFieldMapping> getFieldMapping() {
        return fieldMapping;
    }
    public void setFieldMapping(List<SyncTaskFieldMapping> fieldMapping) {
        this.fieldMapping = fieldMapping;
    }

    public SyncTaskTrigger getSyncTaskTrigger() {
        return syncTaskTrigger;
    }
    public void setSyncTaskTrigger(SyncTaskTrigger syncTaskTrigger) {
        this.syncTaskTrigger = syncTaskTrigger;
    }

    public SyncTaskFlow getSyncTaskFlow() {
        return syncTaskFlow;
    }
    public void setSyncTaskFlow(SyncTaskFlow syncTaskFlow) {
        this.syncTaskFlow = syncTaskFlow;
    }

    public SyncTaskClientConfig getClientConfig() {
        return clientConfig;
    }
    public void setClientConfig(SyncTaskClientConfig clientConfig) {
        this.clientConfig = clientConfig;
    }

    public SyncTaskType getSyncTaskType() {
        return syncTaskType;
    }
    public void setSyncTaskType(SyncTaskType syncTaskType) {
        this.syncTaskType = syncTaskType;
    }

    public String getSyncTaskName() {
        return syncTaskName;
    }
    public void setSyncTaskName(String syncTaskName) {
        this.syncTaskName = syncTaskName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }
    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public SyncTaskProvisioningScope getProvisioningScope() {
        return provisioningScope;
    }
    public void setProvisioningScope(SyncTaskProvisioningScope provisioningScope) {
        this.provisioningScope = provisioningScope;
    }

    public SyncTaskTimedScheduler getTimedScheduler() {
        return timedScheduler;
    }
    public void setTimedScheduler(SyncTaskTimedScheduler timedScheduler) {
        this.timedScheduler = timedScheduler;
    }


    /**
     * 同步任务类型:
     * - `lark`: 飞书
     * - `lark-international`: 飞书国际版
     * - `wechatwork`: 企业微信
     * - `dingtalk`: 钉钉
     * - `active-directory`: Windows AD
     * - `ldap`: LDAP
     * - `italent`: 北森
     * - `maycur`: 每刻报销
     * - `moka`: Moka
     * - `fxiaoke`: 纷享销客
     * - `xiaoshouyi`: 销售易
     * - `kayang`: 嘉扬 HR
     * - `scim`: 自定义同步源
     *
     */
    public static enum SyncTaskType {

        @JsonProperty("lark")
        LARK("lark"),

        @JsonProperty("lark-international")
        LARK_INTERNATIONAL("lark-international"),

        @JsonProperty("wechatwork")
        WECHATWORK("wechatwork"),

        @JsonProperty("dingtalk")
        DINGTALK("dingtalk"),

        @JsonProperty("active-directory")
        ACTIVE_DIRECTORY("active-directory"),

        @JsonProperty("italent")
        ITALENT("italent"),

        @JsonProperty("maycur")
        MAYCUR("maycur"),

        @JsonProperty("ldap")
        LDAP("ldap"),

        @JsonProperty("moka")
        MOKA("moka"),

        @JsonProperty("fxiaoke")
        FXIAOKE("fxiaoke"),

        @JsonProperty("scim")
        SCIM("scim"),

        @JsonProperty("xiaoshouyi")
        XIAOSHOUYI("xiaoshouyi"),

        @JsonProperty("kayang")
        KAYANG("kayang"),

        @JsonProperty("custom")
        CUSTOM("custom"),
        ;

        private String value;

        SyncTaskType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 同步任务数据流向：
     * - `upstream`: 作为上游，将数据同步到 Authing
     * - `downstream`: 作为下游，将 Authing 数据同步到此系统
     *
     */
    public static enum SyncTaskFlow {

        @JsonProperty("upstream")
        UPSTREAM("upstream"),

        @JsonProperty("downstream")
        DOWNSTREAM("downstream"),
        ;

        private String value;

        SyncTaskFlow(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 同步任务触发类型：
     * - `manually`: 手动触发执行
     * - `timed`: 定时触发
     * - `automatic`: 根据事件自动触发
     *
     */
    public static enum SyncTaskTrigger {

        @JsonProperty("manually")
        MANUALLY("manually"),

        @JsonProperty("timed")
        TIMED("timed"),

        @JsonProperty("automatic")
        AUTOMATIC("automatic"),
        ;

        private String value;

        SyncTaskTrigger(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}