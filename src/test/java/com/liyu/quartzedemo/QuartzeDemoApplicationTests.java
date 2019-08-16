package com.liyu.quartzedemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Timer;
import java.util.TimerTask;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzeDemoApplicationTests {

    @Test
    public void testTimer() throws InterruptedException {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };
        timer.schedule(timerTask,5000);
        System.out.println("----"+System.currentTimeMillis());
        Thread.sleep(10000);
    }

}
