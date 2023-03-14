package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.FastpassUserInfoDto;

public class GeneFastpassQRCodeInfoDto {
    /**
     * 二维码使用场景。
     */
    @JsonProperty("scene")
    private String scene;
    /**
     * 二维码唯一 ID，可以通过此唯一 ID 查询二维码状态。
     */
    @JsonProperty("qrcodeId")
    private String qrcodeId;
    /**
     * 服务接口 Host 地址
     */
    @JsonProperty("apiHost")
    private String apiHost;
    /**
     * 用户信息
     */
    @JsonProperty("user")
    private FastpassUserInfoDto user;
    /**
     * 当前用户生成二维码时登录的应用 ID
     */
    @JsonProperty("appId")
    private String appId;
    /**
     * 用户池信息
     */
    @JsonProperty("userpool")
    private FastpassUserInfoDto userpool;

    public String getScene() {
        return scene;
    }
    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getQrcodeId() {
        return qrcodeId;
    }
    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }

    public String getApiHost() {
        return apiHost;
    }
    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }

    public FastpassUserInfoDto getUser() {
        return user;
    }
    public void setUser(FastpassUserInfoDto user) {
        this.user = user;
    }

    public String getAppId() {
        return appId;
    }
    public void setAppId(String appId) {
        this.appId = appId;
    }

    public FastpassUserInfoDto getUserpool() {
        return userpool;
    }
    public void setUserpool(FastpassUserInfoDto userpool) {
        this.userpool = userpool;
    }



}