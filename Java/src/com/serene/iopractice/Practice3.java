package com.serene.iopractice;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/25
 */
public class Practice3 {
    public static void main(String[] args) {
        /*
        随机点名器2（学生独立完成）
        需求:
        一个文件里面存储了班级同学的信息，每一个学生信息占一行。
        格式为：张三-男-23。
        要求通过程序实现随机点名器。
        运行效果：
        70%的概率随机到男生
        30%的概率随机到女生
        总共随机100万次，统计结果。
        注意观察：看生成男生和女生的比例是不是接近于7：3
         */
        File file = new File("./src/com/serene/iopractice/test/names.txt");

        ArrayList<String> rawList = (ArrayList<String>) FileUtil.readLines(file, StandardCharsets.UTF_8);
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();

        for (String name : rawList) {
            String[] s = name.split("-");
            if ("男".equals(s[1])) {
                boys.add(s[0]);
            } else {
                girls.add(s[0]);
            }
        }

        int boyCount = 0;
        int girlCount = 0;
        int boyLen = boys.size();
        int girlLen = girls.size();

        Random r = new Random();
        for (int times = 0; times < 1 << 10 << 10; times++) {
            int n = r.nextInt(10);
            // 0~6 为7个数，为男生
            // 7~9 为3个数，为女生
            if (n < 7) {
                boyCount++;
                int i = r.nextInt(boyLen);
                System.out.println(boys.get(i));
            } else {
                girlCount++;
                int i = r.nextInt(girlLen);
                System.out.println(girls.get(i));
            }
        }

        System.out.println("男: " + boyCount + "  " + (boyCount * 1.0 / (1 << 10 << 10)));
        System.out.println("女:" + girlCount + "  " + (girlCount * 1.0 / (1 << 10 << 10)));
        System.out.println(boyCount * 1.0 / girlCount);
        System.out.println(7.0 / 3);

    }

}
