package com.zsd;

/**
 * 字符串测试类.
 * @author zhousd
 */
public class StringTest {

    /**
     * contains方法比较.
     * @return 是否相等
     */
    public boolean containsTest() {
        String s1 = ".svnasdfs";
        String s2 = ".svn";
        boolean flag = s1.contains(s2);
        System.out.println("flag = " + flag);
        return flag;
    }

    /**
     * endWith方法比较.
     * @return 是否相等
     */
    public boolean endWithTest() {
        String s1 = "Tt.java";
        String s2 = ".java";
        boolean flag = s1.endsWith(s2);
        System.out.println("flag = " + flag);
        return flag;
    }

    /**
     * lastIndexOf方法测试使用.
     */
    public void lastIndexofTest() {
        String fullFileName = "abc.jpg";
        int index = fullFileName.lastIndexOf(".");
        System.out.println("before the dot：" + fullFileName.substring(0, index));
        System.out.println("after the dot：" + fullFileName.substring(index + 1, fullFileName.length()));
    }

    /**
     * 字符串转换成大写测试.
     */
    public void toUpperCaseTest() {
        String stringWithLowChar = "2222222x";
        String result = stringWithLowChar.toUpperCase();
        System.out.println("origin string is : " + stringWithLowChar);
        System.out.println("after upperCase is : " + result);
    }

    public static void main(String args[]) {
        StringTest st = new StringTest();
        st.containsTest();
        st.endWithTest();
        st.lastIndexofTest();
        st.toUpperCaseTest();
    }
}
