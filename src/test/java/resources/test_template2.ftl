package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ${methodName?cap_first}Test {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
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