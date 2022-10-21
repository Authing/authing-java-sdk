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
    request := dto.RevokeRoleDto{
        Targets: nil,
        Code: "code_5272",
        Namespace: "namespace_3830",
    }
    response := client.RevokeRole(&request)
    fmt.Println(response)
}

