import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SearchDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SearchDepartmentMembersDto request = new SearchDepartmentMembersDto();
        request.setOrganizationCode("organizationCode_8223");
        request.setDepartmentId("departmentId_3422");
        request.setKeywords("keywords_8217");
        request.setPage(0);
        request.setLimit(0);
        request.setDepartmentIdType("departmentIdType_5463");
        request.setIncludeChildrenDepartments(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserPaginatedRespDto response = client.searchDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}