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
        request.setUserId("userId_1800");
        request.setPhoneCountryCode("phoneCountryCode_6537");
        request.setName("name_3715");
        request.setNickname("nickname_1048");
        request.setPhoto("photo_659");
        request.setExternalId("externalId_6734");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_91");
        request.setCountry("country_4787");
        request.setProvince("province_6145");
        request.setCity("city_3458");
        request.setAddress("address_8370");
        request.setStreetAddress("streetAddress_5539");
        request.setPostalCode("postalCode_4790");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_1165");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_8121");
        request.setPhone("phone_5250");
        request.setPassword("password_8178");
        request.setCompany("company_3261");
        request.setBrowser("browser_8885");
        request.setDevice("device_4303");
        request.setGivenName("givenName_6403");
        request.setFamilyName("familyName_8213");
        request.setMiddleName("middleName_1950");
        request.setProfile("profile_5173");
        request.setPreferredUsername("preferredUsername_2517");
        request.setWebsite("website_9913");
        request.setZoneinfo("zoneinfo_4237");
        request.setLocale("locale_785");
        request.setFormatted("formatted_1900");
        request.setRegion("region_7585");
        request.setCustomData(Collections.emptyList());
        request.setOptions(new cn.authing.sdk.java.dto.UpdateUserOptionsDto());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}