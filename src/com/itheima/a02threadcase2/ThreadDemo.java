package com.itheima.a02threadcase2;


public class ThreadDemo {

    public static void main(String[] args) {
        /*
        多线程的第二种启动方式
        1. 自己定义一个类实现Runnable接口
        2. 重写run方法
        3. 创建自定义类的对象
        4. 创建Thread对象, 传入自定义类的对象
         */

        // 创建MyRun的对象
        // 表示多线程要执行的任务
        MyRun myRun = new MyRun();
        // 创建Thread对象, 传入自定义类的对象
        Thread t1 = new Thread(myRun);
        Thread t2 = new Thread(myRun);

        t1.setName("线程1");
        t2.setName("线程2");

        // 启动线程
        t1.start();
        t2.start();



    }
}
