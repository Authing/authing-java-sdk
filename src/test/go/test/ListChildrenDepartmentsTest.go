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
    request := dto.ListChildrenDepartmentsDto{
        OrganizationCode: "organizationCode_4658",
        DepartmentId: "departmentId_2875",
        DepartmentIdType: "departmentIdType_7804",
        ExcludeVirtualNode: false,
        OnlyVirtualNode: false,
        WithCustomData: false,
    }
    response := client.ListChildrenDepartments(&request)
    fmt.Println(response)
}

