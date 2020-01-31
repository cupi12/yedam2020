package com.yedam.hjw;

public class SwitchExample {

	public static void main(String[] args) {
//		int result = (int) (Math.random() * 6) + 1;
//		switch(result) {
//		case 1:
//			System.out.println("1번이 나왔습니다.");
//			break;		
//		case 2:
//			System.out.println("2번이 나왔습니다.");
//			break;
//		case 3:
//			System.out.println("3번이 나왔습니다.");
//			break;
//		case 4:
//			System.out.println("4번이 나왔습니다.");
//			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		case 6:
//			System.out.println("6번이 나왔습니다.");
//			break;
//		}
////		System.out.println(result);
		int grade = 64;
		grade = grade / 10;
//		switch (grade) {
//		case 10:
//			System.out.println("A+");
//		case 9:
//			System.out.println("A");
//		}
		if (grade == 10) {
			System.out.println("A+");
		} else if (grade == 9) {
			System.out.println("A");
		} else if (grade == 8) {
			System.out.println("B+");
		} else if (grade == 7) {
			System.out.println("B");
		} else if (grade == 6) {
			System.out.println("C+");
		} else if (grade == 5) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}

}
