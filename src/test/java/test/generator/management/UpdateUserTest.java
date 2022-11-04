package test.generator.management;
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
        request.setUserId("userId_3362");
        request.setPhoneCountryCode("phoneCountryCode_7672");
        request.setName("name_990");
        request.setNickname("nickname_7786");
        request.setPhoto("photo_8127");
        request.setExternalId("externalId_8600");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_2944");
        request.setCountry("country_7310");
        request.setProvince("province_7276");
        request.setCity("city_9349");
        request.setAddress("address_1337");
        request.setStreetAddress("streetAddress_4966");
        request.setPostalCode("postalCode_5120");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_892");
        request.setEmail("email_331");
        request.setPhone("phone_407");
        request.setPassword("password_5857");
        request.setCompany("company_82");
        request.setBrowser("browser_7147");
        request.setDevice("device_9779");
        request.setGivenName("givenName_4383");
        request.setFamilyName("familyName_9128");
        request.setMiddleName("middleName_3679");
        request.setProfile("profile_6839");
        request.setPreferredUsername("preferredUsername_140");
        request.setWebsite("website_6947");
        request.setZoneinfo("zoneinfo_5098");
        request.setLocale("locale_4152");
        request.setFormatted("formatted_9352");
        request.setRegion("region_3990");
        request.setCustomData(Collections.emptyList());
        request.setOptions(new cn.authing.sdk.java.dto.UpdateUserOptionsDto());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}