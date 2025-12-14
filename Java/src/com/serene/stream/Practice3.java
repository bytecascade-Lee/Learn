package com.serene.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/14
 */
public class Practice3 {
    public static void main(String[] args) {
        /*
        数据操作
        现在有两个ArrayList集合
        第一个集合中:存储6名男演员的名字和年龄。
        第二个集合中:存储6名女演员的名字和年龄
        姓名和年龄中间用逗号和空格隔开。
        比如:张三， 23
        要求完成如下的操作:
        1，男演员只要名字为大于等于3个字的前三人
        2，女演员只要年龄小于45的，并且不要第一个
        3，把过滤后的男演员姓名和女演员姓名封装到一个Map集合里面
        4，将上一步的演员信息封装成Actor对象。

        将所有的演员对象都保存到List集合中。
        备注:演员类Actor，属性只有一个:name，age
         */

        ArrayList<String> manActor = new ArrayList<>();
        manActor.add("沈腾， 46");
        manActor.add("刘德华， 64");
        manActor.add("梁朝伟， 63");
        manActor.add("莱昂纳多·迪卡普里奥， 51");
        manActor.add("汤姆·克鲁斯， 63");
        manActor.add("吴京， 51");

        ArrayList<String> womanActor = new ArrayList<>();
        womanActor.add("巩俐， 60");
        womanActor.add("周迅， 51");
        womanActor.add("斯嘉丽·约翰逊， 41");
        womanActor.add("安妮·海瑟薇， 43");
        womanActor.add("赵丽颖， 38");
        womanActor.add("艾玛·沃特森， 35");

        Map<String, Integer> manMap = manActor.stream()
                .filter(s -> s.split("， ")[0].length() >= 3)
                .limit(3)
                .collect(Collectors.toMap(
                        s -> s.split("，")[0],
                        s -> Integer.parseInt(s.split("， ")[1])

                ));

        Map<String, Integer> womanMap = womanActor.stream()
                .filter(s -> Integer.parseInt(s.split("， ")[1]) < 45)
                .skip(1)
                .collect(Collectors.toMap(
                        s -> s.split("，")[0],
                        s -> Integer.parseInt(s.split("， ")[1])
                ));

        System.out.println(manMap);
        System.out.println(womanMap);

        List<Actor> actors = Stream.concat(
                        manMap.entrySet().stream()
                                .map(entry -> new Actor(
                                        entry.getKey(), entry.getValue()
                                )),
                        womanMap.entrySet().stream()
                                .map(entry -> new Actor(
                                        entry.getKey(), entry.getValue()
                                ))
                )
                .collect(Collectors.toList());

        actors.forEach(System.out::println);

    }

}
class Actor {
    private String name;
    private int age;


    public Actor() {
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actor = (Actor) o;
        return age == actor.age && Objects.equals(name, actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}