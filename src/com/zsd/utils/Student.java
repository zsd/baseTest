package com.zsd.utils;

/**
 * 测试通用类--学生类.
 * @author zhousd
 */
public class Student extends Person {

    private String id = "";
    private String name = "";

    public Student() {
        super();
    }

    public Student(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public void doSomething(String str) {
        System.out.println("student");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
