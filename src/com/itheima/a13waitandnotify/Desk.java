package com.itheima.a13waitandnotify;

public class Desk {

    /*
    作用：控制生产者和消费者的执行
     */

    // 是否有面条 0：没有 1：有
    public static int foodFlag = 0;

    // 面条的数量即要执行的次数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();


}
