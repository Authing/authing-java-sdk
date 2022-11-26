package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ${methodName?cap_first}Test {

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

        <#list reqParameters as reqParameter>
        ${reqParameter.className} ${reqParameter.name} = new ${reqParameter.className}();
            <#list reqParameter.properties as p>
        ${reqParameter.name}.set${p.name?cap_first}(${p.value});
            </#list>
        </#list>

        ${respClass} response = client.${methodName}(<#list reqParameters as reqParameter>${reqParameter.name}<#if reqParameter_has_next>, </#if></#list>);
        System.out.println(JsonUtils.serialize(response));
    }

}