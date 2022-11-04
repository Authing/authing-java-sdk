package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateUserTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(cn.authing.sdk.java.dto.CreateUserReqDto.Status.SUSPENDED);
        request.setEmail("email_2134");
        request.setPhone("phone_9465");
        request.setPhoneCountryCode("phoneCountryCode_3085");
        request.setUsername("username_1901");
        request.setExternalId("externalId_3472");
        request.setName("name_3249");
        request.setNickname("nickname_5301");
        request.setPhoto("photo_1057");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_6347");
        request.setCountry("country_6305");
        request.setProvince("province_4405");
        request.setCity("city_1755");
        request.setAddress("address_1600");
        request.setStreetAddress("streetAddress_8921");
        request.setPostalCode("postalCode_7142");
        request.setCompany("company_973");
        request.setBrowser("browser_8583");
        request.setDevice("device_3888");
        request.setGivenName("givenName_625");
        request.setFamilyName("familyName_3922");
        request.setMiddleName("middleName_3185");
        request.setProfile("profile_9296");
        request.setPreferredUsername("preferredUsername_8937");
        request.setWebsite("website_4879");
        request.setZoneinfo("zoneinfo_7183");
        request.setLocale("locale_938");
        request.setFormatted("formatted_6433");
        request.setRegion("region_6520");
        request.setPassword("password_368");
        request.setSalt("salt_6944");
        request.setTenantIds(Collections.singletonList("String_7044"));
        request.setOtp(new cn.authing.sdk.java.dto.CreateUserOtpDto());
        request.setDepartmentIds(Collections.singletonList("String_4261"));
        request.setCustomData(Collections.emptyList());
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}