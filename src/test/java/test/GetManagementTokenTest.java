import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetManagementTokenTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetManagementAccessTokenDto request = new GetManagementAccessTokenDto();
        request.setAccessKeySecret("accessKeySecret_4683");
        request.setAccessKeyId("accessKeyId_9667");

        GetManagementTokenRespDto response = client.getManagementToken(request);
        System.out.println(JsonUtils.serialize(response));
    }

}