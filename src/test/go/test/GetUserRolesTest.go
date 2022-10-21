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
    request := dto.GetUserRolesDto{
        UserId: "userId_7515",
        UserIdType: "userIdType_1594",
        Namespace: "namespace_8201",
    }
    response := client.GetUserRoles(&request)
    fmt.Println(response)
}

