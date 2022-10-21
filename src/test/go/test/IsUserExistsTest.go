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
    request := dto.IsUserExistsReqDto{
        Username: "username_3890",
        Email: "email_4944",
        Phone: "phone_7483",
        ExternalId: "externalId_2092",
    }
    response := client.IsUserExists(&request)
    fmt.Println(response)
}

