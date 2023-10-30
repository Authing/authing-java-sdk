package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserFieldDecryptRespItemDto {
    /**
     * 用户唯一标志，可以是用户 ID、用户名、邮箱、手机号、外部 ID、在外部身份源的 ID。
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 字段的key名称，例如 username/phone
     */
    @JsonProperty("fieldName")
    private String fieldName;
    /**
     * 字段解密后的内容
     */
    @JsonProperty("decryptedContent")
    private String decryptedContent;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getDecryptedContent() {
        return decryptedContent;
    }
    public void setDecryptedContent(String decryptedContent) {
        this.decryptedContent = decryptedContent;
    }



}