package cn.genauth.sdk.java.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CommonUtils {
    public static String createRandomString(int strLength) {
        Random rnd = ThreadLocalRandom.current();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            boolean isChar = (rnd.nextInt(2) % 2 == 0);// 输出字母还是数字
            if (isChar) { // 字符串
                int choice = rnd.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                ret.append((char) (choice + rnd.nextInt(26)));
            } else { // 数字
                ret.append((rnd.nextInt(10)));
            }
        }
        return ret.toString();
    }

}
