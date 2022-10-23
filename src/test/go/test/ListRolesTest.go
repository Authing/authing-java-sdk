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
    request := dto.ListRolesDto{
        Keywords: "keywords_6550",
        Namespace: "namespace_3937",
        Page: 0,
        Limit: 0,
    }
    response := client.ListRoles(&request)
    fmt.Println(response)
}

