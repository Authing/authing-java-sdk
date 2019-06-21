package cn.authing.core.param;

import java.util.ArrayList;
import java.util.List;

public class UserPatchParam extends AuthingParam<UserPatchParam.Param> {

    public static class Builder {

        private List<String> idList = new ArrayList<>();
        private String ids;

        public void addUserId(String userId) {
            idList.add(userId);
        }

        public void removeUserId(String userId) {
            idList.remove(userId);
        }

        public void clear() {
            idList.clear();
        }

        public UserPatchParam build() {
            StringBuilder builder = new StringBuilder();
            int lastIndex = idList.size() - 1;
            for (int i = 0; i <= lastIndex; i++) {
                builder.append(idList.get(i));
                if (i != lastIndex) {
                    builder.append(',');
                }
            }
            ids = builder.toString();
            return new UserPatchParam(this);
        }
    }

    UserPatchParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.ids = builder.ids;
        this.setVariables(p);
    }

    static class Param {
        private String ids;
    }

    private static final String GRAPHQL =
            "query userPatch($ids: String){\n" +
                    "    userPatch(ids: $ids){\n" +
                    "      list {\n" +
                    "        _id\n" +
                    "        unionid\n" +
                    "        email\n" +
                    "        emailVerified\n" +
                    "        username\n" +
                    "        nickname\n" +
                    "        company\n" +
                    "        photo\n" +
                    "        browser\n" +
                    "        registerInClient\n" +
                    "        registerMethod\n" +
                    "        oauth\n" +
                    "        token\n" +
                    "        tokenExpiredAt\n" +
                    "        loginsCount\n" +
                    "        lastLogin\n" +
                    "        lastIP\n" +
                    "        signedUp\n" +
                    "        blocked\n" +
                    "        isDeleted\n" +
                    "        userLocation {\n" +
                    "          _id\n" +
                    "          when\n" +
                    "          where\n" +
                    "        }\n" +
                    "        userLoginHistory {\n" +
                    "          totalCount\n" +
                    "          list {\n" +
                    "            _id\n" +
                    "            when\n" +
                    "            success\n" +
                    "            ip\n" +
                    "            result\n" +
                    "          }\n" +
                    "        }\n" +
                    "      }\n" +
                    "      totalCount\n" +
                    "    }\n" +
                    "}";
}
