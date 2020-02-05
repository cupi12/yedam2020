package com.yedam.hjw.exception;

import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = "Hello";
		try {// try&catch = try 구문에서 에러발생하면, catch쪽으로 프로그램 진행을 옮김
			System.out.println(str.toString());
		} catch (Exception e) {
//			e.printStackTrace();  <<개발단계에서 정확한 에러 단계를 출력해줌. 
			System.out.println("에러 발생, 관리자에게 문의");
		}
		System.out.println("숫자입력");
		try {
			int num = scn.nextInt();
			System.out.println("입력하신 값은 " + num);
						
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("입력한 값을 확인하세요.");
			scn.nextLine();
		} finally {
			System.out.println("반드시 실행이 되어야 할 내용");
		}
		System.out.println("프로그램 종료.");
	}// end of main

	static void findClass(int a, int b) {
		Class t;
		try {
			t = Class.forName("java.lang.String2");
			System.out.println(t.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
