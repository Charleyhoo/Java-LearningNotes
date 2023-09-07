package com.example.learningnotes.Tread.xiancheng.MyCallable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        // 线程任务
        for (int i = 1; i < 100; i++) {
            System.out.println("女神 咱俩交往吧, I love you!!!");
        }
        // 女生给你的反馈
        return "一起去如家";
    }
}
