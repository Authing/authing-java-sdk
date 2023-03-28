package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListApplicationSubjectDataDto {
    /**
     * 应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 应用 logo
     */
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("template")
    private String template;
    /**
     * 应用类型：集成应用/自建应用
     */
    @JsonProperty("appType")
    private AppType appType;
    /**
     * 允许/拒绝
     */
    @JsonProperty("effect")
    private Effect effect;

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getExt() {
        return ext;
    }
    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getTemplate() {
        return template;
    }
    public void setTemplate(String template) {
        this.template = template;
    }

    public AppType getAppType() {
        return appType;
    }
    public void setAppType(AppType appType) {
        this.appType = appType;
    }

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
    }


    /**
     * 应用类型：集成应用/自建应用
     */
    public static enum AppType {

        @JsonProperty("INTEGRATED")
        INTEGRATED("INTEGRATED"),

        @JsonProperty("SELFBUILT")
        SELFBUILT("SELFBUILT"),
        ;

        private String value;

        AppType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 允许/拒绝
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