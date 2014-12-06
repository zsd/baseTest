package com.zsd;

import com.zsd.utils.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * 列表测试.
 * @author zhousd
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

    /**
     * 测试forEach循环后，添加元素后的效果.
     */
    public void modifyElementProperty() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("1", "张三"));
        students.add(new Student("2", "李四"));
        for (Student student : students) {
            System.out.println("Id = " + student.getId() + " --- Name = " + student.getName());
            student.setName("王五");
        }
        for (Student student : students) {
            System.out.println("Id = " + student.getId() + " --- Name = " + student.getName());
        }
    }
	
	public static void main(String args[]) {
		ListTest lt = new ListTest();
		lt.add();
        lt.modifyElementProperty();
	}

}
