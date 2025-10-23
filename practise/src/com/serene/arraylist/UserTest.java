package com.serene.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/10/23
 */
public class UserTest {
    public static void main(String[] args) {
        /*
        需求:
        1，main方法中定义一个集合，存入三个学生对象。学生属性为:id，username，password
        2，要求:定义一个方法，根据id查找对应的用户信息。
        如果存在，返回true如果不存在，返回false
         */

        ArrayList<User> userArrayList = new ArrayList<>();
        User user1 = new User("001", "张三", "123456");
        User user2 = new User("002", "李四", "000000");
        User user3 = new User("002", "赵六", "qwerty");

        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isUserExists(userArrayList, s));

    }

    public static boolean isUserExists(ArrayList<User> userArrayList, String id) {
        int len = userArrayList.size();
        for (User user : userArrayList) {
            if (user.getId().equals(id)) {
                return true;
            }
        }

        return false;

    }
}
