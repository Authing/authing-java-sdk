package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateDepartmentTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateDepartmentReqDto request = new CreateDepartmentReqDto();
        request.setParentDepartmentId("parentDepartmentId_7779");
        request.setName("name_7444");
        request.setOrganizationCode("organizationCode_9834");
        request.setOpenDepartmentId("openDepartmentId_5681");
        request.setDescription("description_8158");
        request.setCode("code_5350");
        request.setIsVirtualNode(Boolean.TRUE);
        request.setI18n(new cn.authing.sdk.java.dto.DepartmentI18nDto());
        request.setCustomData(Collections.emptyList());
        request.setDepartmentIdType(cn.authing.sdk.java.dto.CreateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.createDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}