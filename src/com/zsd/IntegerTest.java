package com.zsd;

/**
 * 整数转换测试.
 * @author zhousd
 */
public class IntegerTest {

    /**
     * 转换字符串测试.
     */
    public void parseTest() {
        String temp1 = "2002.0";

        //方法1,失败
        //int temp1Int = Integer.parseInt(temp1);

        //方法2,成功
        float temp1Float = Float.parseFloat(temp1);
        int temp1Int = (int) temp1Float;

        System.out.println("转换后的数字为：" + temp1Int);
    }

    /**
     * 测试传入的变量,会不会修改.
     */
    public void paramTest() {
        int i = 30;
        this.intModify(i);
        System.out.println("i is " + i);
    }

    private void intModify(int i) {
        i ++;
        System.out.println("i is " + i);
    }

    public static void main(String args[]) {
        IntegerTest it = new IntegerTest();
        it.parseTest();
        it.paramTest();
    }
}
