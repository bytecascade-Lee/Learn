package com.serene.str;

/**
 * Description: 敏感词替换
 *
 * @author Serene Lee
 * date 2025/10/19
 */
public class test_12 {
    public static void main(String[] args) {
        String  s = "你玩的真好，以后不要再玩了，TMD，你是SB，MLGB";

        String[] arr = {"TMD", "SB", "NMD", "MLGB"};

        for (String str : arr) {
            s = s.replace(str, "***");
        }

        System.out.println(s);

    }

}
