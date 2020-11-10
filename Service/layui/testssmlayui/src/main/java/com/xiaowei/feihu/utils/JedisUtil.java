package com.xiaowei.feihu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.Set;

@Component
public class JedisUtil {

    @Autowired
    private JedisPool jedisPool;

    public Jedis jedisResource(){
        Jedis resource = jedisPool.getResource();
        return resource;
    }

    public String set(byte[] key, byte[] walue){
        Jedis jedis=jedisResource();
        try {
            return jedis.set(key,walue);
        } finally {
            jedis.close();
        }
    }

    public byte[] get(byte[] key){
        Jedis jedis=jedisResource();
        try {
            return jedis.get(key);
        } finally {
            jedis.close();
        }
    }
    public void expire(byte[] key,int i){
        Jedis jedis=jedisResource();
        try {
            jedis.expire(key,i);
        } finally {
            jedis.close();
        }
    }
    public void del(byte[] key){
        Jedis jedis=jedisResource();
        try {
            jedis.del(key);
        } finally {
            jedis.close();
        }
    }
    public Set<byte[]> keys(String key){
        Jedis jedis=jedisResource();
        try {
            return  jedis.keys((key + "*").getBytes());
        } finally {
            jedis.close();
        }
    }


}
