package com.serene.str;

/**
 * Description: StringBuilder
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 添加
        sb.append("abc");
        sb.append('a');
        sb.append(15);
        sb.append(3.14159);
        sb.append(true);
        sb.append(new char[]{'x', 'y', 'z'});

        // 反转
        sb.reverse();

        // 长度
        int len = sb.length();
        System.out.println(len);

        // toString
        String s = sb.toString();
        System.out.println(s);

        // 打印
        // 普及:
        // 因为stringBuilder是Java已经写好的类
        // java在底层对他做了一些特殊处理。
        // 打印对象不是地址值而是属性值。
        System.out.println(sb);
    }

}
