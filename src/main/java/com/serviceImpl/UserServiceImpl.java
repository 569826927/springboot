package com.serviceImpl;

import com.config.RedisConfig;
import com.dao.UserDao;

import com.model.Users;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Client;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by admin on 2017/4/20.
 */
@Service(value="userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Autowired
    RedisConfig redisConfig;

    @Override
    public void addUser() {

        Set<HostAndPort> jedisClusterNode = new HashSet<>();
        jedisClusterNode.add(new HostAndPort("192.168.136.128",6379));
        jedisClusterNode.add(new HostAndPort("192.168.136.128",6380));
        JedisCluster jc = new JedisCluster(jedisClusterNode);
        jc.set("test","这是个测试");
        Jedis jedis = new Jedis("192.168.136.128",6379);
        System.out.println(jedis.get("test")+"========================");
        Users user= new Users();
        user.setUserName("我来啦");
        user.setAddress("福建前者");
        userDao.addUser(user);
    }
}
