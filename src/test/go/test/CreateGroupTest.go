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
    request := dto.CreateGroupReqDto{
        Description: "description_6051",
        Name: "name_5994",
        Code: "code_1238",
    }
    response := client.CreateGroup(&request)
    fmt.Println(response)
}

