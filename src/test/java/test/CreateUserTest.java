package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateUserTest {

    private static final String ACCESS_KEY_ID = "6343b98b7cf019a9366e9b7c";
    private static final String ACCESS_KEY_SECRET = "fb0cefa691df76920a1611b9dec38120";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        clientOptions.setHost("http://localhost:3000");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(cn.authing.sdk.java.dto.CreateUserReqDto.Status.SUSPENDED);
        request.setEmail("email_3519");
        request.setPhone("phone_8055");
        request.setPhoneCountryCode("phoneCountryCode_4130");
        request.setUsername("username_3094");
        request.setExternalId("externalId_7338");
        request.setName("name_1588");
        request.setNickname("nickname_6895");
        request.setPhoto("photo_5427");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_1485");
        request.setCountry("country_5106");
        request.setProvince("province_8622");
        request.setCity("city_3163");
        request.setAddress("address_9380");
        request.setStreetAddress("streetAddress_8870");
        request.setPostalCode("postalCode_151");
        request.setCompany("company_6660");
        request.setBrowser("browser_7087");
        request.setDevice("device_8359");
        request.setGivenName("givenName_7564");
        request.setFamilyName("familyName_4933");
        request.setMiddleName("middleName_1099");
        request.setProfile("profile_8594");
        request.setPreferredUsername("preferredUsername_4676");
        request.setWebsite("website_8060");
        request.setZoneinfo("zoneinfo_8734");
        request.setLocale("locale_2750");
        request.setFormatted("formatted_694");
        request.setRegion("region_4948");
        request.setDepartmentIds(Collections.singletonList("String_3860"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_5969");
        request.setSalt("salt_4285");
        request.setTenantIds(Collections.singletonList("String_115"));
        request.setOtp(new cn.authing.sdk.java.dto.CreateUserOtpDto());
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}