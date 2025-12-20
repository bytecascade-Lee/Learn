package com.serene.iostreamdemo;

import java.io.UnsupportedEncodingException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Demo11 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        Java中编码的方法
            public byte[] getBytes()                    使用默认方式进行编码
            public byte[] getBytes(String charsetName)  使用指定方式进行编码
        Java中解码的方法
            String(byte[] bytes)                        使用默认方式进行解码
            String(byte[] bytes,String charsetName)     使用指定方式进行解码
         */

        String s1 = "衰兰送客咸阳道，天若有情天亦老。";
        String s2 = "I'm from 中国.";

        // 编码
        byte[] s1BytesDefault = s1.getBytes();
        byte[] s1BytesGBK = s1.getBytes("GBK");
        byte[] s2BytesDefault = s2.getBytes();
        byte[] s2BytesGBK = s2.getBytes("GBK");

        // 解码+输出
        System.out.println("s1BytesDefault = " + new String(s1BytesDefault));
        System.out.println("s1BytesGBK = " + new String(s1BytesGBK));
        System.out.println("s2BytesDefault = " + new String(s2BytesDefault));
        System.out.println("s2BytesGBK = " + new String(s2BytesGBK));

    }

}
