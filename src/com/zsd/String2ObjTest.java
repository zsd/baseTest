package com.zsd;

import com.zsd.utils.Person;
import com.zsd.utils.Student;

/**
 * ����String�����Ƿ�Obj����.
 * @author zsd
 */
public class String2ObjTest {

    public static void main(String[] args) {
        Person p = new Student();
        p.doSomething(new String()); //����ط�������ת����ɵ����෽�����ܵ��ã�֮ǰ��һ���������.
        p.doSomething("abc");

        Student s = new Student();
        s.doSomething(new String());
    }
}
