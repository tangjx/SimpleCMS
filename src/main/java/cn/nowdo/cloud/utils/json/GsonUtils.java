/*
 * @(#)GsonUtil.java Jul 18, 2014
 * 
 * Copyright (c) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils.json;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

public final class GsonUtils {
    private static Logger logger = Logger.getLogger(GsonUtils.class);

    private static Gson cachedGson;

    private GsonUtils() {}

    private static Gson gson() {
        if (cachedGson == null) {
            cachedGson = GsonFactory.createGenericGson();
        }
        return cachedGson;
    }

    public static String toJson(Object src) {
        try {
            return gson().toJson(src);
        } catch (Exception e) {
            logger.error("toJson " + e);
        }
        return null;
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        try {
            return gson().fromJson(json, classOfT);
        } catch (Exception e) {
            logger.error("fromJson " + e);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(fromJson("--", GsonUtils.class));
        System.out.println(toJson(GsonUtils.class));
    }
}
