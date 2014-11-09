/*
 * @(#)BaseEntity.java Jun 7, 2014
 * 
 * Copyright (C) 2014 nowdo, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "uuidGenerator")
    @Column(name = "id", unique = true, nullable = false, length = 32)
    @GenericGenerator(name = "uuidGenerator", strategy = "uuid")
    private String id;
    @Column(columnDefinition = "timestamp default 0")
    private Date   createDate;
    @Column(columnDefinition = "timestamp default current_timestamp on update current_timestamp")
    private Date   updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

}
