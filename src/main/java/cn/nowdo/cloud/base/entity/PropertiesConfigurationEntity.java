/*
 * @(#)PropertiesConfigurationEntity 2014年9月2日
 * 
 * Copyright (c) 2014 Wepu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "t_prop_conf", uniqueConstraints = {@UniqueConstraint(columnNames = "keyName")})
public class PropertiesConfigurationEntity extends BaseEntity {
    private String keyName;
    private String valueName;
    private String description;

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
