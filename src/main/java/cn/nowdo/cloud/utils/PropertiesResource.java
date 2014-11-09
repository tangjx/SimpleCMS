/*
 * @(#)PropertiesResource Jun 14, 2014
 * 
 * Copyright (c) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.utils;

import static java.util.Objects.requireNonNull;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import org.apache.commons.configuration2.ImmutableConfiguration;
import org.apache.log4j.Logger;

import cn.nowdo.cloud.base.constants.DatabaseConfigKeys;
import cn.nowdo.cloud.base.utils.SpringApplicationContext;

public final class PropertiesResource {
    private static Logger logger = Logger.getLogger(PropertiesResource.class);

    private static final String I18N_MESSAGE_PATH = "i18n/message";
    private static final String SYSTEM_CONFIG_PATH = "conf/system";

    private static ResourceBundle i18nResourceBundle;
    private static ResourceBundle systemResourceBundle;
    private static ImmutableConfiguration systemConfig;

    private static ResourceBundle loadResourceBundle(String baseName) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(requireNonNull(baseName));
        return requireNonNull(resourceBundle);
    }

    private static ResourceBundle getI18nResourceBundle() {
        if (i18nResourceBundle == null) {
            i18nResourceBundle = loadResourceBundle(I18N_MESSAGE_PATH);
        }
        return i18nResourceBundle;
    }

    @Deprecated
    private static ResourceBundle getSystemResourceBundle() {
        if (systemResourceBundle == null) {
            systemResourceBundle = loadResourceBundle(SYSTEM_CONFIG_PATH);
        }
        return systemResourceBundle;
    }

    private static ImmutableConfiguration getSystemConfiguration() {
        if (systemConfig == null) {
            systemConfig = SpringApplicationContext.getBeanByName(DatabaseConfigKeys.BEAN_NAME);
        }
        return systemConfig;
    }

    public static String getI18nString(String key) {
        return getString(getI18nResourceBundle(), key);
    }

    public static String getI18nString(String key, Object... arguments) {
        return getString(getI18nResourceBundle(), key, arguments);
    }

    public static String getSystemString(String key) {
        return getString(getSystemConfiguration(), key);
    }

    public static String getSystemString(String key, Object... arguments) {
        return getString(getSystemConfiguration(), key, arguments);
    }

    private static String getString(ResourceBundle resourceBundle, String key, Object... arguments) {
        return MessageFormat.format(requireNonNull(resourceBundle)
                .getString(requireNonNull(key)), arguments);
    }

    private static String getString(ImmutableConfiguration configuration, String key, Object... arguments) {
        return MessageFormat.format(requireNonNull(configuration)
                .getString(requireNonNull(key)), arguments);
    }
}
