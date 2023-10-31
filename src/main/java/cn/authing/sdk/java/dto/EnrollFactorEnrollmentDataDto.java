package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class EnrollFactorEnrollmentDataDto {
    /**
     * 绑定短信、邮箱验证码、OTP 类型的认证要素时，需要传此参数。值为短信/邮箱/OTP 验证码。
     */
    @JsonProperty("passCode")
    private String passCode;
    /**
     * 绑定 FACE 类型的认证要素时，需要传此参数。值为绑定人脸图片链接。
     */
    @JsonProperty("photo")
    private String photo;
    /**
     * 绑定 FACE 类型的认证要素时，需要传此参数。是否是外部链接图片。
     */
    @JsonProperty("isExternalPhoto")
    private Boolean isExternalPhoto;

    public String getPassCode() {
        return passCode;
    }
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }

    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getIsExternalPhoto() {
        return isExternalPhoto;
    }
    public void setIsExternalPhoto(Boolean isExternalPhoto) {
        this.isExternalPhoto = isExternalPhoto;
    }



}