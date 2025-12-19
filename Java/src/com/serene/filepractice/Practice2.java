package com.serene.filepractice;

import java.io.File;
import java.io.IOException;
//import java.util.Objects;
//import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice2 {
    public static void main(String[] args) throws IOException {
        /*
        需求:
        定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        (暂时不需要考虑子文件夹)
        D:\\aaa
        D:\\aaa\\bbb
        D:\\aaa\\ccc
         */
        File[] files = {
                new File("D:/aaa"),
                new File("D:/aaa/bbb"),
                new File("D:/aaa/ccc"),
        };

        /*String res = Stream.of(files)
                .anyMatch(
                        file -> Stream.of(
                        Objects.requireNonNull(
                                file.listFiles(
                                        file1 -> file1.isFile() &&
                                                file1.getName().toLowerCase().endsWith(".avi")
                                )))
                                .findAny()
                                .isPresent())
                ? "yes" : "no";*/

        for (File file : files) {
            System.out.println(file.getCanonicalPath() + ":" + hasAvi(file));
        }

    }

    public static boolean hasAvi(File file) {
        if (!file.exists() || !file.isDirectory()) {
            throw new RuntimeException();
        }

        File[] files = file.listFiles(f -> f.isFile() &&
                f.getName().toLowerCase().endsWith(".avi"));

        if (files != null) {
            return files.length != 0;
        }
        return false;
    }

}
