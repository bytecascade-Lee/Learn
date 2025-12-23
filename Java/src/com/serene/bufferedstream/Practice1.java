package com.serene.bufferedstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Practice1 {
    public static void main(String[] args) throws IOException {
        /*
        拷贝文件
        四种方式拷贝文件，并统计各自用时
        字节流的基本流：一次读写一个字节            --> 15ms
        字节流的基本流：一次读写一个字节数组        --> 0ms
        字节缓冲流：一次读写一个字节                --> 1ms
        字节缓冲流：一次读写一个字节数组            --> 1ms
     */

        File src = new File("./src/com/serene/bufferedstream/test/src.txt");
        File des1 = new File("./src/com/serene/bufferedstream/test/des1.txt");
        File des2 = new File("./src/com/serene/bufferedstream/test/des2.txt");
        File des3 = new File("./src/com/serene/bufferedstream/test/des3.txt");
        File des4 = new File("./src/com/serene/bufferedstream/test/des4.txt");

        // 方法一
        long start1 = System.currentTimeMillis();
        FileInputStream fIn1 = new FileInputStream(src);
        FileOutputStream fOut1 = new FileOutputStream(des1);

        int b1;
        while ((b1 = fIn1.read()) != -1) {
            fOut1.write(b1);
        }

        fOut1.close();
        fIn1.close();
        long end1 = System.currentTimeMillis();


        // 方法二
        long start2 = System.currentTimeMillis();
        FileInputStream fIn2 = new FileInputStream(src);
        FileOutputStream fOut2 = new FileOutputStream(des2);

        byte[] bytes1 = new byte[1 << 10];
        int len1;
        while ((len1 = fIn2.read(bytes1)) != -1) {
            fOut2.write(bytes1, 0, len1);
        }

        fOut2.close();
        fIn2.close();
        long end2 = System.currentTimeMillis();


        // 方法三
        long start3 = System.currentTimeMillis();
        BufferedInputStream bIn1 = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bOut1 = new BufferedOutputStream(new FileOutputStream(des3));

        int b2;
        while ((b2 = bIn1.read()) != -1) {
            bOut1.write(b2);
        }

        bOut1.close();
        bIn1.close();
        long end3 = System.currentTimeMillis();


        // 方法四
        long start4 = System.currentTimeMillis();
        BufferedInputStream bIn2 = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bOut2 = new BufferedOutputStream(new FileOutputStream(des4));

        byte[] bytes2 = new byte[1 << 10];
        int len2;
        while ((len2 = bIn2.read(bytes2)) != -1) {
            bOut2.write(bytes2, 0, len2);
        }

        bOut2.close();
        bIn2.close();
        long end4 = System.currentTimeMillis();


        // 输出结果
        System.out.println("1 --> " + (end1 - start1));
        System.out.println("2 --> " + (end2 - start2));
        System.out.println("3 --> " + (end3 - start3));
        System.out.println("4 --> " + (end4 - start4));
    }


}
