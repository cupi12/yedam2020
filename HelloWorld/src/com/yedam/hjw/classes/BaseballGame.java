package com.yedam.hjw.classes;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		int[] answer = new int[3];

		for (int i = 0; i < answer.length-1; i++) {
			answer[i] = (int) (Math.random() * 9) + 1;
		}
		System.out.println("[?] [?] [?]");
		System.out.println("숫자 3개 입력 >");
		while (true) {
			for (int i = 0; i < answer.length - 1; i++) {
				int S = 0;
				int B = 0;
				int no1, no2, no3;
				System.out.println("숫자입력");
				Scanner scn = new Scanner(System.in);
				no1 = scn.nextInt();
				System.out.println("숫자입력");
				Scanner scn2 = new Scanner(System.in);
				no2 = scn2.nextInt();
				System.out.println("숫자입력");
				Scanner scn3 = new Scanner(System.in);
				no3 = scn3.nextInt();
				{
					if (no1 == answer[i]) {
						if (no1 == answer[0]) {
							S++;
						} else if (no1 == answer[1]) {
							B++;
						} else if (no1 == answer[2]) {
							B++;
						} else
							System.out.println(" 1번 X  ");
					} else if (no2 == answer[i]) {
						if (no2 == answer[0]) {
							B++;
						}
						if (no2 == answer[1]) {
							S++;
						}
						if (no2 == answer[2]) {
							B++;
						} else
							System.out.println(" 2번 X  ");

					} else if (no3 == answer[i]) {
						if (no3 == answer[0]) {
							B++;
						}
						if (no3 == answer[1]) {
							B++;
						}
						if (no3 == answer[2]) {
							S++;
						} else
							System.out.println(" 3번 X  ");

					}
				}
				System.out.println();
				System.out.println("스트라이크 :" + S + " 볼 " + B);
				if (S == 3) {
					System.out.println("모두 맞추셨습니다! 프로그램을 종료합니다");
					break;
				}
			}
		}
	}
}
