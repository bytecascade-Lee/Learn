package com.serene.convertstream;

//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        String s1 = "这江山我起笔民族血脉又几万里\n";
        String s2 = "几世纪六百年里\n";
        String s3 = "龙的传人历经风雨\n";

        // 此方式在JDK11之后就被淘汰了，了解即可
        /*OutputStreamWriter cOutWrt = new OutputStreamWriter(new FileOutputStream(
                "./src/com/serene/convertstream/test/out.txt"), "GBK");

        cOutWrt.write(s1);
        cOutWrt.write(s2);
        cOutWrt.write(s3);

        cOutWrt.close();*/

        FileWriter fWrt = new FileWriter("./src/com/serene/convertstream/test/out.txt", Charset.forName("GBK"));

        fWrt.write(s1);
        fWrt.write(s2);
        fWrt.write(s3);

        fWrt.close();

    }

}
