package com.serene.bufferedstream;

import java.io.*;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/23
 */
public class Practice3 {
    public static void main(String[] args) throws IOException {
        /*
        软件运行次数
        实现一个验证程序运行次数的小程序，要求如下：
        1.当程序运行超过3次时给出提示：本软件只能免费使用3次，欢迎您注册会员后继续使用~
        2.程序运行演示如下：
        第一次运行控制台输出：欢迎使用本软件，第1次使用免费~
        第二次运行控制台输出：欢迎使用本软件，第2次使用免费~
        第三次运行控制台输出：欢迎使用本软件，第3次使用免费~
        第四次及之后运行控制台输出：本软件只能免费使用3次，欢迎您注册会员后继续使用~
         */

        File file = new File("./src/com/serene/bufferedstream/test/times.txt");
        BufferedReader bRd = new BufferedReader(new FileReader(file));

        String s = bRd.readLine().strip();
        bRd.close();

        int times = Integer.parseInt(s) + 1;

        if (times <= 3) {
            System.out.println("欢迎使用本软件，第" + times + "次使用免费~");
        } else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
        }

        BufferedWriter bWrt = new BufferedWriter(new FileWriter(file));
        bWrt.write("" + (times));
        bWrt.newLine();
        bWrt.close();


    }

}
