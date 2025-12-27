package com.serene.thread;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Demo1 {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();
        MyThread1 thread3 = new MyThread1();

        thread1.setName("线程1");
        thread2.setName("线程2");
        thread3.setName("线程3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
