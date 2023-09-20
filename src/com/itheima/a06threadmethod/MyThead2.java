package com.itheima.a06threadmethod;

public class MyThead2 extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + ":" + i);
        }
    }
}
