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
public class Demo14 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/com/serene/iostream/test/f.txt");

        FileReader fRd = new FileReader(file);

        int b1 = fRd.read();
        System.out.println((char) b1);

        int b2 = fRd.read();
        System.out.println((char) b2);

        int b3 = fRd.read();
        System.out.println((char) b3);

        int b4 = fRd.read();
        System.out.println((char) b4);

        fRd.close();

    }

}
