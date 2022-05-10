package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteNamespaceDto {
    /**
     * 权限分组唯一标志符
     */
    @JsonProperty("getCode")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }



}