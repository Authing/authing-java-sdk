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
    request := dto.GetExtIdpDto{
        Id: "id_4241",
        TenantId: "tenantId_9898",
        AppId: "appId_1548",
        Type: "type_8357",
    }
    response := client.GetExtIdp(&request)
    fmt.Println(response)
}

