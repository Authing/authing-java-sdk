package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-06-03
 * Time: 20:31
 * Description:
 */
public class MD5 {

    public static byte[] encrypt(String data){
        try {
            MessageDigest digest=MessageDigest.getInstance("MD5");
            digest.update(data.getBytes());
            return digest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }



}
