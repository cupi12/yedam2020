package com.yedam.hjw.classes;

import java.util.Calendar;

public class CalendarExample {
	static void createCal(int year, int mon) {

	}

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("현재년도 " + cal.get(Calendar.YEAR));
		System.out.println("현재 월 " + cal.get(Calendar.MONTH));
		System.out.println("현재 일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 요일 " + cal.get(Calendar.DAY_OF_WEEK));

		cal.set(2020, 0, 1);
		System.out.println("현재년도 " + cal.get(Calendar.YEAR));
		System.out.println("현재 월 " + cal.get(Calendar.MONTH));
		System.out.println("현재 일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("현재 요일 " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("전체일수 : " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
