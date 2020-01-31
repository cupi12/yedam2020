package com.yedam.hjw.classes;

public class Calendar {

	public static void main(String[] args) {
		int month = 1; // 몇월달 불러올지 매개값으로 지정

		int days = getMonthDay(month); // 매개값이 불러온 값이 몇일인지 계산하는 매서드

		int firstDay = getFirstDay(month);// 월의 첫째날의 시작 위치 지정.

		for (int i = 0; i < firstDay - 1; i++) {
			System.out.println("    ");
		}
		System.out.println(month + "월은 " + getMonthDay(month));
		// 요일 출력
		for (int i = 1; i <= 30; i++) {
			System.out.printf("%4d", i);
			if (i % 7 == 0)
				System.out.println();
		}

	}

	//
	static int getMonthDay(int month) {
		int days = 0;
		if (month <= 7 && month % 2 == 1) {// 7월보다 작을때, 홀수달이면 한달은 31일
			days = 31;
		} else if (month > 7 && month % 2 == 0) {// 7월보다 클때, 홀수달이면 한달은 31일
			days = 31;
		} else if (month == 2) {// 2월은 28일
			days = 28;
		} else {// 나머지 달은 모두 30일 지정
			days = 30;
		}
		return days;

//		for (a = 1; a < 8; a++) {
//			if (a == 2) {
//				a = 28;
//			} else if (a % 2 == 1) {
//				a = 31;
//			} else {
//				a = 30;
//			}
//			return a;
//		}
//		for (a = 8; a < 13; a++) {
//			if (a % 2 == 0) {
//				a = 31;
//			} else {
//				a = 30;
//			}
//			return a;
//
//		}
//	}
	}

	static int getFirstDay(int month) {
		if (month == 1) {// 1월달은 수요일
			return 4;
		} else if (month == 2) { // 2월달은 토요일
			return 7;
		} else if (month == 3) {// 3월달은 일요일
			return 1;
		} else if (month == 4) {// 4월달은 수요일
			return 4;
		} else {// 그 외에 달은 없음
			return 0;
		}
	}
}