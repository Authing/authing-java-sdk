package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SetUserDepartmentsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserDepartmentsDto request = new SetUserDepartmentsDto();
        request.setDepartments(Collections.singletonList(new cn.authing.sdk.java.dto.SetUserDepartmentDto()));
        request.setUserId("userId_4948");
        request.setOptions(new cn.authing.sdk.java.dto.SetUserDepartmentsOptionsDto());

        IsSuccessRespDto response = client.setUserDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}