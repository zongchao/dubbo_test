package com.neko.dubbo.redis.lock;

import net.sourceforge.groboutils.junit.v1.MultiThreadedTestRunner;
import net.sourceforge.groboutils.junit.v1.TestRunnable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by ssjk on 2016/12/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class RedisLockTest {

    @Autowired
    RedisLock redisLock;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void test2() {
        redisTemplate.opsForValue().set("a", "111aaa");
    }

    @Test
    public void test() throws Throwable {

        int count = 100;
        //Runner数组，想当于并发多少个。
        TestRunnable[] trs = new TestRunnable[count];

        for (int i = 0; i < count / 2; i++) {
            trs[i * 2] = new ThreadB();
            trs[i * 2 + 1] = new ThreadA();
        }
        MultiThreadedTestRunner mttr = new MultiThreadedTestRunner(trs);
        // 开发并发执行数组里定义的内容
        mttr.runTestRunnables();
    }


    private class ThreadA extends TestRunnable {
        @Override
        public void runTest() throws Throwable {
            final Printer outer = new Printer();
            outer.output("I am a boy.");
        }
    }

    private class ThreadB extends TestRunnable {
        @Override
        public void runTest() throws Throwable {
            final Printer outer = new Printer();
            outer.output("You are a girl.");
        }
    }

    class Printer {
        public void output(String name) {

            redisLock.lock("LOCK:print", 1000000);
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i));
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            redisLock.unlock("LOCK:print");
        }
    }
}
