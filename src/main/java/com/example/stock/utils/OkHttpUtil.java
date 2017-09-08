package com.example.stock.utils;

import okhttp3.*;

import java.io.IOException;

public class OkHttpUtil {
    public static final MediaType mediaType
            = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    public String run(String url, String appcode) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .addHeader("Authorization", "APPCODE " + appcode)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(mediaType, json);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
