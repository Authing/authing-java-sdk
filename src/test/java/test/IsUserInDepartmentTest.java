package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class IsUserInDepartmentTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        IsUserInDepartmentDto request = new IsUserInDepartmentDto();
        request.setUserId("userId_3419");
        request.setOrganizationCode("organizationCode_5677");
        request.setDepartmentId("departmentId_8536");
        request.setDepartmentIdType("departmentIdType_7989");
        request.setIncludeChildrenDepartments(Boolean.TRUE);

        IsUserInDepartmentRespDto response = client.isUserInDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}