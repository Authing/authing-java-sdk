package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SearchDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SearchDepartmentMembersDto request = new SearchDepartmentMembersDto();
        request.setOrganizationCode("organizationCode_2306");
        request.setDepartmentId("departmentId_8699");
        request.setKeywords("keywords_8600");
        request.setPage(0);
        request.setLimit(0);
        request.setDepartmentIdType("departmentIdType_2345");
        request.setIncludeChildrenDepartments(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserPaginatedRespDto response = client.searchDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}