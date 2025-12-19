package com.serene.filepractice;

//import java.io.File;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice4 {
    public static void main(String[] args) {
        /*
        需求:
        删除一个多级文件夹
         */

        // 先删除文件夹下所有内容
        // 再删除自己
        /*File file = new File("Z:/aaa/bbb/ccc/ddd");
        del(file);*/
    }

    /*public static void del(File file) {
        File[] files = file.listFiles();
        for (File fl : files) {
            if (fl.isFile()) {
                fl.delete();
            } else {
                del(fl);
            }
        }

        file.delete();

    }*/

}
