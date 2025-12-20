package com.serene.iostream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/20
 */
public class Demo17 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/com/serene/iostream/test/g.txt");
        FileWriter fWrt = new FileWriter(file);

        for (int i = 0; i < 8192; i++) {
            fWrt.write(97);
        }

        System.out.println("-------------");

        fWrt.write(98);
        fWrt.write(99);
        fWrt.write(100);
        fWrt.write(101);
        fWrt.write(102);
        fWrt.write(25105);

        fWrt.close();
    }

}
