package com.serene.iostreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo9 {
    public static void main(String[] args) {
        /*
        JDK7方案

        try（创建流对象1；创建流对象2）{
                可能出现异常的代码；
        } catch(异常类名变量名）{
                处理异常的代码；
        }

        资源用完最终自动释放
         */

        File fileSrc = new File("./src/com/serene/iostream/test/0.txt");
        File fileDes = new File("./src/com/serene/iostream/test/2.txt");

        try (FileInputStream fIn = new FileInputStream(fileSrc);
             FileOutputStream fOut = new FileOutputStream(fileDes)) {
            int len;
            long start = System.currentTimeMillis();
            byte[] bytes = new byte[1024];
            while ((len = fIn.read(bytes)) != -1) {
                // 此处len是读到的字符的长度
                fOut.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();

            System.out.println("用时：" + (end - start) + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
