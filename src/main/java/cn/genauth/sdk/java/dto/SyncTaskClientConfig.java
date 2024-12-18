package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SyncTaskClientConfig {
    /**
     * 飞书同步任务配置
     */
    @JsonProperty("larkConfig")
    private SyncTaskLarkClientConfig larkConfig;
    /**
     * 飞书(国际版)同步任务配置
     */
    @JsonProperty("larkInternationalConfig")
    private SyncTaskLarkClientConfig larkInternationalConfig;
    /**
     * 企业微信同步任务配置
     */
    @JsonProperty("wechatworkConfig")
    private SyncTaskWechatworkClientConfig wechatworkConfig;
    /**
     * 钉钉同步任务配置
     */
    @JsonProperty("dingtalkConfig")
    private SyncTaskDingtalkClientConfig dingtalkConfig;
    /**
     * Moka 同步任务配置
     */
    @JsonProperty("mokaConfig")
    private SyncTaskMokaClientConfig mokaConfig;
    /**
     * 自定义同步源同步任务配置
     */
    @JsonProperty("scimConfig")
    private SyncTaskScimClientConfig scimConfig;
    /**
     * Windows AD 同步任务配置
     */
    @JsonProperty("activeDirectoryConfig")
    private SyncTaskActiveDirectoryClientConfig activeDirectoryConfig;
    /**
     * LDAP 同步任务配置
     */
    @JsonProperty("ldapConfig")
    private SyncTaskLdapClientConfig ldapConfig;
    /**
     * 北森同步任务配置
     */
    @JsonProperty("italentConfig")
    private SyncTaskItalentClientConfig italentConfig;
    /**
     * 每刻报销同步任务配置
     */
    @JsonProperty("maycurConfig")
    private SyncTaskMaycurClientConfig maycurConfig;
    /**
     * 纷享销客同步任务配置
     */
    @JsonProperty("fxiaokeConfig")
    private SyncTaskFxiaokeClientConfig fxiaokeConfig;
    /**
     * 销售易同步任务配置
     */
    @JsonProperty("xiaoshouyiConfig")
    private SyncTaskXiaoshouyiClientConfig xiaoshouyiConfig;
    /**
     * 嘉扬同步任务配置
     */
    @JsonProperty("kayangConfig")
    private SyncTaskKayangClientConfig kayangConfig;

    public SyncTaskLarkClientConfig getLarkConfig() {
        return larkConfig;
    }
    public void setLarkConfig(SyncTaskLarkClientConfig larkConfig) {
        this.larkConfig = larkConfig;
    }

    public SyncTaskLarkClientConfig getLarkInternationalConfig() {
        return larkInternationalConfig;
    }
    public void setLarkInternationalConfig(SyncTaskLarkClientConfig larkInternationalConfig) {
        this.larkInternationalConfig = larkInternationalConfig;
    }

    public SyncTaskWechatworkClientConfig getWechatworkConfig() {
        return wechatworkConfig;
    }
    public void setWechatworkConfig(SyncTaskWechatworkClientConfig wechatworkConfig) {
        this.wechatworkConfig = wechatworkConfig;
    }

    public SyncTaskDingtalkClientConfig getDingtalkConfig() {
        return dingtalkConfig;
    }
    public void setDingtalkConfig(SyncTaskDingtalkClientConfig dingtalkConfig) {
        this.dingtalkConfig = dingtalkConfig;
    }

    public SyncTaskMokaClientConfig getMokaConfig() {
        return mokaConfig;
    }
    public void setMokaConfig(SyncTaskMokaClientConfig mokaConfig) {
        this.mokaConfig = mokaConfig;
    }

    public SyncTaskScimClientConfig getScimConfig() {
        return scimConfig;
    }
    public void setScimConfig(SyncTaskScimClientConfig scimConfig) {
        this.scimConfig = scimConfig;
    }

    public SyncTaskActiveDirectoryClientConfig getActiveDirectoryConfig() {
        return activeDirectoryConfig;
    }
    public void setActiveDirectoryConfig(SyncTaskActiveDirectoryClientConfig activeDirectoryConfig) {
        this.activeDirectoryConfig = activeDirectoryConfig;
    }

    public SyncTaskLdapClientConfig getLdapConfig() {
        return ldapConfig;
    }
    public void setLdapConfig(SyncTaskLdapClientConfig ldapConfig) {
        this.ldapConfig = ldapConfig;
    }

    public SyncTaskItalentClientConfig getItalentConfig() {
        return italentConfig;
    }
    public void setItalentConfig(SyncTaskItalentClientConfig italentConfig) {
        this.italentConfig = italentConfig;
    }

    public SyncTaskMaycurClientConfig getMaycurConfig() {
        return maycurConfig;
    }
    public void setMaycurConfig(SyncTaskMaycurClientConfig maycurConfig) {
        this.maycurConfig = maycurConfig;
    }

    public SyncTaskFxiaokeClientConfig getFxiaokeConfig() {
        return fxiaokeConfig;
    }
    public void setFxiaokeConfig(SyncTaskFxiaokeClientConfig fxiaokeConfig) {
        this.fxiaokeConfig = fxiaokeConfig;
    }

    public SyncTaskXiaoshouyiClientConfig getXiaoshouyiConfig() {
        return xiaoshouyiConfig;
    }
    public void setXiaoshouyiConfig(SyncTaskXiaoshouyiClientConfig xiaoshouyiConfig) {
        this.xiaoshouyiConfig = xiaoshouyiConfig;
    }

    public SyncTaskKayangClientConfig getKayangConfig() {
        return kayangConfig;
    }
    public void setKayangConfig(SyncTaskKayangClientConfig kayangConfig) {
        this.kayangConfig = kayangConfig;
    }



}