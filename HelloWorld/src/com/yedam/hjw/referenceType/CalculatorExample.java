package com.yedam.hjw.referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		sum(num1, num2);
//		minus(num1, num2);
//		multi(2, 33);
//		divide(9, 2);
//		printstar(7, "+");
		int r = sum2(1, 2);
		System.out.println("r의 값은: " + r);
		System.out.println(hello("kk"));
		
	}

	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("두 수의 합은 : " + result);
	}

	public static void minus(int x, int y) {
		int result = x - y;
		System.out.println("두 수의 차는 : " + result);
	}

	public static void multi(int i, int j) {
		int result = i * j;
		System.out.println("두 수의 곱은 : " + result);
	}

	public static void divide(double n, double m) {
		double result = n / m;
		System.out.println("나눈 값은 : " + result);
	}

	public static void print(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.println(str);
		}

	}

	public static void printstar(int q, String w) {
		for (int i = 0; i < q; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(w);
			System.out.println();
		}

	}

	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result;
	}
	public static String hello(String name) {
		return "Hey " + name;
	}
}