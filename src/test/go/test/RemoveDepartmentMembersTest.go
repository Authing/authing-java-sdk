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
    request := dto.RemoveDepartmentMembersReqDto{
        UserIds: nil,
        OrganizationCode: "organizationCode_686",
        DepartmentId: "departmentId_1586",
        DepartmentIdType: ,
    }
    response := client.RemoveDepartmentMembers(&request)
    fmt.Println(response)
}

