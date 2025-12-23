package com.serene.bufferedstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bIn = new BufferedInputStream(new FileInputStream("./src/com/serene/bufferedstream/test/a.txt"));
        BufferedOutputStream bOut = new BufferedOutputStream(new FileOutputStream("src/com/serene/bufferedstream/test/acopy.txt"));
        
        int b;
        while ((b = bIn.read()) != -1) {
            bOut.write(b);
        }

        bOut.close();
        bIn.close();
    }

}
