package com.zsd;

/**
 * 枚举类测试.
 * @author zhousd
 */
public class EnumTest {

    /**
     * 枚举遍历测试.
     */
    public void loopTest() {
        for (FruitEnum fruitEnum : FruitEnum.values()) {
            System.out.println("The fruitEnum id is:" + fruitEnum.getId() + " and name is:" + fruitEnum.getName());
        }
    }

    public static void main(String args[]) {
        EnumTest enumTest = new EnumTest();
        enumTest.loopTest();
    }
}

/**
 * 水果枚举类.
 */
enum FruitEnum {

    APPLE (1, "苹果"),
    ORANGE (2, "桔子"),
    BANANA (2, "香蕉");

    private int id; // 枚举ID

    private String name; // 枚举名称

    FruitEnum() {
    }

    FruitEnum(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
