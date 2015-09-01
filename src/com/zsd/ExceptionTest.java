package com.zsd;

/**
 * �쳣����.
 * @author zhousd
 */
public class ExceptionTest {

    /**
     * ����׳��쳣����쳣��Ϣ.
     */
    public void throwMethod() {
        try {
            try {
                try {
                    throw new Exception("test");
                } catch (Exception e) {
                    System.out.println("1��the exception message is :" + e.getMessage());
                    throw new Exception(e.getMessage(), e);
                }
            } catch (Exception e) {
                System.out.println("2��the exception message is :" + e.getMessage());
                throw new Exception(e);
            }
        } catch (Exception e) {
            System.out.println("3��the exception message is :" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        et.throwMethod();
    }
}
