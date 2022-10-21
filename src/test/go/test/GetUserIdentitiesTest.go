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
    request := dto.GetUserIdentitiesDto{
        UserId: "userId_9094",
        UserIdType: "userIdType_6583",
    }
    response := client.GetUserIdentities(&request)
    fmt.Println(response)
}

