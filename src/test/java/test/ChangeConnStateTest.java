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
        request.setAppIds("appIds_4736");
        request.setAppId("appId_6505");
        request.setEnabled(Boolean.TRUE);
        request.setId("id_5707");
        request.setTenantId("tenantId_8119");

        IsSuccessRespDto response = client.changeConnState(request);
        System.out.println(JsonUtils.serialize(response));
    }

}