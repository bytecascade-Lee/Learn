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
public class Demo8 {
    public static void main(String[] args) {

        FileInputStream fIn = null;
        FileOutputStream fOut = null;
        File fileSrc;
        File fileDes;
        byte[] bytes = new byte[1024];

        try {
            fileSrc = new File("./src/com/serene/iostream/test/0.txt");
            fileDes = new File("./src/com/serene/iostream/test/2.txt");
            fIn = new FileInputStream(fileSrc);
            fOut = new FileOutputStream(fileDes);

            int len;
            long start = System.currentTimeMillis();
            while ((len = fIn.read(bytes)) != -1) {
                // 此处len是读到的字符的长度
                fOut.write(bytes, 0, len);
            }
            long end = System.currentTimeMillis();

            System.out.println("用时：" + (end - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fOut != null) {
                try {
                    fOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fIn != null) {
                try {
                    fIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
