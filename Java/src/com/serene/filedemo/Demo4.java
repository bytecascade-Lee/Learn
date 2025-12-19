package com.serene.filedemo;

import java.io.File;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Demo4 {
    public static void main(String[] args) {
        /*
        File的常见成员方法(获取并遍历)
        方法名称                               说明
        public File[] listFiles()              获取当前该路径下所有内容
         */

        File file = new File("./src/com/serene/string");
        File[] files = file.listFiles();
        if (files != null) {
            Stream.of(files)
                    .forEach(System.out::println);
        }

        /*
        当调用者File表示的路径不存在时，返回null
        当调用者File表示的路径是文件时，返回null
        当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
        当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
        当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
        当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
         */
    }

}
