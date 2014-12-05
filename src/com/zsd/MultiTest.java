package com.zsd;

/**
 * 乘法测试.
 * @author zhousd
 */
public class MultiTest {

    /**
     * 最快速的方式计算一个数字乘以2的X次方.
     */
    public void quickMulti() {
        //计算2*8=2*2的3次方
        System.out.println(2<<3);//8=2的3次方为8
        //计算2*16=2*2的4次方
        System.out.println(2<<4);//16=2的4次方为16
        //计算3*8=2*2的3次方
        System.out.println(3<<3);//8=2的3次方为8
        //计算5*8=5*2的3次方
        System.out.println(5<<3);//8=2的3次方为8
        //计算6*4=6*2的2次方
        System.out.println(6<<2);//4=2的2次方为4
    }

    public static void main(String args[]) {
        MultiTest multiTest = new MultiTest();
        multiTest.quickMulti();
    }
}
