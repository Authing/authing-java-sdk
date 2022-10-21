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
    request := dto.ListDepartmentMembersDto{
        OrganizationCode: "organizationCode_2409",
        DepartmentId: "departmentId_7317",
        SortBy: "sortBy_904",
        OrderBy: "orderBy_9419",
        DepartmentIdType: "departmentIdType_3085",
        IncludeChildrenDepartments: false,
        Page: 0,
        Limit: 0,
        WithCustomData: false,
        WithIdentities: false,
        WithDepartmentIds: false,
    }
    response := client.ListDepartmentMembers(&request)
    fmt.Println(response)
}

