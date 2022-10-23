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
    request := dto.UpdateRoleDto{
        NewCode: "newCode_751",
        Code: "code_2413",
        Namespace: "namespace_5612",
        Description: "description_4098",
    }
    response := client.UpdateRole(&request)
    fmt.Println(response)
}

