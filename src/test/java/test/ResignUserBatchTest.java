package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ResignUserBatchTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ResignUserBatchReqDto request = new ResignUserBatchReqDto();
        request.setUserIds(Collections.singletonList("String_7829"));
        request.setUserIdType(cn.authing.sdk.java.dto.ResignUserBatchReqDto.UserIdType.USER_ID);

        ResignUserRespDto response = client.resignUserBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }

}