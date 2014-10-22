package com.zsd;

import java.util.List;

/**
 * ForEach循环测试.
 * Created by zhousd on 2014/9/26.
 */
public class ForEachTest {

    /**
     * 判断ForEach循环是否需要先判空.<p/>
     * 经测试，forEach循环前要做判空测试
     * @param stringList 测试字符串列表
     */
    public void NullTest(List<String> stringList) {
        try {
            for (String s : stringList) {
                System.out.println("s : " + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 判空测试
        List<String> stringList = null;
        ForEachTest forEachTest = new ForEachTest();
        forEachTest.NullTest(stringList);
    }
}
