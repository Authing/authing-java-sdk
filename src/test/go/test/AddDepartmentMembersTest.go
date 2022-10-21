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
    request := dto.AddDepartmentMembersReqDto{
        UserIds: nil,
        OrganizationCode: "organizationCode_527",
        DepartmentId: "departmentId_9419",
        DepartmentIdType: ,
    }
    response := client.AddDepartmentMembers(&request)
    fmt.Println(response)
}

