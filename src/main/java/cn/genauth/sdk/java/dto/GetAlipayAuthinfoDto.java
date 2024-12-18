package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAlipayAuthinfoDto {
    /**
     * 外部身份源连接标志符
     */
    @JsonProperty("extIdpConnidentifier")
    private String extIdpConnidentifier;

    public String getExtIdpConnidentifier() {
        return extIdpConnidentifier;
    }
    public void setExtIdpConnidentifier(String extIdpConnidentifier) {
        this.extIdpConnidentifier = extIdpConnidentifier;
    }



}