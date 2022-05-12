import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListArchivedUsersTest {
    
    private static final String ACCESS_KEY_ID = "6278b61be7200593662ebf8d";
    private static final String ACCESS_KEY_SECRET = "645e1c0519ea3c550ba1249d65e2babf";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListArchivedUsersDto request = new ListArchivedUsersDto();
        request.setPage(1);
        request.setLimit(10);

        ListArchivedUsersSingleRespDto response = client.listArchivedUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}