import client.ManagementClient;
import dto.*;
import model.ManagementClientOptions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;


public class ${template.className}Test {

<#list template.methods as method>
    @Test
    public void ${method.methodName?uncap_first}Test () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        <#list method.reqParameters as reqParameter>
        ${reqParameter.className} ${reqParameter.name} = new ${reqParameter.className}();
            <#list reqParameter.properties as p>
        ${reqParameter.name}.set${p.name?cap_first}(${p.value});
            </#list>
        </#list>

        ${method.respClass} response = client.${method.methodName}(<#list method.reqParameters as reqParameter>${reqParameter.name}<#if reqParameter_has_next>, </#if></#list>);
    }


</#list>

}