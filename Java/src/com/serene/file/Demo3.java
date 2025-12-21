package com.serene.file;

import java.io.IOException;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
        File的常见成员方法（创建、删除）

        方法名称                                    说明
        public boolean createNewFile()              创建一个新的空的文件
        public boolean mkdir()                      创建单级文件夹
        public boolean mkdirs()                     创建多级文件夹
        public boolean delete()                     删除文件、空文件夹
         */

        // 1.createNewFile 创建一个新的空的文件
        // 细节1:如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        // 如果当前路径表示的文件是存在的，则创建失败，方法返回false
        // 细节2:如果父级路径是不存在的，那么方法会有异常IOException
        // 细节3:createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        /*File f1 = new File("./src/com/serene/file/test");
        boolean b = f1.createNewFile();
        System.out.println(b);*/


        // 2.mkdir make Directory 文件夹（目录）
        // 细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
        // 细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        /*File f2 = new File("./src/com/serene/file/test");
        boolean b =f2.mkdir();
        System.out.println(b);*/

        // 3.mkdirs 可创建n级文件夹（n >= 1 且n为正整数）
        /*File f2 = new File("./src/com/serene/file/test/test/test");
        boolean b =f2.mkdirs();
        System.out.println(b);*/

        // 4.delete
        // 细节：
        // 如果删除的是文件，则直接删除，不走回收站。
        // 如果删除的是空文件夹，则直接删除，不走回收站
        // 如果删除的是有内容的文件夹，则删除失败

    }

}
