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
    request := dto.SearchDepartmentsReqDto{
        Keywords: "keywords_9825",
        OrganizationCode: "organizationCode_5156",
        WithCustomData: false,
    }
    response := client.SearchDepartments(&request)
    fmt.Println(response)
}

