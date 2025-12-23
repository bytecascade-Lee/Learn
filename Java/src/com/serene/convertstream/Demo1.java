package com.serene.convertstream;

//import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        // 此方式在JDK11之后就被淘汰了，了解即可
        /*InputStreamReader cInRd = new InputStreamReader(new FileInputStream(
                "./src/com/serene/convertstream/test/namelist.txt"), "GBK");

        int ch;
        while ((ch = cInRd.read()) != -1) {
            System.out.print((char) ch);
        }

        cInRd.close();*/

        FileReader fRD = new FileReader("./src/com/serene/convertstream/test/namelist.txt",
                Charset.forName("GBK"));
        int ch;
        while ((ch = fRD.read()) != -1) {
            System.out.print((char) ch);
        }

        fRD.close();
    }

}
