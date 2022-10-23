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
    request := dto.UpdateOrganizationReqDto{
        OrganizationCode: "organizationCode_7133",
        Description: "description_2722",
        OpenDepartmentId: "openDepartmentId_3745",
        LeaderUserIds: nil,
        I18n: nil,
        OrganizationNewCode: "organizationNewCode_8142",
        OrganizationName: "organizationName_4084",
    }
    response := client.UpdateOrganization(&request)
    fmt.Println(response)
}

