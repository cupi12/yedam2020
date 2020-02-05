package com.yedam.hjw.api.string연습;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-323456789";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
	}

}
