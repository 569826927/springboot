package com.config;

import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Client;

/**
 * Created by admin on 2017/4/27.
 */
@Configuration
public class RedisConfig {
    protected Client client = null;



    public RedisConfig(){
        if (client == null)
            CreatClient();
    }

    public void CreatClient(){
        client = new Client( "192.168.136.128",  6379);

    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
