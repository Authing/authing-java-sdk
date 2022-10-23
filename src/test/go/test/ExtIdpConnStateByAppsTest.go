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
    request := dto.ExtIdpConnAppsDto{
        Id: "id_4455",
        TenantId: "tenantId_8254",
        AppId: "appId_2691",
        Type: "type_8117",
    }
    response := client.ExtIdpConnStateByApps(&request)
    fmt.Println(response)
}

