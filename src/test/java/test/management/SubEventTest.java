package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.model.Receiver;

/**
 * @author songxueyan
 * @date 2023/2/21
 **/
public class SubEventTest {
    public static void main(String[] args) {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId("ACCESS_KEY_ID");
        clientOptions.setAccessKeySecret("ACCESS_KEY_SECRET");
//        clientOptions.setHost("http://core.authing.cn");
//        clientOptions.setEventEndpoint("/events");

        ManagementClient client = new ManagementClient(clientOptions);

        client.subEvent("authing.user.created", msg -> System.out.println(msg));
    }
}
