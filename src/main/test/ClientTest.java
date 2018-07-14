import com.alibaba.fastjson.JSON;
import moude.Option;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-07-14
 * Time: 11:45
 * Description:
 */
public class ClientTest {
    private static String clientId="5b0dfcff82f4ce00014fdcd4";
    private static String secret="42aa3deba3b2c35aaf018acafdf503f8";
    private static String email="123456@qq.com";
    private static String password="123456";
    private static Client client=null;

    @BeforeClass
    public static void login() throws Exception{
        client=new Client(clientId,secret);
        Option option=Option.builder()
                .putOption("registerInClient",clientId)
                .putOption("email",email)
                .putOption("password",password)
                .build();
        String response= client.login(option);
        System.out.println("登录信息:"+response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void register() throws Exception{
        Option option=Option.builder()
                .putOption("registerInClient",clientId)
                .putOption("email","111111@qq.com")
                .putOption("password","123456")
                .build();
        String response= client.register(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void readOAuthList() throws Exception{
        Option option=Option.builder()
                .putOption("clientId",clientId)
                .build();
        String response= client.readOAuthList(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void user() throws Exception{
        Option option=Option.builder()
                .putOption("registerInClient",clientId)
                .putOption("id","5b0dfd2282f4ce00014fdcd6")
                .build();
        String response= client.user(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void users() throws Exception{
        Option option=Option.builder()
                .putOption("registerInClient",clientId)
                .putOption("page",1)
                .putOption("count",2)
                .build();
        String response= client.users(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void checkLoginStatus() throws Exception{
        Option option=Option.builder()
                .build();
        String response= client.checkLoginStatus(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void removeUsers() throws Exception{
        String[] ids={"xxxxxxxx","xxxxxxxx"};
        Option option=Option.builder()
                .putOption("registerInClient",clientId)
                .putOption("ids",ids)
                .build();
        String response= client.removeUsers(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void sendVerifyEmail()throws Exception {
        Option option=Option.builder()
                .putOption("client",clientId)
                .putOption("email",email)
                .build();
        String response= client.sendVerifyEmail(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void sendResetPasswordEmail()throws Exception{
        Option option=Option.builder()
                .putOption("client",clientId)
                .putOption("email","zy656184526@163.com")
                .build();
        String response= client.sendResetPasswordEmail(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void verifyResetPasswordVerifyCode()throws Exception {
        Option option=Option.builder()
                .putOption("client",clientId)
                .putOption("email","zy656184526@163.com")
                .putOption("verifyCode","2722")
                .build();
        String response= client.verifyResetPasswordVerifyCode(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }

    @Test
    public void changePassword()throws Exception {
        Option option=Option.builder()
                .putOption("client",clientId)
                .putOption("email","zy656184526@163.com")
                .putOption("verifyCode","2722")
                .putOption("password","1234567")
                .build();
        String response= client.changePassword(option);
        System.out.println(response);
        Object error=JSON.parseObject(response).get("errors");
        assertNull(error);
    }
}