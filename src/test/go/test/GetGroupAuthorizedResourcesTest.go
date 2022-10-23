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
    request := dto.GetGroupAuthorizedResourcesDto{
        Code: "code_7938",
        Namespace: "namespace_0",
        ResourceType: "resourceType_8192",
    }
    response := client.GetGroupAuthorizedResources(&request)
    fmt.Println(response)
}

