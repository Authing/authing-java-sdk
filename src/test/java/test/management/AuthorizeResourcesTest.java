package test.management;

import cn.genauth.sdk.java.client.ManagementClient;
import cn.genauth.sdk.java.dto.AuthorizeResourceItem;
import cn.genauth.sdk.java.dto.AuthorizeResourcesDto;
import cn.genauth.sdk.java.dto.IsSuccessRespDto;
import cn.genauth.sdk.java.dto.ResourceItemDto;
import cn.genauth.sdk.java.model.ManagementClientOptions;
import cn.genauth.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorizeResourcesTest {
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

        AuthorizeResourcesDto reqDto = new AuthorizeResourcesDto();
        List<AuthorizeResourceItem> list = new ArrayList<>();
        AuthorizeResourceItem item = new AuthorizeResourceItem();
        List<ResourceItemDto> resourceList = new ArrayList<>();
        ResourceItemDto resourceItemDto = new ResourceItemDto();
        resourceItemDto.setResourceType(ResourceItemDto.ResourceType.DATA);
        resourceItemDto.setCode("code1");
        resourceItemDto.setActions(Collections.singletonList("action1"));
        resourceList.add(resourceItemDto);
        item.setResources(resourceList);
        item.setTargetType(AuthorizeResourceItem.TargetType.USER);
        item.setTargetIdentifiers(Collections.singletonList("6343b98b7cfxxx9366e9b7c"));
        list.add(item);
        reqDto.setList(list);
        IsSuccessRespDto response = client.authorizeResources(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
