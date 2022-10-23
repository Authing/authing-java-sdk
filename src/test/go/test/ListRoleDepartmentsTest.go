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
    request := dto.ListRoleDepartmentsDto{
        Code: "code_6936",
        Namespace: "namespace_6096",
        Page: 0,
        Limit: 0,
    }
    response := client.ListRoleDepartments(&request)
    fmt.Println(response)
}

