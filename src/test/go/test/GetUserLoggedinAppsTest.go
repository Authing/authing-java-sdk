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
    request := dto.GetUserLoggedinAppsDto{
        UserId: "userId_2850",
        UserIdType: "userIdType_3338",
    }
    response := client.GetUserLoggedinApps(&request)
    fmt.Println(response)
}

