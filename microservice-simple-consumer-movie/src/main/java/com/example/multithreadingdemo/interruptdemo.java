package com.example.multithreadingdemo;

public class interruptdemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run() {
                while (true){
                    if (Thread.currentThread().isInterrupted()){
                        System.out.println("break by interrupt");
                        break;
                    }
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        System.out.println("interruped when sleep");
                        Thread.currentThread().interrupt();
                    }
                    Thread.yield();
                }
            }
        };
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }
}
