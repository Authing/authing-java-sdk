package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetDepartmentTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetDepartmentDto request = new GetDepartmentDto();
        request.setOrganizationCode("organizationCode_1938");
        request.setDepartmentId("departmentId_5669");
        request.setDepartmentCode("departmentCode_404");
        request.setDepartmentIdType("departmentIdType_4578");
        request.setWithCustomData(Boolean.TRUE);

        DepartmentSingleRespDto response = client.getDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}