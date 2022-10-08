package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GenerateQrcodeDto {
    /**
     * 二维码类型。当前支持三种类型：
     * - `MOBILE_APP`: 自建移动端 APP 扫码
     * - `WECHAT_MINIPROGRAM`: 微信小程序扫码
     * - `WECHAT_OFFICIAL_ACCOUN` 关注微信公众号扫码
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 当 `type` 为 `WECHAT_MINIPROGRAM` 或 `WECHAT_OFFICIAL_ACCOUNT` 时，可以指定身份源连接，否则默认使用应用开启的第一个对应身份源连接生成二维码。
     */
    @JsonProperty("extIdpConnId")
    private String extIdpConnId;
    /**
     * 当 `type` 为 `MOBILE_APP` 时，可以传递用户的自定义数据，当用户成功扫码授权时，会将此数据存入用户的自定义数据。
     */
    @JsonProperty("customData")
    private Object customData;
    /**
     * 当 type 为 `WECHAT_OFFICIAL_ACCOUNT` 或 `WECHAT_MINIPROGRAM` 时，指定自定义的 pipeline 上下文，将会传递的 pipeline 的 context 中
     */
    @JsonProperty("context")
    private Object context;
    /**
     * 当 type 为 `WECHAT_MINIPROGRAM` 时，是否将自定义的 logo 自动合并到生成的图片上，默认为 false。服务器合并二维码的过程会加大接口响应速度，推荐使用默认值，在客户端对图片进行拼接。如果你使用 Authing 的 SDK，可以省去手动拼接的过程。
     */
    @JsonProperty("autoMergeQrCode")
    private Boolean autoMergeQrCode;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getExtIdpConnId() {
        return extIdpConnId;
    }
    public void setExtIdpConnId(String extIdpConnId) {
        this.extIdpConnId = extIdpConnId;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }

    public Object getContext() {
        return context;
    }
    public void setContext(Object context) {
        this.context = context;
    }

    public Boolean getAutoMergeQrCode() {
        return autoMergeQrCode;
    }
    public void setAutoMergeQrCode(Boolean autoMergeQrCode) {
        this.autoMergeQrCode = autoMergeQrCode;
    }


    /**
     * 二维码类型。当前支持三种类型：
     * - `MOBILE_APP`: 自建移动端 APP 扫码
     * - `WECHAT_MINIPROGRAM`: 微信小程序扫码
     * - `WECHAT_OFFICIAL_ACCOUN` 关注微信公众号扫码
     */
    public static enum Type {

        @JsonProperty("MOBILE_APP")
        MOBILE_APP("MOBILE_APP"),

        @JsonProperty("WECHAT_MINIPROGRAM")
        WECHAT_MINIPROGRAM("WECHAT_MINIPROGRAM"),

        @JsonProperty("WECHAT_OFFICIAL_ACCOUNT")
        WECHAT_OFFICIAL_ACCOUNT("WECHAT_OFFICIAL_ACCOUNT"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}