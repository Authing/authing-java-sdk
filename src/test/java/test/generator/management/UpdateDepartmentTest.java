package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateDepartmentTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDepartmentReqDto request = new UpdateDepartmentReqDto();
        request.setDepartmentId("departmentId_2752");
        request.setOrganizationCode("organizationCode_2340");
        request.setLeaderUserIds(Collections.singletonList("String_4295"));
        request.setDescription("description_2939");
        request.setCode("code_6463");
        request.setI18n(new cn.authing.sdk.java.dto.DepartmentI18nDto());
        request.setName("name_5408");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.UpdateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);
        request.setParentDepartmentId("parentDepartmentId_187");
        request.setCustomData(Collections.emptyList());

        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}