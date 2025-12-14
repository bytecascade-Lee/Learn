package com.serene.string;

import java.util.StringJoiner;

/**
 * Description:StringJoiner
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_15 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        sj.add("a").add("b").add("c");
        System.out.println(sj.length());
        System.out.println(sj);
        String s = sj.toString();
        System.out.println(s);

    }

}
