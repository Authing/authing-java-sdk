import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListGroupMembersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListGroupMembersDto request = new ListGroupMembersDto();
        request.setCode("code_6420");
        request.setPage(0);
        request.setLimit(0);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserListRespDto response = client.listGroupMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}