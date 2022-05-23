import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class IsUserExistsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        IsUserExistsReqDto request = new IsUserExistsReqDto();
        request.setUsername("username_6529");
        request.setEmail("email_8448");
        request.setPhone("phone_1582");
        request.setExternalId("externalId_3861");

        IsUserExistsRespDto response = client.isUserExists(request);
        System.out.println(JsonUtils.serialize(response));
    }

}