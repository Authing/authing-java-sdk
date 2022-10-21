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
    request := dto.UpdateGroupReqDto{
        Description: "description_8356",
        Name: "name_3417",
        Code: "code_6431",
        NewCode: "newCode_2599",
    }
    response := client.UpdateGroup(&request)
    fmt.Println(response)
}

