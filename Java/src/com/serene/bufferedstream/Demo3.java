package com.serene.bufferedstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bRd = new BufferedReader(
                new FileReader("./src/com/serene/bufferedstream/test/a.txt"));

        BufferedWriter bWrt = new BufferedWriter(
                new FileWriter("./src/com/serene/bufferedstream/test/acopy3.txt"));

        char[] chars = new char[1 << 10];
        int len;
        while ((len = bRd.read(chars)) != -1) {
            bWrt.write(chars, 0, len);
        }

        bWrt.close();
        bRd.close();

    }

}
