package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateUserTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(cn.authing.sdk.java.dto.CreateUserReqDto.Status.SUSPENDED);
        request.setEmail("email_5871");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_3782");
        request.setPhoneCountryCode("phoneCountryCode_1901");
        request.setUsername("username_4551");
        request.setExternalId("externalId_4262");
        request.setName("name_5840");
        request.setNickname("nickname_7676");
        request.setPhoto("photo_3293");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_5035");
        request.setCountry("country_290");
        request.setProvince("province_2280");
        request.setCity("city_4037");
        request.setAddress("address_2243");
        request.setStreetAddress("streetAddress_574");
        request.setPostalCode("postalCode_5938");
        request.setCompany("company_425");
        request.setBrowser("browser_4590");
        request.setDevice("device_8009");
        request.setGivenName("givenName_6555");
        request.setFamilyName("familyName_7399");
        request.setMiddleName("middleName_4892");
        request.setProfile("profile_2932");
        request.setPreferredUsername("preferredUsername_9746");
        request.setWebsite("website_214");
        request.setZoneinfo("zoneinfo_8536");
        request.setLocale("locale_3038");
        request.setFormatted("formatted_4501");
        request.setRegion("region_4085");
        request.setDepartmentIds(Collections.singletonList("String_1227"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_6344");
        request.setSalt("salt_9076");
        request.setTenantIds(Collections.singletonList("String_6122"));
        request.setOtp(new cn.authing.sdk.java.dto.CreateUserOtpDto());
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}