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
    request := dto.CreateExtIdpConnDto{
        Fields: nil,
        DisplayName: "displayName_8721",
        Identifier: "identifier_2440",
        Type: ,
        ExtIdpId: "extIdpId_5883",
        LoginOnly: false,
        Logo: "logo_5066",
    }
    response := client.CreateExtIdpConn(&request)
    fmt.Println(response)
}

