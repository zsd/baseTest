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

    public static void main(String args[]) {
        StringTest st = new StringTest();
        st.containsTest();
        st.endWithTest();
    }
}
