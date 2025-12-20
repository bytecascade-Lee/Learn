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
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        换行
            Windows：\r\n
            Linux：\n
            MacOS：\r
            细节：
                在windows操作系统当中，java对回车换行进行了优化。
                虽然完整的是\r\n，但是我们写其中一个\r或者\n，
                java也可以实现换行，因为java在底层会补全。
            建议：
            不要省略，还是写全了。
        续写：
            如果想要续写，打开续写开关即可
            开关位置：
                创建对象的第二个参数
            默认false：
                表示关闭续写，此时创建对象会清空文件
            手动传递true：
                表示打开续写，此时创建对象不会清空文件
         */
        File file1 = new File("./src/com/serene/iostream/test/e.txt");
        File file2 = new File("./src/com/serene/iostream/test/a.txt");
        FileOutputStream fOut = new FileOutputStream(file1);

        // 写入换行符
        // Windows系统
        fOut.write("What's your name?".getBytes());
        fOut.write("\r\n".getBytes());
        fOut.write("My name is Serene Lee.".getBytes());
        fOut.write("\n".getBytes());
        fOut.close();

        // Linux系统
        /*fOut.write("What's your name?".getBytes());
        fOut.write("\n".getBytes());
        fOut.write("My name is Serene Lee.".getBytes());
        fOut.write("\n".getBytes());*/

        // MacOS系统
        /*fOut.write("What's your name?".getBytes());
        fOut.write("\r".getBytes());
        fOut.write("My name is Serene Lee.".getBytes());
        fOut.write("\r".getBytes());
         */


        // 续写内容
        fOut = new FileOutputStream(file2, true);
        fOut.write("\r\nThis sentence is from Demo3.java".getBytes());
        fOut.close();
    }

}
