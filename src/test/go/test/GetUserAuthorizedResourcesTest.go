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
    request := dto.GetUserAuthorizedResourcesDto{
        UserId: "userId_9304",
        UserIdType: "userIdType_9360",
        Namespace: "namespace_6623",
        ResourceType: "resourceType_2541",
    }
    response := client.GetUserAuthorizedResources(&request)
    fmt.Println(response)
}

