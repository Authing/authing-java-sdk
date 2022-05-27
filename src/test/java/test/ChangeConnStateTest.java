import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ChangeConnStateTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        EnableExtIdpConnDto request = new EnableExtIdpConnDto();
        request.setAppId("appId_7936");
        request.setEnabled(Boolean.TRUE);
        request.setId("id_9833");
        request.setTenantId("tenantId_6811");

        IsSuccessRespDto response = client.changeConnState(request);
        System.out.println(JsonUtils.serialize(response));
    }

}