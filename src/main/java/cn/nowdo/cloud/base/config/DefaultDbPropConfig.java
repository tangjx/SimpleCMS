package cn.nowdo.cloud.base.config;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.DatabaseConfiguration;

import cn.nowdo.cloud.base.utils.SpringApplicationContext;

/**
 * Created by JasonLi on 14-11-3.
 */
public final class DefaultDbPropConfig {
    private static DefaultDbPropConfig config = new DefaultDbPropConfig();

    public DatabaseConfiguration dbConfig = SpringApplicationContext.getBeanByName("sysConf");

    private DefaultDbPropConfig() {
    }

    public static DefaultDbPropConfig getInstance() {
        return config;
    }

    public Configuration subset(String prefix) {
        return dbConfig.subset(prefix);
    }


    public boolean isEmpty() {
        return dbConfig.isEmpty();
    }


    public boolean containsKey(String key) {
        return dbConfig.containsKey(key);
    }


    public Object getProperty(String key) {
        return dbConfig.getProperty(key);
    }


    public Iterator getKeys(String prefix) {
        return dbConfig.getKeys(prefix);
    }


    public Iterator getKeys() {
        return dbConfig.getKeys();
    }


    public Properties getProperties(String key) {
        return dbConfig.getProperties(key);
    }


    public boolean getBoolean(String key) {
        return dbConfig.getBoolean(key);
    }


    public boolean getBoolean(String key, boolean defaultValue) {
        return dbConfig.getBoolean(key, defaultValue);
    }


    public Boolean getBoolean(String key, Boolean defaultValue) {
        return dbConfig.getBoolean(key, defaultValue);
    }


    public byte getByte(String key) {
        return dbConfig.getByte(key);
    }


    public byte getByte(String key, byte defaultValue) {
        return dbConfig.getByte(key, defaultValue);
    }


    public Byte getByte(String key, Byte defaultValue) {
        return dbConfig.getByte(key, defaultValue);
    }


    public double getDouble(String key) {
        return dbConfig.getDouble(key);
    }


    public double getDouble(String key, double defaultValue) {
        return dbConfig.getDouble(key, defaultValue);
    }


    public Double getDouble(String key, Double defaultValue) {
        return dbConfig.getDouble(key, defaultValue);
    }


    public float getFloat(String key) {
        return dbConfig.getFloat(key);
    }


    public float getFloat(String key, float defaultValue) {
        return dbConfig.getFloat(key, defaultValue);
    }


    public Float getFloat(String key, Float defaultValue) {
        return dbConfig.getFloat(key, defaultValue);
    }


    public int getInt(String key) {
        return dbConfig.getInt(key);
    }


    public int getInt(String key, int defaultValue) {
        return dbConfig.getInt(key, defaultValue);
    }


    public Integer getInteger(String key, Integer defaultValue) {
        return dbConfig.getInteger(key, defaultValue);
    }


    public long getLong(String key) {
        return dbConfig.getLong(key);
    }


    public long getLong(String key, long defaultValue) {
        return dbConfig.getLong(key, defaultValue);
    }


    public Long getLong(String key, Long defaultValue) {
        return dbConfig.getLong(key, defaultValue);
    }


    public short getShort(String key) {
        return dbConfig.getShort(key);
    }


    public short getShort(String key, short defaultValue) {
        return dbConfig.getShort(key, defaultValue);
    }


    public Short getShort(String key, Short defaultValue) {
        return dbConfig.getShort(key, defaultValue);
    }


    public BigDecimal getBigDecimal(String key) {
        return dbConfig.getBigDecimal(key);
    }


    public BigDecimal getBigDecimal(String key, BigDecimal defaultValue) {
        return dbConfig.getBigDecimal(key, defaultValue);
    }


    public BigInteger getBigInteger(String key) {
        return dbConfig.getBigInteger(key);
    }


    public BigInteger getBigInteger(String key, BigInteger defaultValue) {
        return dbConfig.getBigInteger(key, defaultValue);
    }


    public String getString(String key) {
        return dbConfig.getString(key);
    }


    public String getString(String key, String defaultValue) {
        return dbConfig.getString(key, defaultValue);
    }


    public String[] getStringArray(String key) {
        return dbConfig.getStringArray(key);
    }


    public List getList(String key) {
        return dbConfig.getList(key);
    }


    public List getList(String key, List defaultValue) {
        return dbConfig.getList(key, defaultValue);
    }
}
