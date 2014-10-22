package com.zsd;

/**
 * 字符串替换.
 * @author zhousd
 */
public class StringReplaceTest {

    public static void main(String[] args) {

        /**
         * 测试将美元符号换成空格.
         */
        String messageTitle = "测试测试测试$$测试测试测试";
        messageTitle = messageTitle.replaceAll("\\$\\$", " ");
        System.out.println(messageTitle);
    }
}
