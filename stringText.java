package com.democardla.java;

/**
 *
 * @author democardla
 *
 */


class stringText {
	public static void main(String[] args) {
		String s1 = "hello world";
		System.out.println(s1);
		char a = 'a';
		System.out.println(a);
		//string可以与boolean型做连接运算：结果是string型
		int number = 1001;
		String numberStr = "NO.";
		String info = numberStr + number;//连接运算
		System.out.println(info);//NO.1001

		boolean bi = true;
		info = numberStr + bi;
		System.out.println(info);//NO.true
		//与string直接相加的类型都会被转成string类型

		String s2 = 12 + "";//冒号里面不能有值
		System.out.println(s2);

		int output = Integer.parseInt(s2);//从字符串到整型：s2必须是纯int型字符串，里面不可以有char
		System.out.println(output);

	}
}