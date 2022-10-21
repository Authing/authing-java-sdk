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
    request := dto.UpdateDepartmentReqDto{
        DepartmentId: "departmentId_8086",
        OrganizationCode: "organizationCode_7102",
        LeaderUserIds: nil,
        Description: "description_5761",
        Code: "code_1093",
        I18n: nil,
        Name: "name_7858",
        DepartmentIdType: ,
        ParentDepartmentId: "parentDepartmentId_7472",
        CustomData: nil,
    }
    response := client.UpdateDepartment(&request)
    fmt.Println(response)
}

