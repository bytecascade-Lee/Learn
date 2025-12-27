package com.serene.thread;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class MyThread2 implements Runnable{

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < (1 << 4); i++) {
            System.out.println(name + "   第 " + (i + 1) + " 次执行了，输出：Hello world!");
        }
    }
}
