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
    request := dto.GetUserDepartmentsDto{
        UserId: "userId_8773",
        UserIdType: "userIdType_6717",
        Page: 0,
        Limit: 0,
        WithCustomData: false,
        SortBy: "sortBy_7017",
        OrderBy: "orderBy_4858",
    }
    response := client.GetUserDepartments(&request)
    fmt.Println(response)
}

