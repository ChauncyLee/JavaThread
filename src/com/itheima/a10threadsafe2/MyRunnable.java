package com.itheima.a10threadsafe2;

public class MyRunnable implements Runnable {
    // MyRunnable 是Thread的参数对象，只创建一次，所以ticket只有一个，不需要用static来修饰

    int ticket = 0;

    @Override
    public void run() {
        while (true) {
            if (method()) {
                break;
            }
        }
    }

    // 此时不是静态方法，锁对象是this
    private synchronized boolean method() {
        // 买票
        if (ticket < 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket++;
        } else {
            return true;
        }
        return false;
    }
}
