package com.zsd;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 字符串截取替换.
     */
    public void splitTest() {
        String s = "1234567890";
        if (s.length() > 5) {
            s = s.substring(0, 5) + "...";
        }
        System.out.println("s = " + s);
    }

    public List<String> parseTest(String test) {
        List<String> stringList = new ArrayList<String>();
        String[] temp = test.split(",");
        for (String str : temp) {
            if (str.contains("~")) {
                String[] tempRoomNumberStr = str.split("~");
                int minFloorNumber = Integer.parseInt((tempRoomNumberStr[0].split("0"))[0]);
                int maxFloorNumber = Integer.parseInt((tempRoomNumberStr[1].split("0"))[0]);
                for (int i = minFloorNumber; i <= maxFloorNumber; i++) {
                    stringList.add(i + "0" + (tempRoomNumberStr[0].split("0"))[1]);
                }
            } else {
                stringList.add(str);
            }
        }
        return stringList;
    }

    public static void main(String args[]) {
        StringTest st = new StringTest();
        st.containsTest();
        st.endWithTest();
        st.lastIndexofTest();
        st.toUpperCaseTest();
        st.splitTest();

        String test = "101~1501,102~1502";
        List<String> stringList = st.parseTest(test);
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        String test1 = "101";
        List<String> stringList1 = st.parseTest(test1);
        for (int i = 0; i < stringList1.size(); i++) {
            System.out.println(stringList1.get(i));
        }

        String test2 = "172884_1601041553220.jpg|172884_1601041553231.jpg|172884_1601041553232.jpg|";
        String[] stringArray = test2.split("\\|");
        System.out.println("数组长度：" + stringArray.length);
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray["+ i + "]=" + stringArray[i]);
        }
    }
}
