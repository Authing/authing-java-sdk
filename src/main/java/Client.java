import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import moude.Option;
import moude.PostField;
import util.HttpClientUtil;
import util.RSAUtil;

import java.util.HashMap;
import java.util.Map;
import Exception.AuthingException;


/**
 * Created with IntelliJ IDEA.
 * User: yue
 * Date: 2018-05-29
 * Time: 6:22
 * Description:
 */
public class Client {

    private String ownerToken = "";
    private String userToken = "";
    private final String oathUrl = "https://oauth.authing.cn/graphql";
    private final String usersUrl = "https://users.authing.cn/graphql";

    public Client(String clientId, String secret)throws AuthingException {
        Option option= Option.builder()
                .putOption("id",clientId)
                .putOption("secret",secret)
                .build();
        ownerToken=getAccessToken(option);
    }

    private String getAccessToken(Option option)throws AuthingException {
        option.checkByKeys(new String[]{"id","secret"});
        String query
                = " query getAccessTokenByAppSecret($id: String!, $secret: String!)" +
                " { getAccessTokenByAppSecret(secret: $secret,clientId: $id) } ";

        PostField postField = new PostField(query,option);

        String resJson  = HttpClientUtil.doPost(usersUrl, postField,null);

        JSONObject res=JSON.parseObject(resJson);

        JSONObject data=res.getJSONObject("data");
        if (data==null||data.getString("getAccessTokenByAppSecret")==null
                ||data.getString("getAccessTokenByAppSecret")==""){
            throw new AuthingException("wrong clientId or secret");
        }else {
            return data.getString("getAccessTokenByAppSecret");
        }
    }

    public String register(Option option)throws AuthingException {
        option.checkByKeys(new String[]{"registerInClient","email","password"});
        String query="  mutation register(\n" +
                "    $unionid: String,\n" +
                "    $email: String, \n" +
                "    $password: String, \n" +
                "    $lastIP: String, \n" +
                "    $forceLogin: Boolean,\n" +
                "    $registerInClient: String!,\n" +
                "    $oauth: String,\n" +
                "    $username: String,\n" +
                "    $nickname: String,\n" +
                "    $registerMethod: String,\n" +
                "    $photo: String\n" +
                ") {\n" +
                "    register(userInfo: {\n" +
                "        unionid: $unionid,\n" +
                "        email: $email,\n" +
                "        password: $password,\n" +
                "        lastIP: $lastIP,\n" +
                "        forceLogin: $forceLogin,\n" +
                "        registerInClient: $registerInClient,\n" +
                "        oauth: $oauth,\n" +
                "        registerMethod: $registerMethod,\n" +
                "        photo: $photo,\n" +
                "        username: $username,\n" +
                "        nickname: $nickname\n" +
                "    }) {\n" +
                "        _id,\n" +
                "        email,\n" +
                "        emailVerified,\n" +
                "        username,\n" +
                "        nickname,\n" +
                "        company,\n" +
                "        photo,\n" +
                "        browser,\n" +
                "        password,\n" +
                "        token,\n" +
                "        group {\n" +
                "            name\n" +
                "        },\n" +
                "        blocked\n" +
                "    }\n" +
                "}";
        String password=(String)option.getBykey("password");
        try {
            option.updateValue("password", RSAUtil.encrypt(password));
        } catch (Exception e) {
            throw new AuthingException("encrypt password fail");
        }
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

    public String login(Option option)throws AuthingException {
        option.checkByKeys(new String[]{"registerInClient","email","password"});
        String query="mutation login($unionid: String, $email: String, $password: String, $lastIP: String, $registerInClient: String!, $verifyCode: String) {\n" +
                "    login(unionid: $unionid, email: $email, password: $password, lastIP: $lastIP, registerInClient: $registerInClient, verifyCode: $verifyCode) {\n" +
                "        _id\n" +
                "        email\n" +
                "        emailVerified\n" +
                "        username\n" +
                "        nickname\n" +
                "        company\n" +
                "        photo\n" +
                "        browser\n" +
                "        token\n" +
                "        tokenExpiredAt\n" +
                "        loginsCount\n" +
                "        lastLogin\n" +
                "        lastIP\n" +
                "        signedUp\n" +
                "        blocked\n" +
                "        isDeleted\n" +
                "    }\n" +
                "}";
        String password=(String)option.getBykey("password");
        try {
            option.updateValue("password", RSAUtil.encrypt(password));
        } catch (Exception e) {
            throw new AuthingException("encrypt password fail");
        }
        PostField postField=new PostField(query,option);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,null);
        JSONObject res=JSON.parseObject(resJson);
        JSONObject data=res.getJSONObject("data");
        if (data!=null){
            userToken=data.getString("token");
        }
        return resJson;
    }

    public String readOAuthList(Option option)throws AuthingException {
        option.checkByKey("clientId");
        String query="  query ReadOAuthList($clientId: String!) {\n" +
                "        ReadOauthList(clientId: $clientId) {\n" +
                "            _id\n" +
                "            name\n" +
                "            image\n" +
                "            description\n" +
                "            enabled\n" +
                "            client\n" +
                "            user\n" +
                "            url\n" +
                "        }\n" +
                "    }";
        PostField postField=new PostField(query,option);
        String resJson= HttpClientUtil.doPost(oathUrl,postField,null);
        return resJson;
    }

