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
    request := dto.ListOrganizationsDto{
        Page: 0,
        Limit: 0,
        FetchAll: false,
        WithCustomData: false,
    }
    response := client.ListOrganizations(&request)
    fmt.Println(response)
}

