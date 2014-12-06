package com.zsd;

/**
 * 时间输出测试.
 * @author zhousd
 */
public class PrintTimeTest {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); // 毫秒
        System.out.println(System.nanoTime()); // 纳秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}
