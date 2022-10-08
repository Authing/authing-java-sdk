package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateUserTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateUserReqDto request = new UpdateUserReqDto();
        request.setUserId("userId_8815");
        request.setPhoneCountryCode("phoneCountryCode_6325");
        request.setName("name_2603");
        request.setNickname("nickname_1758");
        request.setPhoto("photo_4947");
        request.setExternalId("externalId_120");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_4283");
        request.setCountry("country_5663");
        request.setProvince("province_8970");
        request.setCity("city_8553");
        request.setAddress("address_1138");
        request.setStreetAddress("streetAddress_3779");
        request.setPostalCode("postalCode_3327");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_5378");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_7560");
        request.setPhone("phone_1591");
        request.setPassword("password_7101");
        request.setCompany("company_3406");
        request.setBrowser("browser_3628");
        request.setDevice("device_897");
        request.setGivenName("givenName_6949");
        request.setFamilyName("familyName_4926");
        request.setMiddleName("middleName_5488");
        request.setProfile("profile_2810");
        request.setPreferredUsername("preferredUsername_7411");
        request.setWebsite("website_7527");
        request.setZoneinfo("zoneinfo_2929");
        request.setLocale("locale_2735");
        request.setFormatted("formatted_423");
        request.setRegion("region_3770");
        request.setCustomData(Collections.emptyList());
        request.setOptions(new cn.authing.sdk.java.dto.UpdateUserOptionsDto());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}