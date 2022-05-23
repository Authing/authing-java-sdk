import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMembersDto request = new ListDepartmentMembersDto();
        request.setOrganizationCode("organizationCode_1697");
        request.setDepartmentId("departmentId_5387");
        request.setDepartmentIdType("departmentIdType_741");
        request.setPage(0);
        request.setLimit(0);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserListRespDto response = client.listDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}