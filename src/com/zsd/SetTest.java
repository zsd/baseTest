package com.zsd;

import java.util.HashSet;
import java.util.Set;

/**
 * set集合的使用测试.
 * @author zhousd
 */
public class SetTest {

    private Set<String> set = new HashSet<String>();

    /**
     * 添加元素.
     */
    public void add(String str) {
        set.add(str);
    }

    /**
     * 获取元素测试.
     */
    public void get(String str) {
        System.out.println("Set中是否有元素[" + str + "] :" + set.contains(str));
    }

    public static void main(String args[]) {
        SetTest setTest = new SetTest();
        setTest.add("123");
        setTest.add("123");
        setTest.add("abc");
        setTest.get("123");
        setTest.get("abc");
        setTest.get("1");
    }
}
