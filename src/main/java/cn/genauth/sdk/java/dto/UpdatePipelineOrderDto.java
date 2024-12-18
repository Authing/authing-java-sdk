package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePipelineOrderDto {
    /**
     * 新的排序方式，按照函数 ID 的先后顺序进行排列。
     */
    @JsonProperty("order")
    private List<String> order;
    /**
     * 函数的触发场景：
     * - `PRE_REGISTER`: 注册前
     * - `POST_REGISTER`: 注册后
     * - `PRE_AUTHENTICATION`: 认证前
     * - `POST_AUTHENTICATION`: 认证后
     * - `PRE_OIDC_ID_TOKEN_ISSUED`: OIDC ID Token 签发前
     * - `PRE_OIDC_ACCESS_TOKEN_ISSUED`: OIDC Access Token 签发前
     * - `PRE_COMPLETE_USER_INFO`: 补全用户信息前
     *
     */
    @JsonProperty("scene")
    private Scene scene;

    public List<String> getOrder() {
        return order;
    }
    public void setOrder(List<String> order) {
        this.order = order;
    }

    public Scene getScene() {
        return scene;
    }
    public void setScene(Scene scene) {
        this.scene = scene;
    }


    /**
     * 函数的触发场景：
     * - `PRE_REGISTER`: 注册前
     * - `POST_REGISTER`: 注册后
     * - `PRE_AUTHENTICATION`: 认证前
     * - `POST_AUTHENTICATION`: 认证后
     * - `PRE_OIDC_ID_TOKEN_ISSUED`: OIDC ID Token 签发前
     * - `PRE_OIDC_ACCESS_TOKEN_ISSUED`: OIDC Access Token 签发前
     * - `PRE_COMPLETE_USER_INFO`: 补全用户信息前
     *
     */
    public static enum Scene {

        @JsonProperty("PRE_REGISTER")
        PRE_REGISTER("PRE_REGISTER"),

        @JsonProperty("POST_REGISTER")
        POST_REGISTER("POST_REGISTER"),

        @JsonProperty("PRE_AUTHENTICATION")
        PRE_AUTHENTICATION("PRE_AUTHENTICATION"),

        @JsonProperty("POST_AUTHENTICATION")
        POST_AUTHENTICATION("POST_AUTHENTICATION"),

        @JsonProperty("PRE_OIDC_ID_TOKEN_ISSUED")
        PRE_OIDC_ID_TOKEN_ISSUED("PRE_OIDC_ID_TOKEN_ISSUED"),

        @JsonProperty("PRE_OIDC_ACCESS_TOKEN_ISSUED")
        PRE_OIDC_ACCESS_TOKEN_ISSUED("PRE_OIDC_ACCESS_TOKEN_ISSUED"),

        @JsonProperty("PRE_COMPLETE_USER_INFO")
        PRE_COMPLETE_USER_INFO("PRE_COMPLETE_USER_INFO"),

        @JsonProperty("PRE_MFA_VERIFY")
        PRE_MFA_VERIFY("PRE_MFA_VERIFY"),

        @JsonProperty("POST_MFA_VERIFY")
        POST_MFA_VERIFY("POST_MFA_VERIFY"),
        ;

        private String value;

        Scene(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}