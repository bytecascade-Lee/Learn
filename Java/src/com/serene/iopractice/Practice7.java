package com.serene.iopractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Description:
 *
 * @author Serene Lee
 * @date 2025/12/26
 */
public class Practice7 {
    public static void main(String[] args) throws IOException {
        /*
        登录注册1（课堂讲解）
        需求：写一个登陆小案例。
        步骤：
        将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        保存格式为:username=zhangSan&password=123
        让用户键盘录入用户名和密码
        比较用户录入的和正确的用户名密码是否一致
        如果一致则打印登陆成功
        如果不一致则打印登陆失败
         */

        BufferedReader bRd = new BufferedReader(new FileReader("./src/com/serene/iopractice/test/userinfo.txt"));
        String[] strings = bRd.readLine().split("&");
        bRd.close();

        HashMap<String, String> userInfoMap = new HashMap<>();
        for (String s : strings) {
            String[] temp = s.split("=");
            userInfoMap.put(temp[0], temp[1]);
        }
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        if (userName.equals(userInfoMap.get("username"))) {
            String password = sc.nextLine();
            if (password.equals(userInfoMap.get("password"))) {
                System.out.println("登录成功");
            } else {
                System.out.println("密码错误");
            }
        } else {
            System.out.println("用户名错误");
        }

    }

}
