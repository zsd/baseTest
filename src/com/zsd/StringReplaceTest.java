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

    /**
     * 地址加密.
     * 某某路6号楼1单元702加密成 **6号**1单**702
     */
    public void replaceAddress() {
        String address = "某某路6号楼1单元702";
        char[] tempArr = address.toCharArray();
        String result = "";
        int preType = 0; // 上一个字符类型，默认中文 0 中文、1 数字、字符
        for (int i = 0; i < tempArr.length; i++) {
            int temp = (int) tempArr[i];
            if (temp >= 19968 && temp <= 171941) { // 汉字
                if (preType == 1) {
                    result = result + tempArr[i];
                }
                preType = 0;
            } else {
                if (preType == 0) {
                    result = result + "**" + tempArr[i];
                } else if (preType == 1) {
                    result = result + tempArr[i];
                }
                preType = 1;
            }
        }
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
        st.replaceAddress();
    }
}
