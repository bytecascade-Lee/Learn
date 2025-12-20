package com.serene.iostreampractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/20
 */
public class Practice2 {
    public static void main(String[] args) throws IOException {
        /*
        文件加密
        为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
        加密原理：
        对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
        解密原理:
        读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
         */

        // 利用异或运算加密和解密

        // 加密
        /*FileInputStream fIn = new FileInputStream("src\\com\\serene\\iostreampractice\\img.jpg");
        FileOutputStream fOut = new FileOutputStream("src\\com\\serene\\iostreampractice\\ency.jpg");

        int len;
        while ((len = fIn.read()) != -1) {
            fOut.write(len ^ 2);
        }

        fOut.close();
        fIn.close();*/

        // 解密
        FileInputStream fIn = new FileInputStream("src\\com\\serene\\iostreampractice\\ency.jpg");
        FileOutputStream fOut = new FileOutputStream("src\\com\\serene\\iostreampractice\\redu.jpg");

        int len;
        while ((len = fIn.read()) != -1) {
            fOut.write(len ^ 2);
        }

        fOut.close();
        fIn.close();

    }

}
