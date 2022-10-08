package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class KickUsersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        KickUsersDto request = new KickUsersDto();
        request.setAppIds(Collections.singletonList("String_9748"));
        request.setUserId("userId_1025");
        request.setOptions(new cn.authing.sdk.java.dto.KickUsersOptionsDto());

        IsSuccessRespDto response = client.kickUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}