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
        request.setOrganizationCode("organizationCode_8829");
        request.setName("name_5862");
        request.setParentDepartmentId("parentDepartmentId_2057");
        request.setOpenDepartmentId("openDepartmentId_8094");
        request.setCode("code_5800");
        request.setLeaderUserId("leaderUserId_2950");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.CreateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.createDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}