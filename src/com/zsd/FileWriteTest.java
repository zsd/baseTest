package com.zsd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * 简单文件写入测试.
 * @author zhousd
 */
public class FileWriteTest {

    /**
     * 创建G盘的Result.txt文件，并写入内容test.
     */
    public void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("G:\\Result.txt")));
            writer.write("test");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        FileWriteTest fileWriteTest = new FileWriteTest();
        fileWriteTest.write();
    }
}
