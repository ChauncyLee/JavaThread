package com.itheima.a04threadmethod;



public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        /*
        String getName() 返回该线程的名称。
        细节：
            1. 如果我们没有给线程设置名字，线程的名字默认是：Thread-0, Thread-1, Thread-2, ...
            2. 如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置
        static Thread currentThread() 获取当前线程的对象
        细节：
            当JVM虚拟机启动之后，会自动启动多条线程
            其中有一条线程就叫做main线程
            他的作用就说去调用main方法，并执行里面的代码
            在以前，我们写的所有代码，其实都是运行在main线程中
             主线程的名字是：main
             子线程的名字是：Thread-0, Thread-1, Thread-2, ...

        void setName(String name) 设置线程的名字（构造方法也可以设置名字） 。

        static void sleep(long millis) 让当前线程休眠指定时间，单位为毫秒。
        细节：
            1. 哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
            2. 方法的参数： 就表示睡眠的时间，单位毫秒
                1000毫秒 = 1秒
            3. 休眠时间结束之后，线程会自动醒来，继续执行后面的代码
         */

        //1. 创建线程的ui想
        MyThread t1 = new MyThread("飞机");
        MyThread t2 = new MyThread("坦克");

        // 开启线程
        t1.start();
        t2.start();

      /*  Thread t = Thread.currentThread();
        System.out.println(t.getName());*/

       /* System.out.println("111111");
        Thread.sleep(5000);
        System.out.println("222222");*/
    }
}
