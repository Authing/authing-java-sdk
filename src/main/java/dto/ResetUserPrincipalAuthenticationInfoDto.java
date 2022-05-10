package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class ResetUserPrincipalAuthenticationInfoDto {
    /**
     * 用户 ID
     */
    @JsonProperty("getUserId")
    private String userId;

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }



}