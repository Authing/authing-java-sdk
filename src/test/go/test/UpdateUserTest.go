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
    request := dto.UpdateUserReqDto{
        UserId: "userId_515",
        PhoneCountryCode: "phoneCountryCode_5569",
        Name: "name_5972",
        Nickname: "nickname_5807",
        Photo: "photo_4129",
        ExternalId: "externalId_2974",
        Status: ,
        EmailVerified: false,
        PhoneVerified: false,
        Birthdate: "birthdate_1707",
        Country: "country_1108",
        Province: "province_7521",
        City: "city_5904",
        Address: "address_1082",
        StreetAddress: "streetAddress_2083",
        PostalCode: "postalCode_3448",
        Gender: ,
        Username: "username_2896",
        Email: "email_7107",
        Phone: "phone_807",
        Password: "password_1205",
        Company: "company_2223",
        Browser: "browser_3901",
        Device: "device_6744",
        GivenName: "givenName_6173",
        FamilyName: "familyName_6956",
        MiddleName: "middleName_8060",
        Profile: "profile_7643",
        PreferredUsername: "preferredUsername_8585",
        Website: "website_3022",
        Zoneinfo: "zoneinfo_5496",
        Locale: "locale_4416",
        Formatted: "formatted_93",
        Region: "region_3068",
        CustomData: nil,
        Options: nil,
    }
    response := client.UpdateUser(&request)
    fmt.Println(response)
}

