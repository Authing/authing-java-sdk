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
    request := dto.EnableExtIdpConnDto{
        AppIds: "appIds_5057",
        AppId: "appId_3342",
        Enabled: false,
        Id: "id_2862",
        TenantId: "tenantId_5342",
    }
    response := client.ChangeConnState(&request)
    fmt.Println(response)
}

