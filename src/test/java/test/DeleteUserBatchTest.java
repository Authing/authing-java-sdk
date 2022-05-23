import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.DeleteUsersBatchDto;
import cn.authing.sdk.java.dto.IsSuccessRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class DeleteUserBatchTest {
    
    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteUsersBatchDto request = new DeleteUsersBatchDto();
        request.setUserIds(Collections.singletonList("userId_1362"));

        IsSuccessRespDto response = client.deleteUserBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }

}