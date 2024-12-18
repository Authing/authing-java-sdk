package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListPipelineFunctionsDto {
    /**
     * 通过函数的触发场景进行筛选（可选，默认返回所有）：
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
    private String scene;

    public String getScene() {
        return scene;
    }
    public void setScene(String scene) {
        this.scene = scene;
    }



}