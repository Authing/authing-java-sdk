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
    request := dto.CreateUserReqDto{
        Status: ,
        Email: "email_6701",
        Phone: "phone_3345",
        PhoneCountryCode: "phoneCountryCode_1206",
        Username: "username_9383",
        ExternalId: "externalId_8931",
        Name: "name_4488",
        Nickname: "nickname_6673",
        Photo: "photo_7532",
        Gender: ,
        EmailVerified: false,
        PhoneVerified: false,
        Birthdate: "birthdate_1426",
        Country: "country_4481",
        Province: "province_3432",
        City: "city_9427",
        Address: "address_4467",
        StreetAddress: "streetAddress_6658",
        PostalCode: "postalCode_3527",
        Company: "company_6819",
        Browser: "browser_7751",
        Device: "device_9293",
        GivenName: "givenName_5233",
        FamilyName: "familyName_9639",
        MiddleName: "middleName_6473",
        Profile: "profile_3519",
        PreferredUsername: "preferredUsername_8269",
        Website: "website_7411",
        Zoneinfo: "zoneinfo_4793",
        Locale: "locale_5325",
        Formatted: "formatted_6667",
        Region: "region_9125",
        Password: "password_2062",
        Salt: "salt_1193",
        TenantIds: nil,
        Otp: nil,
        DepartmentIds: nil,
        CustomData: nil,
        Identities: nil,
        Options: nil,
    }
    response := client.CreateUser(&request)
    fmt.Println(response)
}

