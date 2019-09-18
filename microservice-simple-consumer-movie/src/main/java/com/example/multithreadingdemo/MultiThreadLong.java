package com.example.multithreadingdemo;

public class MultiThreadLong {
    public static long t=0;
    public static class ChangeT implements Runnable{
        private long to;

        public ChangeT(long to) {
            this.to = to;
        }

        @Override
        public void run() {
            while(true){
                MultiThreadLong.t=to;
                Thread.yield();
            }
        }
    }
    public static class ReadT implements Runnable{

        @Override
        public void run() {
            while(true){
                long tmp = MultiThreadLong.t;
                if( 111L != tmp && tmp!=-999L &&tmp!=333L&&tmp!=-444L)
                System.out.println(tmp);
                Thread.yield();
            }
        }
    }
//仅当32位的虚拟机才会出现错误
    public static void main(String[] args) {
        System.out.println("启动");
        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999L)).start();
        new Thread(new ChangeT(333L)).start();
        new Thread(new ChangeT(-444L)).start();
        new Thread(new ReadT()).start();
    }
}
