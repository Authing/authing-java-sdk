package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class RemoveDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        RemoveDepartmentMembersReqDto request = new RemoveDepartmentMembersReqDto();
        request.setUserIds(Collections.singletonList("String_2431"));
        request.setOrganizationCode("organizationCode_2334");
        request.setDepartmentId("departmentId_3355");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.RemoveDepartmentMembersReqDto.DepartmentIdType.DEPARTMENT_ID);

        IsSuccessRespDto response = client.removeDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}