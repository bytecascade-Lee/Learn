package com.serene.iostream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/20
 */
public class Demo15 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/com/serene/iostream/test/f.txt");
        /*FileOutputStream fOut = new FileOutputStream(file);
        byte[] bytes = new byte[1024];
        for (int i = 0; i < 1024; i++) {
            bytes[i] = 97;
        }
        for (int i = 0; i < 8; i++) {
            fOut.write(bytes);
        }

        fOut.close();*/

        FileReader fRd = new FileReader(file);

        for (int i = 0; i < 8191; i++) {
            fRd.read();

        }

        // 8192
        int b1 = fRd.read();
        System.out.println((char) b1);

        // 8193
        int b2 = fRd.read();
        System.out.println((char) b2);

        // 8194
        int b3 = fRd.read();
        System.out.println((char) b3);

        // 8195
        int b4 = fRd.read();
        System.out.println((char) b4);

        // 8196
        int b5 = fRd.read();
        System.out.println((char) b5);

        // 8197
        int b6 = fRd.read();
        System.out.println((char) b6);

        // 8198
        int b7 = fRd.read();
        System.out.println((char) b7);

        // 8199
        int b8 = fRd.read();
        System.out.println((char) b8);

        fRd.close();
    }

}
