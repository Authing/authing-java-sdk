import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import model.ManagementClientOptions;
import org.junit.jupiter.api.Test;

import java.cn.authing.sdk.java.util.ArrayList;
import java.cn.authing.sdk.java.util.Collections;


public class ${template.className}Test {

    private static final String ACCESS_KEY_ID = "";
    private static final String ACCESS_KEY_SECRET = "";
    private static final String HOST = "https://core.authing.cn";

<#list template.methods as method>



    @Test
    public void ${method.methodName?uncap_first}Test () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient cn.authing.sdk.java.client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);

        <#list method.reqParameters as reqParameter>
        ${reqParameter.className} ${reqParameter.name} = new ${reqParameter.className}();
            <#list reqParameter.properties as p>
        ${reqParameter.name}.set${p.name?cap_first}(${p.value});
            </#list>
        </#list>

        ${method.respClass} response = cn.authing.sdk.java.client.${method.methodName}(<#list method.reqParameters as reqParameter>${reqParameter.name}<#if reqParameter_has_next>, </#if></#list>);
        System.out.println(JsonUtils.serialize(response));
    }


</#list>

}