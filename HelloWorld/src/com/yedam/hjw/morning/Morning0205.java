package com.yedam.hjw.morning;

import java.util.Scanner;

public class Morning0205 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("2진수로 변환할 숫자를 입력해주세요.");
		int number = scn.nextInt(); // 2진수로 나눌 10진수 값
		int[] binary = new int[16]; // 2진수 치환값
		for (int i = 0; i < binary.length; i++) {
			binary[i] = number % 2; // 반대로 출력해야함.
			number /= 2;

			// for (j = i; j == 0; j--)
//			System.out.print(binary[i]);
//			System.out.println();

			if (number == 0) {
				break;
			}
		}
		for (int i = binary.length - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

	}

}
