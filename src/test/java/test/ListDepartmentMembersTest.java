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
        request.setOrganizationCode("organizationCode_1450");
        request.setDepartmentId("departmentId_7412");
        request.setDepartmentIdType("departmentIdType_7785");
        request.setIncludeChildrenDepartments(Boolean.TRUE);
        request.setPage(0);
        request.setLimit(0);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);
        request.setSortBy("sortBy_4723");
        request.setOrderBy("orderBy_4737");

        UserPaginatedRespDto response = client.listDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}