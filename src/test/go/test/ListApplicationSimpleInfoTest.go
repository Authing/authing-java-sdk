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
    request := dto.ListApplicationSimpleInfoDto{
        Page: 0,
        Limit: 0,
        IsIntegrateApp: false,
        IsSelfBuiltApp: false,
        SsoEnabled: false,
        Keyword: "keyword_3249",
    }
    response := client.ListApplicationSimpleInfo(&request)
    fmt.Println(response)
}

