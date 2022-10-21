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
    request := dto.ListUsersDto{
        Page: 0,
        Limit: 0,
        Status: "status_6472",
        UpdatedAtStart: 0,
        UpdatedAtEnd: 0,
        WithCustomData: false,
        WithIdentities: false,
        WithDepartmentIds: false,
    }
    response := client.ListUsersLegacy(&request)
    fmt.Println(response)
}

