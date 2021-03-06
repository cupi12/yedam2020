package com.yedam.hjw.classes;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {

			System.out.println("년 입력 >  종료= 0");
			int year = scn.nextInt();
			if (year == 0)
				break;

			System.out.println("월 입력 >");
			int month = scn.nextInt();
			createCal(year, month);
		}
		System.out.println("종료");
	}
//End main

	static void createCal(int year, int mon) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon - 1, 1);
		cal.get(Calendar.DAY_OF_WEEK);
		cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("======================");
		System.out.println("   <<<" + year + "년 " + mon + "월>>>");
		int month = mon;
		String[] day = { "일", "월", "화", "수", "목", "금", "토" };
		int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		// 요일 출력.
		for (int i = 0; i < day.length; i++) {
			System.out.print("  " + day[i]);
		}
		System.out.println();
		// 월의 첫째날의 시작위치 지정.
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("   ");
		}
		// 7일씩 잘라서 출력.
		for (int i = 1; i <= days; i++) {
			System.out.printf("%3d", i);
			if ((firstDay - 1 + i) % 7 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("======================");
	}

}
