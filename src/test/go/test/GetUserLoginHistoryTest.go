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
    request := dto.GetUserLoginHistoryDto{
        UserId: "userId_1177",
        UserIdType: "userIdType_2994",
        AppId: "appId_1866",
        ClientIp: "clientIp_7180",
        Start: 0,
        End: 0,
        Page: 0,
        Limit: 0,
    }
    response := client.GetUserLoginHistory(&request)
    fmt.Println(response)
}

