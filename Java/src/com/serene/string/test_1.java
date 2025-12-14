package com.serene.string;

/**
 * Description: java.util.lang  创建字符串对象
 *
 * @author Serene Lee
 * date 2025/10/18
 */
public class test_1 {
    public static void main(String[] args) {
        // java.util.lang

        // 1.使用直接赋值的方式创建一个字符串对象
        String s1 = "Hello world!";
        System.out.println(s1);


        // 2.使用构造方法new一个字符串对象

        // 空参构造
        String s2 = new String();
        System.out.println(s2);

        // 由字符串构造
        String s3 = new String("Hello world!");
        System.out.println(s3);

        // 由字符数组构造
        // 传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        // 需求：我要修改字符串的内容。
        // "abc" -> {'a', 'b', 'c',} -> {'q', 'b', 'c',} -> "qbc"
        char[] arr1 = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String s4 = new String(arr1);
        System.out.println(s4);

        // 由字节数组构造
        // 应用场景：以后在网络当中传输的数据其实都是字节信息
        // 我们一般要把字节信息进行转换，转成字符串
        byte[] arr2 = {65, 66, 67, 68, 69};
        String s5 = new String(arr2);
        System.out.println(s5);

    }

}
