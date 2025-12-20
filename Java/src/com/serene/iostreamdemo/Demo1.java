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
public class Demo1 {
    public static void main(String[] args) throws IOException {
        /*
        演示：字节输出流FileOutputStream
        实现需求：写出一段文字到本地文件中。（暂时不写中文）
        实现步骤：
                  创建对象
                  写出数据
                  释放资源
         */

        File file = new File("./src/com/serene/iostream/test/a.txt");
        FileOutputStream fOut = new FileOutputStream(file);

        fOut.write(97);
        fOut.close();
    }

}
