package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class IsUserExistsReqDto {
    /**
     * 用户名，用户池内唯一
     */
    @JsonProperty("getUsername")
    private String username;
    /**
     * 邮箱
     */
    @JsonProperty("getEmail")
    private String email;
    /**
     * 手机号
     */
    @JsonProperty("getPhone")
    private String phone;
    /**
     * 第三方外部 ID
     */
    @JsonProperty("getExternalId")
    private String externalId;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }



}