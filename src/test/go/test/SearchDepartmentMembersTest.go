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
    request := dto.SearchDepartmentMembersDto{
        OrganizationCode: "organizationCode_2963",
        DepartmentId: "departmentId_3706",
        Keywords: "keywords_8339",
        Page: 0,
        Limit: 0,
        DepartmentIdType: "departmentIdType_720",
        IncludeChildrenDepartments: false,
        WithCustomData: false,
        WithIdentities: false,
        WithDepartmentIds: false,
    }
    response := client.SearchDepartmentMembers(&request)
    fmt.Println(response)
}

