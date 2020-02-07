package com.yedam.hjw.morning;

import java.util.Scanner;

public class ElectricFee {

	public static void main(String[] args) {
		System.out.println("사용한 전력 입력");
		Scanner scn = new Scanner(System.in);
		int w = scn.nextInt(); // 와트수 입력받는 변수
		int fee = 0;

		for (int i = 1; i <= w; i++) {
			if (i <= 100)
				fee += 100;
			// System.out.println(fee1);
			else if (i > 100 && i <= 200)
				fee += 150;
			else if (i > 200 && i <= 300)
				fee += 230;
			else
				fee += 300;

		}
		System.out.println("사용하신 " + w + "W 에 대한 요금은 " + fee + "원 입니다.");

	}// end of main
}// end of class