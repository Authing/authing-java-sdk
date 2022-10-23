package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePipelineFunctionDto {
    /**
     * Pipeline 函数 ID
     */
    @JsonProperty("funcId")
    private String funcId;

    public String getFuncId() {
        return funcId;
    }
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }



}