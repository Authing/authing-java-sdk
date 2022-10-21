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
    request := dto.GetUserGroupsDto{
        UserId: "userId_9494",
        UserIdType: "userIdType_7695",
    }
    response := client.GetUserGroups(&request)
    fmt.Println(response)
}

