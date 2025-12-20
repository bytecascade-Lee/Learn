package com.serene.iostream;

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
public class Demo6 {
    public static void main(String[] args) throws IOException {
        /*
        将《滕王阁序》拷贝一份到1.txt里面
        并计算所用时间
         */

        File fileSrc = new File("./src/com/serene/iostream/test/0.txt");
        File fileDes = new File("./src/com/serene/iostream/test/1.txt");
        FileInputStream fIn = new FileInputStream(fileSrc);
        FileOutputStream fOut = new FileOutputStream(fileDes);

        int b;
        Date start = new Date();
        while ((b = fIn.read()) != -1) {
            // 此处b是读到的字符的ASCII码
            fOut.write(b);
        }
        Date end = new Date();

        System.out.println("用时：" + (end.getTime() - start.getTime()) + "ms");

        fOut.close();
        fIn.close();

    }

}
