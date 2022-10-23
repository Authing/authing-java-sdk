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
    request := dto.ListTenantExtIdpDto{
        TenantId: "tenantId_6024",
        AppId: "appId_5221",
        Type: "type_1026",
        Page: "page_3707",
        Limit: "limit_7452",
    }
    response := client.ListTenantExtIdp(&request)
    fmt.Println(response)
}

