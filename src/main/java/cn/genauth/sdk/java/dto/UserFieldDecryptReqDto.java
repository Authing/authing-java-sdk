package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFieldDecryptReqDto {
    /**
     * 用户需要解密的属性列表
     */
    @JsonProperty("data")
    private List<UserFieldDecryptReqItemDto> data;
    /**
     * 私钥，通过控制台安全设置-数据安全-数据加密获取
     */
    @JsonProperty("privateKey")
    private String privateKey;

    public List<UserFieldDecryptReqItemDto> getData() {
        return data;
    }
    public void setData(List<UserFieldDecryptReqItemDto> data) {
        this.data = data;
    }

    public String getPrivateKey() {
        return privateKey;
    }
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }



}