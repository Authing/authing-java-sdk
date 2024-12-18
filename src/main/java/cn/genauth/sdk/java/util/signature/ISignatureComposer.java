package cn.genauth.sdk.java.util.signature;

import java.util.Map;

public interface ISignatureComposer {
    /**
     * 生成签名
     * @param method
     * @param uri
     * @param headers
     * @param queries
     * @return
     */
    String composeStringToSign(String method, String uri, Map<String, String> headers, Map<String, String> queries);

    /**
     * 获取 Authorization 的值
     * @param accessKeyId
     * @param accessKeySecret
     * @param stringToSign
     * @return
     */
    String getAuthorization(String accessKeyId, String accessKeySecret, String stringToSign);
}
