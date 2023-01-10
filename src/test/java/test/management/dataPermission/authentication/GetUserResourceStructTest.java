package test.management.dataPermission.authentication;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.GetUserResourceStructDto;
import cn.authing.sdk.java.dto.GetUserResourceStructRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

/**
 * @Author yuJiaLe
 * @date 2023/01/10
 **/
public class GetUserResourceStructTest {

    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "63bc12e5a13a87b68136f99e";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "209de290e8cb2f16fa6e9ff3bd3471ff";

    public static void main(String[] args) {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserResourceStructDto request = new GetUserResourceStructDto();
       request.setNamespaceCode("63bc13149b1439d7971e7db4");
       request.setUserId("63bc1342225bafa08cae5adc");
       request.setResourceCode("arr1");

        GetUserResourceStructRespDto response = client.getUserResourceStruct(request);
        System.out.println(JsonUtils.serialize(response));

    }

}