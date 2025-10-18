
package com.serene.test_1;


import java.util.Scanner;

public class test_01{
	public static void main(String[] args) {
		// 键盘录入一个三位数，然后输出它的个位、十位和百位。

		// 1.键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数:");
		int number = sc.nextInt();

		// 2.获取
		int a = number % 10;
		int b = number / 10 % 10;
		int c = number / 100 % 10;

		// 3.打印
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}

}
