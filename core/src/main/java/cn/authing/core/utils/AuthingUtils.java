package cn.authing.core.utils;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

public class AuthingUtils {
    public static final String URL_OAUTH = "https://oauth.authing.cn/graphql";
    public static final String URL_USER = "https://users.authing.cn/graphql";

    private static final String PUBLICA_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
            "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
            "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
            "GKl64GDcIq3au+aqJQIDAQAB";

    public static String encrypt(String msg) {
        String provider = "BC";
        Security.addProvider(new BouncyCastleProvider());
        String result = null;
        try {
            // 获取公钥
            byte[] keyBytes = Base64.decode(PUBLICA_KEY);
            KeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
            PublicKey publicKey = keyFactory.generatePublic(keySpec);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", provider);
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] cipherMsg = cipher.doFinal(msg.getBytes());
            result = new String(Base64.encode(cipherMsg));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
