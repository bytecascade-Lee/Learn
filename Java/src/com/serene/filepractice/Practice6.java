package com.serene.filepractice;

//import java.io.File;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice6 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        需要考虑所有子文件夹.
        D:\\
        D:\\aaa
        D:\\bbb
        D:\\bbb\\ccc
         */
        /*File file = new File("D:/aaa");
        System.out.println(hasAvi(file));*/
    }

    /*public static boolean hasAvi(File file) {
        File[] files = file.listFiles();

        // 先检查同级文件，如果没有，再检查目录。
        for (File fl : files) {
            if (fl.isFile() && fl.getName().toLowerCase().endsWith(".avi")) {
                return true;
            }
        }

        // 利用递归检查所有子目录
        // 即把子目录当做file传递到hasAvi方法里面
        for (File fl : files) {
            if (fl.isDirectory()) {
                return hasAvi(fl);
            }
        }

        return false;
    }*/
}
