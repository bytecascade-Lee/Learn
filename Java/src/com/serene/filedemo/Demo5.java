package com.serene.filedemo;

import java.io.File;
// import java.io.FilenameFilter;
//import java.io.FileFilter;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Demo5 {
    public static void main(String[] args) {
        /*
        File的常见成员方法（获取并遍历）
        方法名称                                        说明
        public static File[] listRoots()                列出可用的文件系统根
        public String[] list()                          获取当前该路径下所有内容
        public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles()                       获取当前该路径下所有内容
        public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
        public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
         */

        File file = new File("./src/com/serene/string");


        System.out.println("\n\n----------listRoots()----------");
        Stream.of(File.listRoots())
                .forEach(System.out::println);


        System.out.println("\n\n----------list()----------");
        Stream.of(Objects.requireNonNull(file.list()))
                .forEach(System.out::println);


        System.out.println("\n\n----------list(FilenameFilter filter)----------");
        /*Stream.of(Objects.requireNonNull(file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        }))).forEach(System.out::println);*/

        Stream.of(Objects.requireNonNull(file.list((dir, name) -> name.endsWith(".png"))))
                .forEach(System.out::println);


        System.out.println("\n\n----------listFiles()----------");
        Stream.of(Objects.requireNonNull(file.listFiles()))
                .forEach(System.out::println);


        System.out.println("\n\n----------listFiles(FileFilter filter)----------");
        /*Stream.of(Objects.requireNonNull(file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".png");
            }
        }))).forEach(System.out::println);*/

        Stream.of(Objects.requireNonNull(file.listFiles(path -> path.getName().endsWith(".png"))))
                .forEach(System.out::println);


        System.out.println("\n\n----------listFiles(FilenameFilter filter)----------");
        /*Stream.of(Objects.requireNonNull(file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        }))).forEach(System.out::println);*/

        Stream.of(Objects.requireNonNull(file.listFiles((dir, name) -> name.endsWith(".png"))))
                .forEach(System.out::println);


    }

}
