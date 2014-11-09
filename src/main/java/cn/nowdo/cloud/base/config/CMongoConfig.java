/*
 * @(#)CMongoConfig 2014年7月22日
 * 
 * Copyright (c) 2014 Wepu, Inc. All rights reserved.
 */
package cn.nowdo.cloud.base.config;

import static cn.nowdo.cloud.base.constants.DatabaseConfigKeys.DB_MONGO_DATABASE_NAME;
import static cn.nowdo.cloud.base.constants.DatabaseConfigKeys.DB_MONGO_LAN_HOSTS;
import static cn.nowdo.cloud.base.constants.DatabaseConfigKeys.DB_MONGO_LAN_PORTS;
import static cn.nowdo.cloud.base.constants.DatabaseConfigKeys.DB_MONGO_PASSWORD;
import static cn.nowdo.cloud.base.constants.DatabaseConfigKeys.DB_MONGO_USER_NAME;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.configuration2.ImmutableConfiguration;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;

//@Configuration
//@ComponentScan(basePackages = {"cn.*"})
//@EnableMongoRepositories
//public class CMongoConfig extends AbstractMongoConfiguration {
//    Logger logger = Logger.getLogger(CMongoConfig.class);
//
//    @Autowired
//    @Qualifier("sysConf")
//    private ImmutableConfiguration config;
//
//    @Override
//    protected String getDatabaseName() {
//        return config.getString(DB_MONGO_DATABASE_NAME);
//    }
//
//    @Override
//    public Mongo mongo() throws Exception {
//        logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>Start MongoDb Configuration>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//        MongoClientOptions opts = new MongoClientOptions.Builder().connectTimeout(3000).build();
//
//        ArrayList<ServerAddress> servers = new ArrayList<ServerAddress>();
//        ArrayList<MongoCredential> credentials = new ArrayList<MongoCredential>();
//        String[] hosts = config.getStringArray(DB_MONGO_LAN_HOSTS);
//        String[] ports = config.getStringArray(DB_MONGO_LAN_PORTS);
//
//        logger.debug("MongoDb hosts: " + Arrays.toString(hosts));
//        logger.debug("MongoDb ports: " + Arrays.toString(ports));
//
//        if (ArrayUtils.isNotEmpty(hosts) && ArrayUtils.isNotEmpty(ports) && ArrayUtils.isSameLength(hosts, ports)) {
//            for (int i = 0; i < hosts.length; i++) {
//                servers.add(new ServerAddress(hosts[i], Integer.parseInt(ports[i])));
//                credentials.add(MongoCredential.createMongoCRCredential(
//                        config.getString(DB_MONGO_USER_NAME),
//                        config.getString(DB_MONGO_DATABASE_NAME),
//                        config.getString(DB_MONGO_PASSWORD).toCharArray()));
//            }
//        } else {
//            throw new RuntimeException("cmongo config hosts and ports not match");
//        }
//        MongoClient mongo = new MongoClient(servers, credentials, opts);
//        mongo.setReadPreference(ReadPreference.secondaryPreferred());
//
//        logger.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        return mongo;
//    }
//}
