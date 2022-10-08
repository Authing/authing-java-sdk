package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListUsersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        clientOptions.setHost("http://127.0.0.1:3000");
        ManagementClient client = new ManagementClient(clientOptions);

        ListUsersDto request = new ListUsersDto();
        request.setPage(1);
        request.setLimit(1);

        UserPaginatedRespDto response = client.listUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}