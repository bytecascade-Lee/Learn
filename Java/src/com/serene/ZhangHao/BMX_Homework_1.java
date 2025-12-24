package com.serene.ZhangHao;

import java.io.*;
import java.util.ArrayList;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/24
 */
public class BMX_Homework_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bRd = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./src/com/serene/ZhangHao/score.txt")));

        String line;
        ArrayList<Student> students = new ArrayList<>();
        while ((line = bRd.readLine()) != null) {
            String[] arr = line.split("\\|");
            Student stu = new Student(arr);
            students.add(stu);
        }

        students.sort((s1, s2) ->
                // 总分不同
                s2.getTotal() != s1.getTotal() ?
                        // 排总分，大的在前面
                        s2.getTotal() - s1.getTotal() :
                        // 总分相同，数学不同
                        s2.getMath() != s1.getMath() ?
                                // 排数学，大的在前面
                                s2.getMath() - s1.getMath() :
                                // 数学相同，语文不同
                                s2.getChinese() != s1.getChinese() ?
                                        // 排语文，大的在前面
                                        s2.getChinese() - s1.getChinese() :
                                        // 语文相同，英语不同
                                        s2.getEnglish() != s1.getEnglish() ?
                                                // 排英语，大的在前面
                                                s2.getEnglish() - s1.getEnglish() :
                                                // 英语相同，理综不同
                                                (s2.getPhysics() + s2.getChemistry() + s2.getBiology()) != (s1.getPhysics() + s1.getChemistry() + s1.getBiology()) ?
                                                        // 排理综，大的在前面
                                                        (s2.getPhysics() + s2.getChemistry() + s2.getBiology()) - (s1.getPhysics() + s1.getChemistry() + s1.getBiology()) :
                                                        // 此时到这里的是所有分数都相同的，排考号，小的在前面
                                                        s1.getId().compareTo(s2.getId())


        );

        students.forEach(System.out::println);

        bRd.close();

        ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream("./src/com/serene/ZhangHao/res"));

        for (Student student : students) {
            outObj.writeObject(student);
        }

        outObj.close();
    }

}
