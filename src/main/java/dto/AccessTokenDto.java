package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class AccessTokenDto {
    /**
     * Access Token 内容
     */
    @JsonProperty("getAccess_token")
    private String access_token;
    /**
     * token 有效时间
     */
    @JsonProperty("getExpires_in")
    private Integer expires_in;

    public String getAccess_token() {
        return access_token;
    }
    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_in() {
        return expires_in;
    }
    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }



}