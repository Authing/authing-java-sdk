package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.model.Receiver;

/**
 * @author songxueyan
 * @date 2023/2/21
 **/
public class SubEventTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);

        ManagementClient client = new ManagementClient(clientOptions);
        client.subEvent("authing.user.created", new Receiver() {
            @Override
            public void onReceiverMessage(String msg) {
                System.out.println(msg);
            }
        });
    }
}
