package com.yedam.hjw;
public class IfElseExample {
	public static void main(String[] args) {
		int result = 85;
		if (result >= 90) {
			{
				if (result >= 95) {
					System.out.println("A+학점");
				}

				else {
					System.out.println("A학점");
				}
			}
		}

		else if (result >= 80) {
			{
				if (result >= 85) {
					System.out.println("B+학점");
				}

				else {
					System.out.println("B학점");
				}
			}
		} else if (result >= 70) {
			{
				if (result >= 75) {
					System.out.println("C+학점");
				}

				else {
					System.out.println("F학점");
				}
				// 전부 if로 사용하면 80점 입력시, B학점, C학점이 출력된다. (빠져나오질 못함)
			}
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// 중괄호를 사용하여 묶어주지 않으면 if문 바로 밑에 값만 출력된다.
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println("i :" + i + ", sum : " + sum);
			}
		}
		int varl1, varl = 5;
		for (int i = 1; i <= 9; i++) {
			varl1 = varl * i;
			System.out.println(varl + " * " + i + " = " + varl1);
		}
	}
}