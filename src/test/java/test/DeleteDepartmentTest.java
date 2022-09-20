import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class DeleteDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteDepartmentReqDto request = new DeleteDepartmentReqDto();
        request.setDepartmentId("departmentId_5219");
        request.setOrganizationCode("organizationCode_7840");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.DeleteDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        IsSuccessRespDto response = client.deleteDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}