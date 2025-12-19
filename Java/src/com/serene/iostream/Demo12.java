package com.serene.iostream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo12 {
    public static void main(String[] args) {
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
    }

}
