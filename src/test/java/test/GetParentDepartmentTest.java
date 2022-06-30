import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetParentDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetParentDepartmentDto request = new GetParentDepartmentDto();
        request.setOrganizationCode("organizationCode_3212");
        request.setDepartmentId("departmentId_2660");
        request.setDepartmentIdType("departmentIdType_8216");
        request.setWithCustomData(Boolean.TRUE);

        DepartmentSingleRespDto response = client.getParentDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}