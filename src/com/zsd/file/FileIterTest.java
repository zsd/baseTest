package com.zsd.file;

import java.io.File;

/**
 * 某一个文件夹下的文件遍历.
 * @author zhousd
 */
public class FileIterTest {

    public static void main(String[] args) throws Exception {
        //递归显示C盘下所有文件夹及其中文件
        File root = new File("g:/githubWorkSpace/baseTest");
        showAllFiles(root);
    }

    final static void showAllFiles(File dir) throws Exception{
        File[] fs = dir.listFiles();
        for(int i=0; i<fs.length; i++){
            System.out.println(fs[i].getAbsolutePath());
            if(fs[i].isDirectory()){
                try{
                    showAllFiles(fs[i]);
                }catch(Exception e){}
            }
        }
    }
}
