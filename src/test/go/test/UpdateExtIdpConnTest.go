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
    request := dto.UpdateExtIdpConnDto{
        Fields: nil,
        DisplayName: "displayName_8873",
        Id: "id_2409",
        Logo: "logo_5393",
        LoginOnly: false,
    }
    response := client.UpdateExtIdpConn(&request)
    fmt.Println(response)
}

