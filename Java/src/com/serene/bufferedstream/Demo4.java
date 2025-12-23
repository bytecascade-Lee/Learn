package com.serene.bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bRd = new BufferedReader(
                new FileReader("./src/com/serene/bufferedstream/test/a.txt"));

        String s;
        while ((s = bRd.readLine()) != null) {
            if (s.contains("相")) {
                System.out.println(s);
            }
        }

        bRd.close();
    }

}
