package com.example.learningnotes.Tread.xiancheng.DemoTimer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Mr.乐
 * @Description 线程与定时器的执行轨迹不同
 */
public class DemoTimer {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "<--->" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        //定时器实现
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "---" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.gc();//将编程垃圾的定时器进行回收
            }
        },5000);
    }
}
