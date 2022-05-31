import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDto request = new GetUserDto();
        request.setUserId("userId_4440");
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);
        request.setPhone("phone_6175");
        request.setEmail("email_9825");
        request.setUsername("username_3127");
        request.setExternalId("externalId_8543");

        UserSingleRespDto response = client.getUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}