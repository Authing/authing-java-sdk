package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PublicKeyCredentialParametersDto {
    /**
     * 一个负整数，用于标明算法
     */
    @JsonProperty("alg")
    private Integer alg;
    /**
     * 固定值，public-key
     */
    @JsonProperty("type")
    private String type;

    public Integer getAlg() {
        return alg;
    }
    public void setAlg(Integer alg) {
        this.alg = alg;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }



}