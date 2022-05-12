import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserTest {
    
    private static final String ACCESS_KEY_ID = "6278b61be7200593662ebf8d";
    private static final String ACCESS_KEY_SECRET = "645e1c0519ea3c550ba1249d65e2babf";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDto request = new GetUserDto();
        request.setUserId("6278b61c88cb22e9faff7643");
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);
//        request.setPhone("phone_8797");
//        request.setEmail("email_9023");
//        request.setUsername("username_962");
//        request.setExternalId("externalId_4310");

        UserSingleRespDto response = client.getUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}