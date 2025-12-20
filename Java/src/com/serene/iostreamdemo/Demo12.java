package com.serene.iostreamdemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo12 {
    public static void main(String[] args) throws IOException {
        /*
        FileReader

        ①创建字符输入流对象
        构造方法                                说明
        public FileReader(File file)            创建字符输入流关联本地文件
        public FileReader(String pathname)      创建字符输入流关联本地文件

        ②读取数据
        成员方法                                说明
        public int read()                       读取数据，读到末尾返回-1
        public int read(char[] buffer)          读取多个数据，读到末尾返回-1
        细节1:按字节进行读取遇到中文，一次读多个字节，读取后解码，返回一个整数
        细节2:读到文件末尾了，read方法返回-1。

        ③释放资源
        成员方法                                说明
        public int close()                      释放资源/关流
         */

        // 使用FileReader对象读取《滕王阁序》然后输出

        File file = new File("./src/com/serene/iostream/test/3.txt");
        FileReader fRd = new FileReader(file);

        char[] chars = new char[1024];
        int len;
        while ((len = fRd.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }

        System.out.println();
        fRd.close();

    }

}
