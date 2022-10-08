package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDepartmentReqDto request = new UpdateDepartmentReqDto();
        request.setDepartmentId("departmentId_4334");
        request.setOrganizationCode("organizationCode_6709");
        request.setLeaderUserIds(Collections.singletonList("String_9086"));
        request.setDescription("description_8962");
        request.setCode("code_4649");
        request.setI18n(new cn.authing.sdk.java.dto.DepartmentI18nDto());
        request.setName("name_7173");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.UpdateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);
        request.setParentDepartmentId("parentDepartmentId_9267");
        request.setCustomData(Collections.emptyList());

        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}