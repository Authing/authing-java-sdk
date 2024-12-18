package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DataStatementPermissionDto {
    /**
     * 数据资源权限操作：ALLOW（允许）/DENY（拒绝）
     */
    @JsonProperty("effect")
    private Effect effect;
    /**
     * 资源权限列表，字符串数据资源和数组数据资源，没有 path 路径
     */
    @JsonProperty("permissions")
    private List<String> permissions;

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public List<String> getPermissions() {
        return permissions;
    }
    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }


    /**
     * 数据资源权限操作：ALLOW（允许）/DENY（拒绝）
     */
    public static enum Effect {

        @JsonProperty("DENY")
        DENY("DENY"),

        @JsonProperty("ALLOW")
        ALLOW("ALLOW"),
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