package test.management.dataPermission.authentication;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.ListResourceTargets;
import cn.authing.sdk.java.dto.ListResourceTargetsRespDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListResourceTargetsTest {

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

        ListResourceTargets request = new ListResourceTargets();
        request.setNamespaceCode("examplePermissionNamespace");
        ArrayList<String> actionList = new ArrayList<>();
        actionList.add("get");
        actionList.add("update");
        actionList.add("read");
        request.setActions(actionList);
        List<String> resources = new ArrayList<>();
        resources.add("strResourceCode1");
        resources.add("arrayResourceCode1");
        resources.add("/treeResourceCode1/StructCode1/resourceStructChildrenCode1");
        request.setResources(resources);
//        ListResourceTargetsRespDto response = client.listResourceTargets(request);
//        System.out.println(JsonUtils.serialize(response));
    }
}