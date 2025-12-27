package com.serene.thread;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < (1 << 4); i++) {
            System.out.println(getName() + "   第 " + (i + 1) + " 次执行了，输出：Hello world!");
        }
    }
}
