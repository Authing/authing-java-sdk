package cn.authing.core;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestUtils {
    public static String createRandomString(int strLength) {
        Random rnd = ThreadLocalRandom.current();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < strLength; i++) {
            boolean isChar = (rnd.nextInt(2) % 2 == 0);// 输出字母还是数字
            if (isChar) { // 字符串
                int choice = rnd.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                ret.append((char) (choice + rnd.nextInt(26)));
            } else { // 数字
                ret.append(Integer.toString(rnd.nextInt(10)));
            }
        }
        return ret.toString();
    }

    public static String createRandomString() {
        return createRandomString(10);
    }

    public static String createRandomEmail() {
        return createRandomString() + "@gmail.com";
    }

    //中国移动
    private static final String[] CHINA_MOBILE = {
            "134", "135", "136", "137", "138", "139", "150", "151", "152", "157", "158", "159",
            "182", "183", "184", "187", "188", "178", "147", "172", "198"
    };

    public static String createRandomMobile() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        String mobile01;//手机号前三位
        int temp;
        mobile01 = CHINA_MOBILE[random.nextInt(CHINA_MOBILE.length)];
        if (mobile01.length() > 3) {
            return mobile01;
        }
        sb.append(mobile01);
        //生成手机号后8位
        for (int i = 0; i < 8; i++) {
            temp = random.nextInt(10);
            sb.append(temp);
        }
        return sb.toString();
    }
}
