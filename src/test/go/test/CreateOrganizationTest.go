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
    request := dto.CreateOrganizationReqDto{
        OrganizationName: "organizationName_2144",
        OrganizationCode: "organizationCode_5038",
        Description: "description_9809",
        OpenDepartmentId: "openDepartmentId_6601",
        I18n: nil,
    }
    response := client.CreateOrganization(&request)
    fmt.Println(response)
}

