package com.serene.iopractice;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/25
 */
public class Practice2 {
    public static void main(String[] args) {
        /*
        随机点名器1（学生独立完成）
        需求：
        有一个文件里面存储了班级同学的信息，每一个信息占一行。
        格式为：张三-男-23
        要求通过程序实现随机点名器。
        运行效果：
        第一次运行程序：随机同学姓名1（只显示名字）
        第二次运行程序：随机同学姓名2（只显示名字）
        第三次运行程序：随机同学姓名3（只显示名字）
         */
        File file = new File("./src/com/serene/iopractice/test/names.txt");

        List<String> rawList = FileUtil.readLines(file, StandardCharsets.UTF_8);
        ArrayList<String> nameList = new ArrayList<>();
        for (String string : rawList) {
            nameList.add(string.split("-")[0]);
        }
        Random r = new Random();
        int len = nameList.size();
        int n = r.nextInt(len);
        System.out.println(nameList.get(n));
    }

}
