package com.serene.algorithmhomework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/19
 */
public class Homework1 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1:属性有姓名、年龄、身高。
        要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，
              身高一样按照姓名的字母进行排序(姓名中不要有中文或特殊字符，会涉及到后面的知识)
         */

        GirlFriend[] girlFriends = new GirlFriend[3];
        GirlFriend g1 = new GirlFriend("xiaoshishi", 18, 170);
        GirlFriend g2 = new GirlFriend("xiaodandan", 19, 165);
        GirlFriend g3 = new GirlFriend("xiaoxiangxiang", 16, 160);

        girlFriends[0] = g1;
        girlFriends[1] = g2;
        girlFriends[2] = g3;

        Arrays.sort(girlFriends, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                // 逐层使用if进行条件判断，代码过于复杂
//                int deltaAge = o1.getAge() - o2.getAge();
//                if (deltaAge == 0) {
//                    int deltaHeight = o1.getHeight() - o2.getHeight();
//                    if (deltaHeight == 0) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                    return deltaHeight;
//                }
//                return deltaAge;

                // 下面使用三元运算进行进化，简化时不建议嵌套使用三元运算
                // 简化写法：
                int result = o1.getAge() - o2.getAge();
                result = result == 0 ? o1.getHeight() - o2.getHeight() : result;
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }


        });

        System.out.println(Arrays.toString(girlFriends));

    }

}

class GirlFriend {
    private String name;
    private int age;
    private int height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name 姓名，英文字母
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age 年龄，整数
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height 身高，单位厘米
     */
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}