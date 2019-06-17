package cn.authing.core.param;

import java.util.ArrayList;
import java.util.List;

import cn.authing.core.business.ImportantParam;

public class RemoveUserParam extends AuthingParam<RemoveUserParam.Param> {

    public static class Builder {
        private String clientId;
        private List<String> idList = new ArrayList<>();

        public Builder(String userId) {
            idList.add(userId);
        }

        public RemoveUserParam build() {
            this.clientId = ImportantParam.INSTANCE.getClientId();
            return new RemoveUserParam(this);
        }
    }

    static class Param {
        private String registerInClient;
        private List<String> ids;
    }

    RemoveUserParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.ids = builder.idList;
        p.registerInClient = builder.clientId;
        this.setVariables(p);
    }

    private static final String GRAPHQL =
            "mutation removeUsers($ids: [String], $registerInClient: String, $operator: String){\n" +
                    "  removeUsers(ids: $ids, registerInClient: $registerInClient, operator: $operator) {\n" +
                    "    _id\n" +
                    "  }\n" +
                    "}";
}
