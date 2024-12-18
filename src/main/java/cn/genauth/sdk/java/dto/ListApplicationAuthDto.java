package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListApplicationAuthDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 当前页数，从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页数目，最大不能超过 50，默认为 10
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 主体名称
     */
    @JsonProperty("targetName")
    private String targetName;
    /**
     * 主体类型列表, USER/ORG/ROLE/GROUP
     */
    @JsonProperty("targetTypeList")
    private List<String> targetTypeList;
    /**
     * 操作，ALLOW/DENY
     */
    @JsonProperty("effect")
    private Effect effect;
    /**
     * 授权是否生效开关,
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getTargetName() {
        return targetName;
    }
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public List<String> getTargetTypeList() {
        return targetTypeList;
    }
    public void setTargetTypeList(List<String> targetTypeList) {
        this.targetTypeList = targetTypeList;
    }

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * 操作，ALLOW/DENY
     */
    public static enum Effect {

        @JsonProperty("ALLOW")
        ALLOW("ALLOW"),

        @JsonProperty("DENY")
        DENY("DENY"),
        ;

        private String value;

        Effect(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}