package cn.authing.core.param;

import cn.authing.core.business.ImportantParam;
import cn.authing.core.utils.AuthingUtils;

public class UpdatePhoneParam extends AuthingParam<UpdatePhoneParam.Param> {

    public static class Builder {
        private String clientId;
        private String phone;
        private String phoneCode;
        private String oldPhone;
        private String oldPhoneCode;

        public Builder(String phone, String phoneCode) {
            this.phone = phone;
            this.phoneCode = phoneCode;
        }

        public Builder(String phone, String phoneCode, String oldPhone, String oldPhoneCode) {
            this(phone, phoneCode);
            this.oldPhone = oldPhone;
            this.oldPhoneCode = oldPhoneCode;
        }

        public UpdatePhoneParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new UpdatePhoneParam(this);
        }
    }

    static class Param {
        private String userPoolId;
        private String phone;
        private String phoneCode;
        private String oldPhone;
        private String oldPhoneCode;
    }

    UpdatePhoneParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.userPoolId = builder.clientId;
        p.phone = builder.phone;
        p.phoneCode = builder.phoneCode;
        p.oldPhone = builder.oldPhone;
        p.oldPhoneCode = builder.oldPhoneCode;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation updatePhone(\n" +
                    "    $userPoolId: String!,\n" +
                    "    $phone: String!,\n" +
                    "    $phoneCode: String!,\n" +
                    "    $oldPhone: String,\n" +
                    "    $oldPhoneCode: String,\n" +
                    ") {\n" +
                    "  updatePhone(\n" +
                    "    userPoolId: $userPoolId,\n" +
                    "    phone: $phone,\n" +
                    "    phoneCode: $phoneCode,\n" +
                    "    oldPhone: $oldPhone,\n" +
                    "    oldPhoneCode: $oldPhoneCode,\n" +
                    "  ) {\n" +
                    "    _id\n" +
                    "    email\n" +
                    "    emailVerified\n" +
                    "    username\n" +
                    "    nickname\n" +
                    "    company\n" +
                    "    photo\n" +
                    "    browser\n" +
                    "    registerInClient\n" +
                    "    registerMethod\n" +
                    "    oauth\n" +
                    "    token\n" +
                    "    tokenExpiredAt\n" +
                    "    loginsCount\n" +
                    "    lastLogin\n" +
                    "    lastIP\n" +
                    "    signedUp\n" +
                    "    blocked\n" +
                    "    isDeleted\n" +
                    "  }\n" +
                    "}";
}
