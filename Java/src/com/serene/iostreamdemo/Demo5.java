package com.serene.iostreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        // 读取《滕王阁序》内容并打印出来

        File file = new File("./src/com/serene/iostream/test/0.txt");
        FileInputStream fIn = new FileInputStream(file);


        byte[] bytes = new byte[1024 * 2];

        int bytesRead = fIn.read(bytes);

        String content = new String(bytes, 0, bytesRead, "GBK");
        System.out.println(content);

        fIn.close();
    }

}
