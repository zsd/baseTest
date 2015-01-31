package com.zsd;

/**
 * 字符串匹配测试类.
 * @author zhousd
 */
public class StringMatchTest {

    /**
     * 根据ip匹配规则匹配ip.
     * @param ip 输入ip
     * @return 匹配规则
     */
    public void matchIp(String ip) {
        String ipConf = "\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b";
        boolean flag = ip.matches(ipConf);
        System.out.println(ip + "检查判断：" + flag);
    }

    public static void main(String[] args) {
        StringMatchTest stringMatchTest = new StringMatchTest();
        stringMatchTest.matchIp("1.1.1.1");
        stringMatchTest.matchIp("10.202.63.132");
        stringMatchTest.matchIp("7351231-0-3-4-14");
    }

}
