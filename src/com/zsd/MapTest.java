package com.zsd;

import java.util.HashMap;
import java.util.Map;

/**
 * map测试用例.
 * @author zsd
 */
public class MapTest {

    /**
     * 获取map内不存在的值测试.
     * @param map map
     */
    public void getNullKey(Map<String, Object> map) {
        System.out.println("打印空值测试:" + map.get("abc"));
    }

    public static void main(String args[]) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("test", "test");
        MapTest mapTest = new MapTest();
        mapTest.getNullKey(map);
    }
}
