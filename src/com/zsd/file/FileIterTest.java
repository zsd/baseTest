package com.zsd.file;

import java.io.File;

/**
 * ĳһ���ļ����µ��ļ�����.
 * @author zhousd
 */
public class FileIterTest {

    public static void main(String[] args) throws Exception {
        //�ݹ���ʾC���������ļ��м������ļ�
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
