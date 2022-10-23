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
    request := dto.CreateRoleDto{
        Code: "code_9045",
        Namespace: "namespace_3497",
        Description: "description_4139",
    }
    response := client.CreateRole(&request)
    fmt.Println(response)
}

