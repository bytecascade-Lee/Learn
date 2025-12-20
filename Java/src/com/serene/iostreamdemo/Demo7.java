package com.serene.iostreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo7 {
    public static void main(String[] args) throws IOException {
        /*
        分块读取《滕王阁序》并写入到2.txt以减少IO次数，加快速度
        仍需要统计时间
         */

        File fileSrc = new File("./src/com/serene/iostream/test/0.txt");
        File fileDes = new File("./src/com/serene/iostream/test/2.txt");
        FileInputStream fIn = new FileInputStream(fileSrc);
        FileOutputStream fOut = new FileOutputStream(fileDes);

        byte[] bytes = new byte[1024];
        int len;
        Date start = new Date();
        while ((len = fIn.read(bytes)) != -1) {
            // 此处len是读到的字符的长度
            fOut.write(bytes, 0, len);
        }
        Date end = new Date();

        System.out.println("用时：" + (end.getTime() - start.getTime()) + "ms");

        fOut.close();
        fIn.close();
    }

}
