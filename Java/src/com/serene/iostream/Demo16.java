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
public class Demo16 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/com/serene/iostream/test/g.txt");
        FileWriter fWrt = new FileWriter(file);

        fWrt.write(96);
        fWrt.write(97);
        fWrt.write(98);
        fWrt.write(99);
        fWrt.write(100);

        fWrt.close();
    }

}
