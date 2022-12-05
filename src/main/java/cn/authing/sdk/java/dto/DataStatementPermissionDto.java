package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DataStatementPermissionDto {
    /**
     * 数据资源权限操作：ALLOW（允许）/DENY（拒绝）
     */
    @JsonProperty("effect")
    private Effect effect;
    /**
     * 资源权限列表，字符串数据资源和字符串数据资源，没有 path 路径，默认表达是 [‘namespaceCode/strResourceCode/action’]
     */
    @JsonProperty("dataPermissions")
    private List<String> dataPermissions;

    public Effect getEffect() {
        return effect;
    }
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public List<String> getDataPermissions() {
        return dataPermissions;
    }
    public void setDataPermissions(List<String> dataPermissions) {
        this.dataPermissions = dataPermissions;
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