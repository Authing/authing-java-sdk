package cn.authing.core.init;

import cn.authing.core.param.AuthingParam;

class InitParam extends AuthingParam<InitParam.Param> {

    private InitParam(Builder builder) {
        super(GRAPHQL);
        Param p = new Param();
        p.clientId = builder.clientId;
        p.secret = builder.secret;
        p.timestamp = builder.timestamp;
        p.nonce = builder.nonce;
        this.setVariables(p);
    }

    class Param {
        private String clientId;
        private String secret;
        private Long timestamp;
        private Integer nonce;
    }

    public static class Builder {
        private String clientId;
        private String secret;
        private Long timestamp;
        private Integer nonce;

        public Builder(String clientId) {
            this.clientId = clientId;
        }

        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder nonce(Integer nonce) {
            this.nonce = nonce;
            return this;
        }

        public InitParam build() {
            return new InitParam(this);
        }
    }

    private static final String GRAPHQL = "query getClientWhenSdkInit($secret: String, $clientId: String, $retUserId: Boolean, $timestamp: String, $signature: String, $nonce: Int){\n" +
            "    getClientWhenSdkInit(secret: $secret, clientId: $clientId, retUserId: $retUserId, timestamp: $timestamp, signature: $signature, nonce: $nonce){\n" +
            "      accessToken\n" +
            "      clientInfo {\n" +
            "        _id\n" +
            "        name\n" +
            "        descriptions\n" +
            "        jwtExpired\n" +
            "        createdAt\n" +
            "        isDeleted\n" +
            "        logo\n" +
            "        emailVerifiedDefault\n" +
            "        registerDisabled\n" +
            "        allowedOrigins\n" +
            "        clientType {\n" +
            "          _id\n" +
            "          name\n" +
            "          description\n" +
            "          image\n" +
            "          example\n" +
            "        }\n" +
            "      }\n" +
            "    }\n" +
            "}";
}
