package util;
import com.alibaba.fastjson.JSON;
import moude.PostField;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.util.Map;

public class HttpClientUtil {
    public static String doPost(String url, PostField postField, Map<String,String>headMap){
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try {
            httpClient = new SSLClient();
            httpPost = new HttpPost(url);
            httpPost.addHeader("Content-Type", "application/json");
            if (headMap != null) {
                for (Map.Entry<String, String> entry : headMap.entrySet()) {
                    httpPost.addHeader(entry.getKey(), entry.getValue());
                }
            }
            StringEntity se = new StringEntity(JSON.toJSONString(postField));
            se.setContentType("text/json");
            se.setContentEncoding(new BasicHeader("Content-Type", "application/json"));
            httpPost.setEntity(se);
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null) {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = EntityUtils.toString(resEntity, "utf-8");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}