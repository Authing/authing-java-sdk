package cn.authing.sdk.java.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CodeChallengeDigestParam {

    @JsonProperty("code_challenge")
    private String codeChallenge;

    private String method;

    public CodeChallengeDigestParam() {
    }

    public CodeChallengeDigestParam(String codeChallenge, String method) {
        this.codeChallenge = codeChallenge;
        this.method = method;
    }

    public String getCodeChallenge() {
        return codeChallenge;
    }

    public void setCodeChallenge(String codeChallenge) {
        this.codeChallenge = codeChallenge;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "CodeChallengeDigestParam{" +
                "codeChallenge='" + codeChallenge + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
