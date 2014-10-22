package com.zsd;

import java.util.ArrayList;
import java.util.List;

/**
 * 列表测试.
 */
public class ListTest {

    /**
     * 测试列表添加空元素时，size的变化.
     */
	public void add() {
		List<String> l = new ArrayList<String>();
        String a = "abc";
        String b = null;
		l.add(a);
		l.add(b);
		System.out.println("l.size = " + l.size());
	}
	
	public static void main(String args[]) {
		ListTest lt = new ListTest();
		lt.add();
	}

}
