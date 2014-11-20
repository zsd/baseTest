package com.zsd;

/**
 * 线程Join测试.
 * @author zhousd
 */
public class JoinTest {

    private RunnableImpl ri = new RunnableImpl("first", 1500);

    private RunnableImpl ri1 = new RunnableImpl("second", 500);

    public static void main(String[] args) {
        JoinTest jt = new JoinTest();
        Thread t = new Thread(jt.ri);
        Thread t1 = new Thread(jt.ri1);
        t.start();
        t1.start();
        try {
            t.join(1000); // 主线程只等1000毫秒
            t1.join(1000);
            System.out.println("joinFinish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 线程类.
     */
    class RunnableImpl implements Runnable {

        private int waitTime = 0; // 线程wait的时间

        private String name = ""; // 线程名称

        public RunnableImpl() {
            super();
        }

        public RunnableImpl(String name, int waitTime) {
            this();
            this.name = name;
            this.waitTime = waitTime;
        }

        public void run() {
            try {
                System.out.println(this.name + " Begin sleep");
                Thread.sleep(this.waitTime);
                System.out.println(this.name + " End sleep");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}