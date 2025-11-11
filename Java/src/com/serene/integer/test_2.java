package com.serene.integer;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/11
 */
public class test_2 {
    public static void main(String[] args) {
        // 在JDK5的时候提出了一个机制:自动装箱和自动拆箱
        // 自动装箱:把基本数据类型自动地变成其对应的包装类
        // 自动拆箱:把包装类自动地变成其对象的基本数据类型

        // 在底层，Java还会通过valueof这个静态方法去转换，只不过不需要我们自己去实现
        // 自动装箱
        Integer i1 = 10;

        // 自动拆箱
        int i2 = i1;
    }

}
