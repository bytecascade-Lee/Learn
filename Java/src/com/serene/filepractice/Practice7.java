package com.serene.filepractice;

//import java.io.File;
//import java.util.Map;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/19
 */
public class Practice7 {
    public static void main(String[] args) {
        /*
        需求；
        统计一个文件夹的大小
         */

        /*File file = new File("src\\com\\serene\\map");
        System.out.println(getSize(file) / 1024);*/

    }

    /*public static long getSize(File file) {
        if (file.isFile()) {
            throw new RuntimeException("必须是文件夹");
        }

        long ans = 0;

        File[] files = file.listFiles();
        for (File fl : files) {
            if (fl.isFile()) {
                ans += fl.length();
            } else {
                long temp = getSize(fl);
                ans += temp;
            }
        }

        return ans;
    }*/

}
