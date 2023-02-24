package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CostGetAllRightItemRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;

/**
 * @author songxueyan
 * @date 2023/2/23
 **/
public class EventPubTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) {

        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        String eventData = "{\"id\":\"q\",\"createdAt\":1675579686427,\"updatedAt\":1675579686427}";
        CostGetAllRightItemRespDto result = client.pubtEvent("yourapp.event.code", eventData);
        System.out.println(result);

    }
}
