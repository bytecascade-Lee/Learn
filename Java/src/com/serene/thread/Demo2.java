package com.serene.thread;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Demo2 {
    public static void main(String[] args) {
        /*
        多线程的第二种启动方式：
        1.自己定义一个类实现Runnable接口
        2.重写里面的run方法
        3.创建自己的类的对象
        4.创建一个Thread类的对象，并开启线程
         */
        MyThread2 thread1 = new MyThread2();
        MyThread2 thread2 = new MyThread2();
        MyThread2 thread3 = new MyThread2();

        Thread t1 = new Thread(thread1, "进程1");
        Thread t2 = new Thread(thread2, "进程2");
        Thread t3 = new Thread(thread3, "进程3");

        t1.start();
        t2.start();
        t3.start();
    }

}
