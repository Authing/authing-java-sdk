package cn.authing.core.util;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-06-04
 * Time: 9:20
 * Description:
 */
public class RSAUtil {

    private static String publicKey =
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
                    "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
                    "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
                    "GKl64GDcIq3au+aqJQIDAQAB";


    public static final String ALGORITHM = "RSA";

    /**
     * String to hold name of the encryption padding.Aut
     */
//    public static final String PADDING = "RSA/NONE/NoPadding";
    private static final String PADDING = "RSA/ECB/PKCS1Padding";
    /**
     * String to hold name of the security provider.
     */
    private static final String PROVIDER = "BC";


    private static PublicKey getPublicKey(String key) throws Exception {
        byte[] keyBytes = Base64.decode(key);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM, PROVIDER);
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return publicKey;
    }

    public static String encrypt(String text) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        PublicKey pubkey = getPublicKey(publicKey);
        byte[] cipherText = null;
        try {
            final Cipher cipher = Cipher.getInstance(PADDING, PROVIDER);

            cipher.init(Cipher.ENCRYPT_MODE, pubkey);
            cipherText = cipher.doFinal(text.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new String(Base64.encode(cipherText));
    }

    public static void main(String[] args) throws Exception {
        String result = RSAUtil.encrypt("123");
        System.out.println(result);
    }
}
