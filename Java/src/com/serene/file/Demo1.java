package com.serene.file;

import java.io.File;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Demo1 {
    public static void main(String[] args) {
        /*
        public File(String pathname)                根据文件路径创建文件对象
        public File(String parent, string child)    根据父路径名字符串和子路径名字符串创建文件对象
        public File(File parent, string child)      根据父路径对应文件对象和子路径名字符串创建文件对象

         */

        String path = "C:\\User\\Administrator\\Desktop\\hello_world.py";
        System.out.println("path = " + path);

        File file1 = new File(path);
        System.out.println("file1 = " + file1);

        String parent = "C:\\User\\Administrator\\Desktop";
        String child = "hello_world.py";
        File file2 = new File(parent, child);
        System.out.println("file2 = " + file2);

        File parentFile = new File(parent);
        File file3 = new File(parentFile, child);
        System.out.println("file3 = " + file3);

    }

}
