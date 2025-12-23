package com.serene.bufferedstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bIn = new BufferedInputStream(
                new FileInputStream("./src/com/serene/bufferedstream/test/a.txt"));
        BufferedOutputStream bOut = new BufferedOutputStream(
                new FileOutputStream("./src/com/serene/bufferedstream/test/acopy2.txt"));

        byte[] bytes = new byte[1 << 10];
        int len;
        while ((len = bIn.read(bytes)) != -1) {
            bOut.write(bytes, 0, len);
        }

        bOut.close();
        bIn.close();

    }

}
