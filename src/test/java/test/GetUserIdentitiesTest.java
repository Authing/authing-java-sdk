import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.GetUserIdentitiesDto;
import cn.authing.sdk.java.dto.IdentityListRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class GetUserIdentitiesTest {
    
    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";
    
    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        
        GetUserIdentitiesDto request = new GetUserIdentitiesDto();
        request.setUserId("userId_2337");
        
        IdentityListRespDto response = client.getUserIdentities(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
}