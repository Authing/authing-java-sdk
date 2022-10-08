package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateDepartmentReqDto request = new CreateDepartmentReqDto();
        request.setParentDepartmentId("parentDepartmentId_7976");
        request.setName("name_5698");
        request.setOrganizationCode("organizationCode_7975");
        request.setOpenDepartmentId("openDepartmentId_4180");
        request.setDescription("description_6911");
        request.setCode("code_1102");
        request.setIsVirtualNode(Boolean.TRUE);
        request.setI18n(new cn.authing.sdk.java.dto.DepartmentI18nDto());
        request.setCustomData(Collections.emptyList());
        request.setDepartmentIdType(cn.authing.sdk.java.dto.CreateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.createDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}