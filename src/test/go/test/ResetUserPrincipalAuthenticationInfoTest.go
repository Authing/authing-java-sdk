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
    request := dto.ResetUserPrincipalAuthenticationInfoDto{
        UserId: "userId_2129",
        Options: nil,
    }
    response := client.ResetUserPrincipalAuthenticationInfo(&request)
    fmt.Println(response)
}

