package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class KickUsersTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        KickUsersDto request = new KickUsersDto();
        request.setAppIds(Collections.singletonList("String_9661"));
        request.setUserId("userId_5519");
        request.setOptions(new cn.authing.sdk.java.dto.KickUsersOptionsDto());

        IsSuccessRespDto response = client.kickUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}