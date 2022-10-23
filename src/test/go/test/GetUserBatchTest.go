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
    request := dto.GetUserBatchDto{
        UserIds: "userIds_6847",
        UserIdType: "userIdType_1994",
        WithCustomData: false,
        WithIdentities: false,
        WithDepartmentIds: false,
    }
    response := client.GetUserBatch(&request)
    fmt.Println(response)
}

