package com.zsd;

import java.util.Calendar;

/**
 * 日期测试类.
 * @author zhousd
 */
public class DateTest {

    /**
     * 使用Calendar类获取月份测试.
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