    public String user(Option option)throws AuthingException {
        option.checkByKeys(new String[]{"registerInClient","id"});
        String query="  query user($id: String!, $registerInClient: String!){\n" +
                "    user(id: $id, registerInClient: $registerInClient) {\n" +
                "        _id\n" +
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
                "    }\n" +
                "\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

    public String users(Option option)throws AuthingException {
        option.checkByKeys(new String[]{"registerInClient","page","count"});
        String query="query users($registerInClient: String, $page: Int, $count: Int){\n" +
                "  users(registerInClient: $registerInClient, page: $page, count: $count) {\n" +
                "    totalCount\n" +
                "    list {\n" +
                "      _id\n" +
                "      email\n" +
                "      emailVerified\n" +
                "      username\n" +
                "      nickname\n" +
                "      company\n" +
                "      photo\n" +
                "      browser\n" +
                "      password\n" +
                "      registerInClient\n" +
                "      token\n" +
                "      tokenExpiredAt\n" +
                "      loginsCount\n" +
                "      lastLogin\n" +
                "      lastIP\n" +
                "      signedUp\n" +
                "      blocked\n" +
                "      isDeleted\n" +
                "      group {\n" +
                "        _id\n" +
                "        name\n" +
                "        descriptions\n" +
                "        createdAt\n" +
                "      }\n" +
                "      clientType {\n" +
                "        _id\n" +
                "        name\n" +
                "        description\n" +
                "        image\n" +
                "        example\n" +
                "      }\n" +
                "      userLocation {\n" +
                "        _id\n" +
                "        when\n" +
                "        where\n" +
                "      }\n" +
                "      userLoginHistory {\n" +
                "        totalCount\n" +
                "        list{\n" +
                "          _id\n" +
                "          when\n" +
                "          success\n" +
                "          ip\n" +
                "          result\n" +
                "        }\n" +
                "      }\n" +
                "      systemApplicationType {\n" +
                "        _id\n" +
                "        name\n" +
                "        descriptions\n" +
                "        price\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }


    public String checkLoginStatus(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        String query="query checkLoginStatus {\n" +
                "    checkLoginStatus {\n" +
                "        status\n" +
                "        code\n" +
                "        message\n" +
                "    }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

    public String removeUsers(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        option.checkByKeys(new String[]{"ids","registerInClient"});
        String query="mutation removeUsers($ids: [String], $registerInClient: String, $operator: String){\n" +
                "  removeUsers(ids: $ids, registerInClient: $registerInClient, operator: $operator) {\n" +
                "    _id\n" +
                "  }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }


    public String sendVerifyEmail(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        option.checkByKeys(new String[]{"email","client"});
        String query="mutation sendVerifyEmail(\n" +
                "    $email: String!,\n" +
                "    $client: String!\n" +
                "){\n" +
                "    sendVerifyEmail(\n" +
                "        email: $email,\n" +
                "        client: $client\n" +
                "    ) {\n" +
                "        message,\n" +
                "        code,\n" +
                "        status\n" +
                "    }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }


    public String sendResetPasswordEmail(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        option.checkByKeys(new String[]{"email","client"});
        String query="mutation sendResetPasswordEmail(\n" +
                "    $email: String!,\n" +
                "    $client: String!\n" +
                "){\n" +
                "    sendResetPasswordEmail(\n" +
                "        email: $email,\n" +
                "        client: $client\n" +
                "    ) {\n" +
                "          message\n" +
                "          code\n" +
                "    }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

    public String verifyResetPasswordVerifyCode(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        option.checkByKeys(new String[]{"email","client","verifyCode"});
        String query="mutation verifyResetPasswordVerifyCode(\n" +
                "    $email: String!,\n" +
                "    $client: String!,\n" +
                "    $verifyCode: String!\n" +
                ") {\n" +
                "    verifyResetPasswordVerifyCode(\n" +
                "        email: $email,\n" +
                "        client: $client,\n" +
                "        verifyCode: $verifyCode\n" +
                "    ) {\n" +
                "          message\n" +
                "          code\n" +
                "    }\n" +
                "}";
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

    public String changePassword(Option option)throws AuthingException {
        if (ownerToken==""||ownerToken==null){
            throw new AuthingException("can not find ownerToken,please login again");
        }
        option.checkByKeys(new String[]{"email","client","verifyCode","password"});
        String query="mutation changePassword(\n" +
                "    $email: String!,\n" +
                "    $client: String!,\n" +
                "    $password: String!,\n" +
                "    $verifyCode: String!\n" +
                "){\n" +
                "    changePassword(\n" +
                "        email: $email,\n" +
                "        client: $client,\n" +
                "        password: $password,\n" +
                "        verifyCode: $verifyCode\n" +
                "    ) {\n" +
                "        _id\n" +
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
                "    }\n" +
                "}";
        String password=(String)option.getBykey("password");

        try {
            option.updateValue("password", RSAUtil.encrypt(password));
        } catch (Exception e) {
            throw new AuthingException("encrypt password fail");
        }
        PostField postField=new PostField(query,option);
        Map header=new HashMap();
        header.put("Authorization","Bearer "+ownerToken);
        String resJson= HttpClientUtil.doPost(usersUrl,postField,header);
        return resJson;
    }

}
