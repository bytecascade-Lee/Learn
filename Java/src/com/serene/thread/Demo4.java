package com.serene.thread;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        /*
        String getName()                            返回此线程的名称
        void setName(String name)                   设置线程的名字（构造方法也可以设置名字）
            细节：
                如果我们没有给线程设置名字，线程也是有默认的名字的
            格式：
                Thread-X（X序号，从0开始）

        static Thread currentThread()               获取当前线程的对象
            细节：
                当JVM虚拟机启动之后，会自动的启动多条线程
                其中有一条线程就叫做main线程
                他的作用就是去调用main方法，并执行里面的代码
                在以前，我们写的所有的代码，其实都是运行在main线程当中

        static void sleep(long time)                让线程休眠指定的时间，单位为毫秒
            细节：
                1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
                2、方法的参数：就表示睡眠的时间，单位毫秒，1秒=1000毫秒
                3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码

        setPriority(int newPriority)                设置线程的优先级
        final int getPriority()                     获取线程的优先级
        final void setDaemon(boolean on)            设置为守护线程
        public static void yield()                  出让线程/礼让线程
        public static void join()                   插入线程/插队线程
         */
        Thread t1 = new MyThread1();
        String name = t1.getName();
        System.out.println(name);
        t1.start();
        Thread.sleep(5000);
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());


    }

}
