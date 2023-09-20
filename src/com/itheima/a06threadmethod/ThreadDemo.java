package com.itheima.a06threadmethod;


import com.itheima.a05threadmethod.MyRunnable;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        /*
       final void setDaemon(boolean on)：将该线程标记为守护线程或用户线程。
         细节：
            当其他的非守护线程执行完毕之后，守护线程会陆续结束
         通俗易懂：
            当女神线程结束了，那么备胎也没有存在的必要了，所以备胎也结束了
         */

        MyThead1 t1 = new MyThead1();
        MyThead2 t2 = new MyThead2();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
