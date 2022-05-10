package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class IsSuccessDto {
    /**
     * 操作是否成功
     */
    @JsonProperty("getSuccess")
    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }



}