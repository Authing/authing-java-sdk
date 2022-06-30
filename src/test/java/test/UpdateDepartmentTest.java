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
        request.setDepartmentId("departmentId_5714");
        request.setOrganizationCode("organizationCode_5351");
        request.setLeaderUserIds(Collections.singletonList("String_4714"));
        request.setDescription("description_7446");
        request.setCode("code_9195");
        request.setI18n(new cn.authing.sdk.java.dto.I18nDto());
        request.setName("name_7597");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.UpdateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);
        request.setParentDepartmentId("parentDepartmentId_6736");
        request.setCustomData(Collections.emptyList());

        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}