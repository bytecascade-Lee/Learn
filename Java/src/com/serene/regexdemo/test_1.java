package com.serene.regexdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/9
 *
 */

public class test_1 {
    public static void main(String[] args) {
        /* 需求
            请编写正则表达式验证用户输入的手机号码是否满足要求。
            请编写正则表达式验证用户输入的邮箱号是否满足要求。
            请编写正则表达式验证用户输入的电话号码是否满足要求。
            验证手机号码  13112345678
                          13712345667
                          13945679027
                          12512356624
                          139456790271
                          12122
            验证座机电话号码  027-87541111
                              02787541120
                              87540000
                              027-424242
                              0377-67256666
            验证邮箱号码  3232323@qq.com
                          zhangsan@itcast.cnn
                          dleieee9@163.com
                          dleieee9@pci.com.cn
                          hello_world@a.com
        */
        // 手机号码 正则表达式
        System.out.println("\n\n----------  手机号码 正则表达式  ----------");
        String r1 = "1[3-9]\\d{9}";
        System.out.println("\"13112345678\".matches(r1) = " + "13112345678".matches(r1));
        System.out.println("\"13712345667\".matches(r1) = " + "13712345667".matches(r1));
        System.out.println("\"13945679027\".matches(r1) = " + "13945679027".matches(r1));
        System.out.println("\"12512356624\".matches(r1) = " + "12512356624".matches(r1));
        System.out.println("\"139456790271\".matches(r1) = " + "139456790271".matches(r1));
        System.out.println("\"12122\".matches(r1) = " + "12122".matches(r1));

        // 座机号码 正则表达式
        System.out.println("\n\n----------  座机号码 正则表达式  ----------");
        String r2 = "(0\\d{2,3}-?)?\\d+";
        System.out.println("\"027-87541111\".matches(r2) = " + "027-87541111".matches(r2));
        System.out.println("\"02787541120\".matches(r2) = " + "02787541120".matches(r2));
        System.out.println("\"87540000\".matches(r2) = " + "87540000".matches(r2));
        System.out.println("\"027-424242\".matches(r2) = " + "027-424242".matches(r2));
        System.out.println("\"0377-67256666\".matches(r2) = " + "0377-67256666".matches(r2));

        // 邮箱地址 正则表达式
        System.out.println("\n\n----------  邮箱地址 正则表达式  ----------");
        String r3 = "\\w+@[\\w+&&[^_]]+(\\.[a-zA-Z]+)+";
        System.out.println("\"3232323@qq.com\".matches(r3) = " + "3232323@qq.com".matches(r3));
        System.out.println("\"zhangsan@itcast.cnn\".matches(r3) = " + "zhangsan@itcast.cnn".matches(r3));
        System.out.println("\"dleieee9@163.com\".matches(r3) = " + "dleieee9@163.com".matches(r3));
        System.out.println("\"dleieee9@pci.com.cn\".matches(r3) = " + "dleieee9@pci.com.cn".matches(r3));
        System.out.println("\"hello_world@a.com\".matches(r3) = " + "hello_world@a.com".matches(r3));

    }


}
