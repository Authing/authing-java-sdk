package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SystemInfoResp {
    /**
     * RSA256 加密配置信息
     */
    @JsonProperty("rsa")
    private SystmeInfoRSAConfig rsa;
    /**
     * 国密 SM2 加密配置信息
     */
    @JsonProperty("sm2")
    private SystmeInfoSM2Config sm2;
    /**
     * 国密 SM2 加密配置信息
     */
    @JsonProperty("version")
    private SystmeInfoVersion version;
    /**
     * Authing 服务对外 IP 列表
     */
    @JsonProperty("publicIps")
    private List<String> publicIps;

    public SystmeInfoRSAConfig getRsa() {
        return rsa;
    }
    public void setRsa(SystmeInfoRSAConfig rsa) {
        this.rsa = rsa;
    }

    public SystmeInfoSM2Config getSm2() {
        return sm2;
    }
    public void setSm2(SystmeInfoSM2Config sm2) {
        this.sm2 = sm2;
    }

    public SystmeInfoVersion getVersion() {
        return version;
    }
    public void setVersion(SystmeInfoVersion version) {
        this.version = version;
    }

    public List<String> getPublicIps() {
        return publicIps;
    }
    public void setPublicIps(List<String> publicIps) {
        this.publicIps = publicIps;
    }



}