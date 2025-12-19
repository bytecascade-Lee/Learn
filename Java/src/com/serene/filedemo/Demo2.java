package com.serene.filedemo;

import java.io.File;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        方法名称                                    说明
        public boolean isDirectory()                判断此路径名表示的File是否为文件夹
        public boolean isFile()                     判断此路径名表示的File是否为文件
        public boolean exists()                     判断此路径名表示的File是否存在
        public long length()                        返回文件的大小（字节数量）
        public File getAbsolutePath()               返回文件的绝对路径
        public File getCanonicalFile()              返回规范后的绝对路径，需要处理错误
        public String getPath()                     返回定义文件时使用的路径
        public String getName()                     返回文件的名称，带后缀
        public long lastModified()                  返回文件的最后修改时间（时间毫秒值）
         */

        File fileText = new File("./src/com/serene/file/test.txt");
        File fileDir = new File("./src/com/serene/file/test");

        // 1. isDirectory / isFile / exists
        System.out.println("----------isDirectory / isFile / exists----------\n\n");
        System.out.println(fileText.exists());
        System.out.println(fileText.isDirectory());
        System.out.println(fileText.isFile());

        System.out.println(fileDir.exists());
        System.out.println(fileDir.isDirectory());
        System.out.println(fileDir.isFile());


        // 2. length
        System.out.println("----------length----------\n\n");
        System.out.println(fileText.length());
        // 目录对应的长度为0，如需计算，需要递归目录下文件逐一进行计算
        System.out.println(fileDir.length());


        // 3. getAbsolutePath / getCanonicalFile
        System.out.println("----------getAbsolutePath / getCanonicalFile----------\n\n");
        System.out.println(fileText.getAbsoluteFile());
        System.out.println(fileText.getCanonicalFile());
        System.out.println(fileDir.getAbsoluteFile());
        System.out.println(fileDir.getCanonicalFile());


        // 4. getPath / getName
        System.out.println("----------getPath / getName----------\n\n");
        System.out.println(fileText.getPath());
        System.out.println(fileText.getName());
        System.out.println(fileDir.getPath());
        System.out.println(fileDir.getName());


        // 5. lastModified
        System.out.println("----------lastModified----------\n\n");
        System.out.println(fileText.lastModified());
        System.out.println(fileDir.lastModified());

    }

}
