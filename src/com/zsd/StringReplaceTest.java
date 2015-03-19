package com.zsd;

/**
 * 字符串替换.
 * @author zhousd
 */
public class StringReplaceTest {

    /**
     * 手机号加密.
     * 135-1234-1234加密成 ***1234
     */
    public void subPhone() {
        String phone = "13512341234";
        String result = "***" + phone.substring(phone.length() - 4);
        System.out.println("加密数据：" + result);
    }

    public static void main(String[] args) {

        /**
         * 测试将美元符号换成空格.
         */
        String messageTitle = "测试测试测试$$测试测试测试";
        messageTitle = messageTitle.replaceAll("\\$\\$", " ");
        System.out.println(messageTitle);

        StringReplaceTest st = new StringReplaceTest();
        st.subPhone();
    }
}
