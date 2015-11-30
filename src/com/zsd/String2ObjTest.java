package com.zsd;

import com.zsd.utils.Person;
import com.zsd.utils.Student;

/**
 * 测试String类型是否Obj类型.
 * @author zsd
 */
public class String2ObjTest {

    public static void main(String[] args) {
        Person p = new Student();
        p.doSomething(new String()); //这个地方是向上转型造成的子类方法不能调用，之前的一个理解误区.
        p.doSomething("abc");

        Student s = new Student();
        s.doSomething(new String());
    }
}
