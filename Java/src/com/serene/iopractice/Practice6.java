package com.serene.iopractice;

//import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.List;
//import java.util.Scanner;
//import java.util.List;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/25
 */
public class Practice6 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        要求1：每次被点到的学生，再次被点到的概率在原先的基础上降低一半。
        举例：80个学生，点名5次，每次都点到小A，概率变化情况如下：
        第一次每人概率：    1.25%
        第二次小A概率：     0.625%
        其他学生概率：      1.2579%
        第三次小A概率：     0.3125%
        其他学生概率：      1.261867%
        第四次小A概率：     0.15625%
        其他学生概率：      1.2638449%
        第五次小A概率：     0.078125%
        其他学生概率：      1.26483386%
         */
//        File file = new File("./src/com/serene/iopractice/test/names.txt");
//        List<String> stringList = FileUtil.readLines(file, StandardCharsets.UTF_8);
//        ArrayList<Student> students = new ArrayList<>();
//
//        for (String s : stringList) {
//            students.add(new Student(s.split("-")));
//        }
//
//        for (Student student : students) {
//            student.setWeight(10);
//        }
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("./src/com/serene/iopractice/test/inner"));
        ArrayList<Student> students = (ArrayList<Student>) objIn.readObject();
        int size = students.size();
        objIn.close();


        double totalWeight = 0;
        for (Student s : students) {
            totalWeight += s.getWeight();
        }
//        System.out.println("总权重为：" + totalWeight);

        double[] actualProportion = new double[size];
        for (int i = 0; i < size; i++) {
            actualProportion[i] = students.get(i).getWeight() / totalWeight;
        }
//        System.out.println("每个人的占比是:" + Arrays.toString(actualProportion));

        double[] actualWeight = new double[size];
        actualWeight[0] = actualProportion[0];
        for (int i = 1; i < size; i++) {
            actualWeight[i] = actualWeight[i - 1] + actualProportion[i];
        }
//        System.out.println("每个人的实际权重是:" + Arrays.toString(Arrays.stream(actualWeight).limit(20).toArray()));

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            double random = Math.random();
            System.out.println(random);
            // binarySearch:二分查找法查找元素
            // 细节1:二分查找的前提:数组中的元素必须是有序的，数组中的元素必须是升序的
            // 细节2:如果要查找的元素是存在的，那么返回的是真实的索引
            // 但是，如果要查找的元素是不存在的，返回的是-插入点 -1
            // 疑问:为什么要减1呢?
            // 解释:如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
            // 如果要查找数字0，此时0是不存在的，但是按照上面的规则插入的话，应该就是在数组的最前面，此时是-0
            int temp = Arrays.binarySearch(actualWeight, random);
            int index = temp >= 0 ? temp : -temp - 1;
//            System.out.println(index);
//            System.out.println(index * 0.005);
//            System.out.println((index + 1) * 0.005);
            Student stu = students.get(index);
            stu.setWeight(stu.getWeight() / 2);
            System.out.println(stu);
//            System.out.println();
        }


        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("./src/com/serene/iopractice/test/inner"));
        objOut.writeObject(students);
        objOut.close();
    }

}
