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
    request := dto.AssociationExtIdpDto{
        Association: false,
        Id: "id_5612",
        TenantId: "tenantId_212",
    }
    response := client.ChangeAssociationState(&request)
    fmt.Println(response)
}

