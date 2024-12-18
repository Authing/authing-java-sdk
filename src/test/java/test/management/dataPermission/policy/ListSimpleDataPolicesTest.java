package test.management.dataPermission.policy;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.ListSimpleDataPoliciesDto;
import cn.genauth.sdk.java.dto.ListSimpleDataPoliciesPaginatedRespDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

public class ListSimpleDataPolicesTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");
        ManagementClient client = new ManagementClient(clientOptions);

        ListSimpleDataPoliciesDto reqDto = new ListSimpleDataPoliciesDto();
        reqDto.setPage(1);
        reqDto.setLimit(10);
        reqDto.setQuery("examplePolicyName");
        ListSimpleDataPoliciesPaginatedRespDto response = client.listSimpleDataPolices(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
