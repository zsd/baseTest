package com.zsd;

import java.util.Calendar;

/**
 * ���ڲ�����.
 * @author zhousd
 */
public class DateTest {

    /**
     * ʹ��Calendar���ȡ�·ݲ���.
     */
    public void getMonth() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        System.out.print("month = " + month);
    }

    public static void main(String args[]) {
        DateTest dt = new DateTest();
        dt.getMonth();
    }
}
