package com.itheima.a09threadsafe1;

public class MyThread extends Thread {

    // 表示这个类的所有对象，都共享ticket数据
    static int ticket = 0;

    // 锁对象，一定要是唯一的，通过static关键字实现
    static Object obj = new Object();

    @Override
    public void run(){
        while (true) {
            // 同步代码块，解决线程安全问题
            synchronized(obj){
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                    ticket++;
                }else{
                    break;
                }

            }
        }
    }
}
