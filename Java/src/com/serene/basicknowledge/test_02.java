package com.serene.basicknowledge;

import java.util.Scanner;

public class test_02 {
	public static void main(String[] args) {
		/*需求:您和您的约会对象正试图在餐厅获得一张桌子。
		键盘录入两个整数，表示你和你约会对象衣服的时髦度。(手动录入8~10之间的整数，不能录其他)
		如果你的时髦程度大于价对象的时髦程度，相亲就成功，输出true。否则输出false。
		 */
		Scanner sc = new Scanner(System.in);

		// 输入自己的时髦度
		System.out.print("请输入自己的时髦度：");
		int my = sc.nextInt();

		// 输入对象的时髦度
		System.out.print("请输入对象的时髦度：");
		int girl = sc.nextInt();

		// 进行判断
		boolean result = my > girl;

		System.out.println(result);
	}
}
