package com.okay;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {

    public static String convertToJson(Object object) {
        return createGson().toJson(object);
    }

    public static Object convertToObject(String json, Class className) {
        return createGson().fromJson(json, className);
    }

    private static Gson createGson() {
        GsonBuilder builder = new GsonBuilder();
        return builder.create();
    }
}