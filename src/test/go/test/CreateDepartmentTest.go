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
    request := dto.CreateDepartmentReqDto{
        ParentDepartmentId: "parentDepartmentId_8649",
        Name: "name_4147",
        OrganizationCode: "organizationCode_2607",
        OpenDepartmentId: "openDepartmentId_3332",
        Description: "description_7362",
        Code: "code_4809",
        IsVirtualNode: false,
        I18n: nil,
        CustomData: nil,
        DepartmentIdType: ,
    }
    response := client.CreateDepartment(&request)
    fmt.Println(response)
}

