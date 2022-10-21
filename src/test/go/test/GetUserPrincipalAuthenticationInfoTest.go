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
    request := dto.GetUserPrincipalAuthenticationInfoDto{
        UserId: "userId_2419",
        UserIdType: "userIdType_5427",
    }
    response := client.GetUserPrincipalAuthenticationInfo(&request)
    fmt.Println(response)
}

