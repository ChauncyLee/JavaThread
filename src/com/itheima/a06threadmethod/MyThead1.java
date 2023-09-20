package com.itheima.a06threadmethod;

public class MyThead1 extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(getName() + ":" + i);
        }
    }
}
