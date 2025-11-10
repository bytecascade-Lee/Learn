package com.serene.regexdemo;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/11/10
 */
public class test_3 {
    public static void main(String[] args) {
        /*
        捕获分组，分组需要用小括号()包括起来，
        该正则表达式内如果还需要使用，则使用\\加上分组序号代替
        分组序号默认从1开始


        非捕获分组，仅仅需要包裹数据，不会占用分组
        1. (?:) 获取所有内容  java(?:8|11|17)
        2. (?=) 获取前面部分  java(?=8|11|17)
        3. (?!) 获取除前面部分的内容  java(?!8|11|17)

         */

        // 需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        // 举例:
        //       a123a   b456b   17891   a123b(false)
        // 需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        // 举例:
        //       abc123abc   b456b   123789123   &!@abc&!@   abc123abd(false)
        // 需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        // 举例:
        //       &&abc&& aaa123aaa   bbb456bbb   111789111  12345432(false)

        String r1 = "(.).+\\1";
        System.out.println("-------------------------");
        System.out.println("\"a123a\".matches(r1) = " + "a123a".matches(r1));
        System.out.println("\"b456b\".matches(r1) = " + "b456b".matches(r1));
        System.out.println("\"17891\".matches(r1) = " + "17891".matches(r1));
        System.out.println("\"a123b\".matches(r1) = " + "a123b".matches(r1));

        String r2 = "(.+).+\\1";
        System.out.println("\n\n-------------------------");
        System.out.println("\"abc123abc\".matches(r2) = " + "abc123abc".matches(r2));
        System.out.println("\"b456b\".matches(r2) = " + "b456b".matches(r2));
        System.out.println("\"123789123\".matches(r2) = " + "123789123".matches(r2));
        System.out.println("\"&!@abc&!@\".matches(r2) = " + "&!@abc&!@".matches(r2));
        System.out.println("\"abc123abd\".matches(r2) = " + "abc123abd".matches(r2));

        String r3 = "((.)\\2*).+\\1";
        System.out.println("\n\n-------------------------");
        System.out.println("\"&&abc&&\".matches(r3) = " + "&&abc&&".matches(r3));
        System.out.println("\"aaa123aaa\".matches(r3) = " + "aaa123aaa".matches(r3));
        System.out.println("\"bbb456bbb\".matches(r3) = " + "bbb456bbb".matches(r3));
        System.out.println("\"111789111\".matches(r3) = " + "111789111".matches(r3));
        System.out.println("\"12345432\".matches(r3) = " + "12345432".matches(r3));

    }

}
