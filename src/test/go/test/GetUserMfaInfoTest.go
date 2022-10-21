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
    request := dto.GetUserMfaInfoDto{
        UserId: "userId_508",
        UserIdType: "userIdType_4155",
    }
    response := client.GetUserMfaInfo(&request)
    fmt.Println(response)
}

