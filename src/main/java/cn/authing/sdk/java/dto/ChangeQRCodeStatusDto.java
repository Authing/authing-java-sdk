package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ChangeQRCodeStatusDto {
    /**
     * 修改二维码状态的动作:
     * - `SCAN`: 修改二维码状态为已扫码状态，当移动 APP 扫了码之后，应当立即执行此操作；
     * - `CONFIRM`: 修改二维码状态为已授权，执行此操作前必须先执行 `SCAN 操作；
     * - `CANCEL`: 修改二维码状态为已取消，执行此操作前必须先执行 `SCAN 操作；
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
     * 修改二维码状态的动作:
     * - `SCAN`: 修改二维码状态为已扫码状态，当移动 APP 扫了码之后，应当立即执行此操作；
     * - `CONFIRM`: 修改二维码状态为已授权，执行此操作前必须先执行 `SCAN 操作；
     * - `CANCEL`: 修改二维码状态为已取消，执行此操作前必须先执行 `SCAN 操作；
     *
     */
    public static enum Action {

        @JsonProperty("SCAN")
        SCAN("SCAN"),

        @JsonProperty("CONFIRM")
        CONFIRM("CONFIRM"),

        @JsonProperty("CANCEL")
        CANCEL("CANCEL"),
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