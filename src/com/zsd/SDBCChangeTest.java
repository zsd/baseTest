package com.zsd;

/**
 * 全角半角转换.
 * @author zhousd
 */
public class SDBCChangeTest {

    public static void main(String[] args) {
        String str="全角转半角ＤＡＯ";
        String result=change(str);
        System.out.println(str+"\n"+result);
    }

    /**
     * 将全角字符串转换成半角字符串.
     * @param str 转换字符串
     * @return 转换后的字符串
     */
    public static final String change(String str) {
        String outStr = "";
        String tempStr = "";
        byte[] b = null;
        for(int i=0; i < str.length(); i++) {
            try {
                tempStr = str.substring(i, i + 1);
                b = tempStr.getBytes("unicode");
            } catch(java.io.UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if (b[3] == -1) {
                b[2] = (byte) (b[2] + 32);
                b[3] = 0;
                try {
                    outStr = outStr + new String(b, "unicode");
                } catch(java.io.UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            } else {
                outStr = outStr + tempStr;
            }
        }
        return outStr;
    }
}
