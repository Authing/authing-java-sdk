import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListApplicationActiveUsersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListApplicationActiveUsersDto request = new ListApplicationActiveUsersDto();
        request.setAppId("appId_7815");
        request.setOptions(new cn.authing.sdk.java.dto.ListApplicationActiveUsersOptionsDto());

        UserPaginatedRespDto response = client.listApplicationActiveUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}