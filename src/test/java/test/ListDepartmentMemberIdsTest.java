import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListDepartmentMemberIdsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMemberIdsDto request = new ListDepartmentMemberIdsDto();
        request.setOrganizationCode("organizationCode_967");
        request.setDepartmentId("departmentId_3355");
        request.setDepartmentIdType("departmentIdType_5740");

        UserIdListRespDto response = client.listDepartmentMemberIds(request);
        System.out.println(JsonUtils.serialize(response));
    }

}