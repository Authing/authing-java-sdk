package cn.authing.sdk.java.util.signature.Impl;

import cn.authing.sdk.java.util.signature.ISignatureComposer;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;


public class SignatureComposer implements ISignatureComposer {

    private final static String QUERY_SEPARATOR = "&";
    private final static String HEADER_SEPARATOR = "\n";

    private static ISignatureComposer composer = null;
    public static final String ENCODING = "UTF-8";
    private static final String ALGORITHM_NAME = "HmacSHA1";

    public static ISignatureComposer getComposer() {
        if (null == composer) {
            composer = new SignatureComposer();
        }
        return composer;
    }

    @Override()
    public String composeStringToSign(String method, String uri, Map<String, String> headers, Map<String, String> queries) {
        StringBuilder sb = new StringBuilder();

        sb.append(method).append(HEADER_SEPARATOR);
        List<String> list = headers.keySet().stream().sorted().collect(Collectors.toList());
        for (String s : list) {
            sb.append(s).append(":").append(headers.get(s)).append(HEADER_SEPARATOR);
        }

        sb.append(buildQueryString(uri, queries));

        return sb.toString();
    }

    private String[] splitSubResource(String uri) {
        int queIndex = uri.indexOf("?");
        String[] uriParts = new String[2];
        if (-1 != queIndex) {
            uriParts[0] = uri.substring(0, queIndex);
            uriParts[1] = uri.substring(queIndex + 1);
        } else {
            uriParts[0] = uri;
        }
        return uriParts;
    }

    private String buildQueryString(String uri, Map<String, String> queries) {
        String[] uriParts = splitSubResource(uri);
        Map<String, String> sortMap = new TreeMap<>(queries);
        if (null != uriParts[1]) {
            sortMap.put(uriParts[1], null);
        }
        StringBuilder queryBuilder = new StringBuilder(uriParts[0]);
        if (0 < sortMap.size()) {
            queryBuilder.append("?");
        }
        for (Map.Entry<String, String> e : sortMap.entrySet()) {
            queryBuilder.append(e.getKey());

            String value = e.getValue();
            if (value == null || value.isEmpty()) {
                queryBuilder.append(QUERY_SEPARATOR);
                continue;
            }
            queryBuilder.append("=").append(e.getValue()).append(QUERY_SEPARATOR);
        }
        String queryString = queryBuilder.toString();
        if (queryString.endsWith(QUERY_SEPARATOR)) {
            queryString = queryString.substring(0, queryString.length() - 1);
        }
        return queryString;
    }

    @Override()
    public String getAuthorization(String accessKeyId, String accessKeySecret, String stringToSign) {
        String signature = signString(stringToSign, accessKeySecret);
        return "authing " + accessKeyId + ":" + signature;
    }

    private String signString(String stringToSign, String accessKeySecret) {
        try {
            // System.out.println("stringToSign:"+stringToSign);
            // System.out.println("accessKeySecret:"+accessKeySecret);
            Mac mac = Mac.getInstance(ALGORITHM_NAME);
            mac.init(new SecretKeySpec(accessKeySecret.getBytes(ENCODING), ALGORITHM_NAME));
            byte[] signData = mac.doFinal(stringToSign.getBytes(ENCODING));
            return DatatypeConverter.printBase64Binary(signData);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException | InvalidKeyException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }
}
