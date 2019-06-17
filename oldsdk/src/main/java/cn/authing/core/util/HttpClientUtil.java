package cn.authing.core.util;

import com.alibaba.fastjson.JSON;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import cn.authing.core.moude.PostField;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class HttpClientUtil {

    private static HttpClient httpClient;
    private static OkHttpClient okHttpClient;

    static {
        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new SecureRandom());

            SSLSocketFactory ssfFactory = sc.getSocketFactory();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(ssfFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                                         @Override
                                         public boolean verify(String hostname, SSLSession session) {
                                             return true;

                                         }
                                     }
            );
            okHttpClient = builder.build();
        } catch (Exception e) {
        }
    }

    public static String doPost(String url, PostField postField, Map<String, String> headMap) {
        RequestBody body = RequestBody.create(MediaType.get("application/json; charset=utf-8"), JSON.toJSONString(postField));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        String result = null;
        try {
            result = okHttpClient.newCall(request).execute().body().string();
        }catch (Exception e){
            e.printStackTrace();
        }
//        HttpPost httpPost = null;
//        String result = null;
//        try {
//            httpPost = new HttpPost(url);
//            httpPost.addHeader("Content-Type", "application/json");
//            if (headMap != null) {
//                for (Map.Entry<String, String> entry : headMap.entrySet()) {
//                    httpPost.addHeader(entry.getKey(), entry.getValue());
//                }
//            }
//            StringEntity se = new StringEntity(JSON.toJSONString(postField));
//            se.setContentType("text/json");
//            se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
//            httpPost.setEntity(se);
//            HttpResponse response = httpClient.execute(httpPost);
//            if (response != null) {
//                HttpEntity resEntity = response.getEntity();
//                if (resEntity != null) {
//                    result = EntityUtils.toString(resEntity, "utf-8");
//                }
//            }
//
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        return result;
    }
}