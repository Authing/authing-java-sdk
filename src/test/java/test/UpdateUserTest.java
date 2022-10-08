package test;
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
        request.setUserId("userId_715");
        request.setPhoneCountryCode("phoneCountryCode_2126");
        request.setName("name_1048");
        request.setNickname("nickname_483");
        request.setPhoto("photo_483");
        request.setExternalId("externalId_622");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_155");
        request.setCountry("country_5387");
        request.setProvince("province_2895");
        request.setCity("city_5576");
        request.setAddress("address_9102");
        request.setStreetAddress("streetAddress_1036");
        request.setPostalCode("postalCode_8148");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_8477");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_9402");
        request.setPhone("phone_9464");
        request.setPassword("password_7064");
        request.setCompany("company_3844");
        request.setBrowser("browser_369");
        request.setDevice("device_538");
        request.setGivenName("givenName_7049");
        request.setFamilyName("familyName_5591");
        request.setMiddleName("middleName_4510");
        request.setProfile("profile_8089");
        request.setPreferredUsername("preferredUsername_5258");
        request.setWebsite("website_4402");
        request.setZoneinfo("zoneinfo_3344");
        request.setLocale("locale_3475");
        request.setFormatted("formatted_5994");
        request.setRegion("region_6559");
        request.setCustomData(Collections.emptyList());
        request.setOptions(new cn.authing.sdk.java.dto.UpdateUserOptionsDto());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}