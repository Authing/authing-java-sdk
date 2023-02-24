package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.model.Receiver;

/**
 * @author songxueyan
 * @date 2023/2/21
 **/
public class EventSubTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId("59f86b4832eb28071bdd9214");
        clientOptions.setAccessKeySecret("821b67f2474e92cdbed18615e13c2f0c");
        //clientOptions.setWssHost("wss://events.hydra.authing-inc.co");
        clientOptions.setWebsocketHost("ws://192.168.0.145:8866");

        ManagementClient client = new ManagementClient(clientOptions);
        client.subEvent("authing.user.login", new Receiver() {
            @Override
            public void onReceiverMessage(String msg) {
                System.out.println(msg);
            }
        });
    }
}
