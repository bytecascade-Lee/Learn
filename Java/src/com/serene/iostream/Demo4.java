package com.serene.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        /*
        FileInputStream书写细节
        ①创建字节输入流对象
            细节1：如果文件不存在，就直接报错。
        ②读取数据
            细节1：一次读一个字节，读出来的是数据在ASCII上对应的数字
            细节2：读到文件末尾了，read方法返回-1。
        ③释放资源
            细节1：每次使用完流必须要释放资源。
         */

        File file = new File("./src/com/serene/iostream/test/a.txt");
        FileInputStream fIn = new FileInputStream(file);

        int read = fIn.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fIn.read();
        }

        fIn.close();

    }

}
