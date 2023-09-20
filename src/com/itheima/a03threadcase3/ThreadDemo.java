package com.itheima.a03threadcase3;


import com.itheima.a02threadcase2.MyRun;

import java.util.concurrent.FutureTask;

public class ThreadDemo {

    public static void main(String[] args) {
        /*
        多线程的第三种启动方式
        特点：可以获取到多线程运行的结果

        1. 创建一个类 MyCallable 实现 Callable 接口
        2. 重写 call 方法（是有返回值的，表示多线程运行的结果）

        3. 创建MyCallable对象（表示多线程要执行的任务）
        4. 创建FutureTask的对象（作用管理多线程运行的结果）
        5. 创建Thread类的对象，并启动（表示线程）
         */

        //1. 创建MyCallable对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //2. 创建Future的对象（作用管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //3. 创建Thread类的对象，并启动（表示线程）
        Thread t = new Thread(ft);
        //4. 启动线程
        t.start();

        //5. 获取多线程运行的结果
        try {
            Integer sum = ft.get();
            System.out.println("多线程运行的结果是：" + sum);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
