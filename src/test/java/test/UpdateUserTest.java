package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateUserTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateUserReqDto request = new UpdateUserReqDto();
        request.setUserId("userId_9306");
        request.setPhoneCountryCode("phoneCountryCode_3761");
        request.setName("name_9357");
        request.setNickname("nickname_785");
        request.setPhoto("photo_8756");
        request.setExternalId("externalId_2270");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_8044");
        request.setCountry("country_6516");
        request.setProvince("province_2900");
        request.setCity("city_4762");
        request.setAddress("address_1089");
        request.setStreetAddress("streetAddress_7148");
        request.setPostalCode("postalCode_1649");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_4104");
        request.setEmail("email_2149");
        request.setPhone("phone_2033");
        request.setPassword("password_4705");
        request.setCompany("company_4882");
        request.setBrowser("browser_5563");
        request.setDevice("device_7787");
        request.setGivenName("givenName_3249");
        request.setFamilyName("familyName_2937");
        request.setMiddleName("middleName_534");
        request.setProfile("profile_1019");
        request.setPreferredUsername("preferredUsername_9606");
        request.setWebsite("website_9158");
        request.setZoneinfo("zoneinfo_3201");
        request.setLocale("locale_4077");
        request.setFormatted("formatted_6039");
        request.setRegion("region_3189");
        request.setCustomData(Collections.emptyList());
        request.setOptions(new cn.authing.sdk.java.dto.UpdateUserOptionsDto());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}