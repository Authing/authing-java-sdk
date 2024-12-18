package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetApplicationPermissionStrategyDataDto {
    /**
     * 应用访问授权策略
     */
    @JsonProperty("permissionStrategy")
    private PermissionStrategy permissionStrategy;

    public PermissionStrategy getPermissionStrategy() {
        return permissionStrategy;
    }
    public void setPermissionStrategy(PermissionStrategy permissionStrategy) {
        this.permissionStrategy = permissionStrategy;
    }


    /**
     * 应用访问授权策略
     */
    public static enum PermissionStrategy {

        @JsonProperty("ALLOW_ALL")
        ALLOW_ALL("ALLOW_ALL"),

        @JsonProperty("DENY_ALL")
        DENY_ALL("DENY_ALL"),
        ;

        private String value;

        PermissionStrategy(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}