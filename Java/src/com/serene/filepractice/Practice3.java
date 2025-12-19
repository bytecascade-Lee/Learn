package com.serene.filepractice;

//import java.io.File;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice3 {
    public static void main(String[] args) {
        /*
        需求:
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        需要考虑子文件夹.
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

        for (File fl : files) {
            if (fl.isFile() && fl.getName().toLowerCase().endsWith(".avi")) {
                return true;

            }
        }

        for (File fl : files) {
            if (fl.isDirectory()) {
                File[] temp = fl.listFiles();
                for (File i : temp) {
                    if (i.isFile() && i.getName().toLowerCase().endsWith(".avi")) {
                        return true;
                    }
                }
            }
        }

        return false;
    }*/

}
