package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class IsUserExistsDto {
    /**
     * 用户是否存在
     */
    @JsonProperty("getExists")
    private Boolean exists;

    public Boolean getExists() {
        return exists;
    }
    public void setExists(Boolean exists) {
        this.exists = exists;
    }



}