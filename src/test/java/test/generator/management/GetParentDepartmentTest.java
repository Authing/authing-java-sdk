package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetParentDepartmentTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetParentDepartmentDto request = new GetParentDepartmentDto();
        request.setOrganizationCode("organizationCode_1187");
        request.setDepartmentId("departmentId_212");
        request.setDepartmentIdType("departmentIdType_6781");
        request.setWithCustomData(Boolean.TRUE);

        DepartmentSingleRespDto response = client.getParentDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}