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
    request := dto.ListDepartmentMemberIdsDto{
        OrganizationCode: "organizationCode_1570",
        DepartmentId: "departmentId_8929",
        DepartmentIdType: "departmentIdType_7044",
    }
    response := client.ListDepartmentMemberIds(&request)
    fmt.Println(response)
}

