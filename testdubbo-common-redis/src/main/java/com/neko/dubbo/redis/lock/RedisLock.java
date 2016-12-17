package com.neko.dubbo.redis.lock;

import com.google.common.collect.Maps;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by ssjk on 2016/12/17.
 */
@Component
public class RedisLock {

    @Autowired
    protected RedisTemplate redisTemplate;

    private static final Logger logger = Logger.getLogger(RedisLock.class);

    // lock flag stored in redis
    private static final String LOCKED = "TRUE";

    // timeout(ms)
    private static final long TIME_OUT = 30000;

    // lock expire time(s)
    public static final int EXPIRE = 60;

    // private Jedis jedis;
    private String key;

    // state flag
    private volatile boolean locked = false;


    private static ConcurrentMap<String, RedisLock> map = Maps.newConcurrentMap();

    public RedisLock() {
//        this.key = "_LOCK_" + key;
//        redisTemplate = (StringRedisTemplate) ApplicationContextHolder.getBean("redisTemplate");
    }
//
//    public static RedisLock getInstance(String key) {
//        return map.getOrDefault(key, new RedisLock(key));
//    }

    public synchronized void lock(String key,long timeout) {
        long nano = System.nanoTime();
        timeout *= 1000000;
        final Random r = new Random();
        try {
            while ((System.nanoTime() - nano) < timeout) {
                if (redisTemplate.getConnectionFactory().getConnection().setNX(key.getBytes(), LOCKED.getBytes())) {
                    redisTemplate.expire(key, EXPIRE, TimeUnit.SECONDS);
                    locked = true;
                    logger.debug("add RedisLock[" + key + "].");
                    break;
                }
                Thread.sleep(3, r.nextInt(500));
            }
        } catch (Exception e) {
        }
    }

    public synchronized void unlock(String key) {
        if (locked) {
            logger.debug("release RedisLock[" + key + "].");
            redisTemplate.delete(key);
        }
    }

//    @Override
//    public void lock() {
//        lock(TIME_OUT);
//    }

    public void lockInterruptibly() throws InterruptedException {

    }

    public Condition newCondition() {
        return null;
    }

    public boolean tryLock() {
        return false;
    }

    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }
}