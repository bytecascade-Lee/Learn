package com.serene.iostreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        /*
        FileOutputStream写数据的3种方式
        方法名称                                说明
        void write(int b)                       一次写一个字节数据
        void write(byte[] b)                    一次写一个字节数组数据
        void write(byte[] b, int off,int len)   一次写一个字节数组的部分数据
         */

        File file1 = new File("./src/com/serene/iostream/test/b.txt");
        File file2 = new File("./src/com/serene/iostream/test/c.txt");
        File file3 = new File("./src/com/serene/iostream/test/d.txt");
        byte[] bytes = {97, 98, 99, 100, 101};

        // 1. write(int b)
        FileOutputStream fOut = new FileOutputStream(file1);
        fOut.write(97);
        fOut.write(98);
        fOut.write(99);
        fOut.close();

        // 2. write(byte[] b)
        fOut = new FileOutputStream(file2);
        fOut.write(bytes);
        fOut.close();

        // 3. write(byte[] b, int off, int len)
        fOut = new FileOutputStream(file3);
        fOut.write(bytes, 1, 3);
        fOut.close();

//        fOut.close();

    }

}
