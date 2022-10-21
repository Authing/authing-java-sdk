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
    request := dto.IsUserInDepartmentDto{
        UserId: "userId_9612",
        OrganizationCode: "organizationCode_5981",
        DepartmentId: "departmentId_9021",
        DepartmentIdType: "departmentIdType_9878",
        IncludeChildrenDepartments: false,
    }
    response := client.IsUserInDepartment(&request)
    fmt.Println(response)
}

