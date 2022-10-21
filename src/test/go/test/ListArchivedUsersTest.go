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
    request := dto.ListArchivedUsersDto{
        Page: 0,
        Limit: 0,
        StartAt: 0,
    }
    response := client.ListArchivedUsers(&request)
    fmt.Println(response)
}

