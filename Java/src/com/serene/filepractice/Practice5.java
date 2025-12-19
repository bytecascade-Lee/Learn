package com.serene.filepractice;

//import java.io.File;
//import java.util.HashMap;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/18
 */
public class Practice5 {
    public static void main(String[] args) {
        /*
        需求：统计一个文件夹中每种文件的个数并打印。（考虑子文件夹）
        打印格式如下：
        txt:3个
        doc:4个
        jpg:6个
         */

        /*File file = new File("src\\com\\serene\\map");
        System.out.println(find(file));*/
    }

    /*public static HashMap<String, Integer> find(File file) {
        if (file.isFile()) {
            throw new RuntimeException("必须传入文件夹！");
        }

        HashMap<String, Integer> map = new HashMap<>();
        File[] files = file.listFiles();

        for (File fl : files) {
            if (fl.isFile()) {
                String[] arr = fl.getName().split("\\.");
                int len = arr.length;
                String key = len == 1 ? "" : arr[len - 1].toLowerCase();
                map.put(key, map.getOrDefault(key, 0) + 1);
            } else {
                HashMap<String, Integer> map1 = find(fl);
                map1.forEach((key, value) -> map.merge(key, value, Integer::sum));
            }
        }

        return map;
    }*/

}
