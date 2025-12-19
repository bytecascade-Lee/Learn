package com.serene.filepractice;

import java.io.File;
import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice1 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
        在当前模块下的aaa文件夹中创建一个a.txt文件
         */

        File dir = new File("./aaa");
        dir.mkdir();
        String name = "a.txt";
        File file = new File(dir, name);
        String res = file.createNewFile() ? "成功创建文件" : "创建文件失败";
        System.out.println(res);
    }

}
