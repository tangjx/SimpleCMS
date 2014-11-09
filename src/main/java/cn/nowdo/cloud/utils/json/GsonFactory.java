/*
 * @(#)GsonFactory.java Jul 18, 2014
 * 
 * Copyright (c) 2014 Wepu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

final class GsonFactory {
    private GsonFactory() {}

    private static GsonBuilder newGsonBuilder() {
        return new GsonBuilder();
    }

    public static Gson createGenericGson() {
        return newGsonBuilder().disableHtmlEscaping().create();
    }
}
