
<#list methods as method>
func TestClient_${method.methodName?cap_first}(t *testing.T) {
    request := dto.${method.firstParameter.className}{
        <#list method.firstParameter.properties as p>
            ${p.name?cap_first}: ${p.value},
        </#list>
    }
    response := client.${method.methodName?cap_first}(&request)
    fmt.Println(response)
}


</#list>

