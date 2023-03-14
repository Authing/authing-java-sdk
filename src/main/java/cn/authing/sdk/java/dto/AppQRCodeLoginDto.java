package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AppQRCodeLoginDto {
    /**
     * APP 扫二维码登录:
     * - `APP_LOGIN`: APP 扫码登录；
     *
     */
    @JsonProperty("action")
    private Action action;
    /**
     * 二维码唯一 ID
     */
    @JsonProperty("qrcodeId")
    private String qrcodeId;

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }

    public String getQrcodeId() {
        return qrcodeId;
    }
    public void setQrcodeId(String qrcodeId) {
        this.qrcodeId = qrcodeId;
    }


    /**
     * APP 扫二维码登录:
     * - `APP_LOGIN`: APP 扫码登录；
     *
     */
    public static enum Action {

        @JsonProperty("APP_LOGIN")
        APP_LOGIN("APP_LOGIN"),
        ;

        private String value;

        Action(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}