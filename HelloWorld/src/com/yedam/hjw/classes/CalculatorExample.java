package com.yedam.hjw.classes;

import java.util.Scanner;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		while (true) {
			Scanner scn = new Scanner(System.in);
			{

				System.out.println("사칙연산 부호 : +,-,/,*   q: 종료");
				String operator = scn.nextLine();
				if (operator.equals("q")) {

					System.out.println("강제종료합니다.");

				}

				System.out.println("첫번째 수 입력");
				int num1 = scn.nextInt();

				System.out.println("두번째 수 입력");
				int num2 = scn.nextInt();

				Calculator.cal(num1, num2, operator);

			}
			System.out.println("계산 종료");
		}
	}
}
