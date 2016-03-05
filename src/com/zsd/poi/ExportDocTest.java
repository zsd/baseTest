package com.zsd.poi;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.*;

/**
 * 导出word文档测试.
 * @author zhousd
 */
public class ExportDocTest {

//    public static String readDoc(String doc) throws Exception {
//        // 创建输入流读取DOC文件
//        FileInputStream in = new FileInputStream(new File(doc));
//        WordExtractor extractor = null;
//        String text = null;
//        // 创建WordExtractor
//        extractor = new WordExtractor();
//        // 对DOC文件进行提取
//        text = extractor.extractText(in);
//        return text;
//    }

    public static boolean writeDoc(String path, String content) {
        boolean w = false;
        try {

            // byte b[] = content.getBytes("ISO-8859-1");
            byte b[] = content.getBytes();

            ByteArrayInputStream bais = new ByteArrayInputStream(b);

            POIFSFileSystem fs = new POIFSFileSystem();
            DirectoryEntry directory = fs.getRoot();

            DocumentEntry de = directory.createDocument("WordDocument", bais);

            FileOutputStream ostream = new FileOutputStream(path);

            fs.writeFilesystem(ostream);

            bais.close();
            ostream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return w;
    }

//    public static void main(String[] args) {
//        try{
//            String text = ExportDocTest.readDoc("c:/test.doc");
//            System.out.println(text);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws Exception{
        String wr = "test";
        boolean b = writeDoc("H:\\11.doc",wr);
    }

}
