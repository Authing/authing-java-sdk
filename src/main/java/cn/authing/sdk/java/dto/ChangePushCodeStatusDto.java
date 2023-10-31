package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ChangePushCodeStatusDto {
    /**
     * 修改推送码状态的动作:
     * - `CONFIRM`: 修改推送码状态为已授权；
     * - `CANCEL`: 修改推送码状态为已取消；
     *
     */
    @JsonProperty("action")
    private Action action;
    /**
     * 推送码（推送登录唯一 ID）
     */
    @JsonProperty("pushCodeId")
    private String pushCodeId;

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }

    public String getPushCodeId() {
        return pushCodeId;
    }
    public void setPushCodeId(String pushCodeId) {
        this.pushCodeId = pushCodeId;
    }


    /**
     * 修改推送码状态的动作:
     * - `CONFIRM`: 修改推送码状态为已授权；
     * - `CANCEL`: 修改推送码状态为已取消；
     *
     */
    public static enum Action {

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