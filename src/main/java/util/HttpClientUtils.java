package util;

import client.BaseClient;
import model.AuthingRequestConfig;
import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author luojielin
 */
public class HttpClientUtils {

    private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(50L,TimeUnit.SECONDS)
                        .readTimeout(60L, TimeUnit.SECONDS)
                        .build();



}
