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
    request := dto.GetRoleAuthorizedResourcesDto{
        Code: "code_8672",
        Namespace: "namespace_4739",
        ResourceType: "resourceType_6300",
    }
    response := client.GetRoleAuthorizedResources(&request)
    fmt.Println(response)
}

