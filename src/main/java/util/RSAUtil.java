package util;


import org.bouncycastle.jce.provider.BouncyCastleProvider;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-06-04
 * Time: 9:20
 * Description:
 */
public class RSAUtil {
    public static final String CHARSET = "UTF-8";
    public static final String RSA_ALGORITHM = "RSA";

    public static String publicKey=
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC4xKeUgQ+Aoz7TLfAfs9+paePb" +
                    "5KIofVthEopwrXFkp8OCeocaTHt9ICjTT2QeJh6cZaDaArfZ873GPUn00eOIZ7Ae" +
                    "+TiA2BKHbCvloW3w5Lnqm70iSsUi5Fmu9/2+68GZRH9L7Mlh8cFksCicW2Y2W2uM" +
                    "GKl64GDcIq3au+aqJQIDAQAB" ;


    public static final String ALGORITHM = "RSA";

    /**
     * String to hold name of the encryption padding.
     */
//    public static final String PADDING = "RSA/NONE/NoPadding";
    public static final String PADDING = "RSA/ECB/PKCS1Padding";
    /**
     * String to hold name of the security provider.
     */
    public static final String PROVIDER = "BC";



    public static PublicKey getPublicKey(String key) throws Exception {
        byte[] keyBytes;
        keyBytes = (new BASE64Decoder()).decodeBuffer(key);
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(keySpec);
        return publicKey;
    }

    public static String encrypt(String text)throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        PublicKey pubkey=getPublicKey(publicKey);
        byte[] cipherText = null;
        try {
            final Cipher cipher = Cipher.getInstance(PADDING, PROVIDER);

            cipher.init(Cipher.ENCRYPT_MODE, pubkey);
            cipherText = cipher.doFinal(text.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new BASE64Encoder().encode(cipherText);
    }
}
