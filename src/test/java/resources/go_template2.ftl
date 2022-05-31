package main

import (
"authing-go-sdk/client"
"authing-go-sdk/dto"
"fmt"
)

func main() {
    options := client.ManagementClientOptions{
        AccessKeyId:     "AUTHING_USERPOOL_ID",
        AccessKeySecret: "AUTHING_USERPOOL_SECRET",
    }
    var err error
    client, err := client.NewClient(&options)
    if err != nil {
        panic(err)
    }
    request := dto.${firstParameter.className?cap_first}{
    <#list firstParameter.properties as p>
        ${p.name?cap_first}: ${p.value},
    </#list>
    }
    response := client.${methodName?cap_first}(&request)
    fmt.Println(response)
}

