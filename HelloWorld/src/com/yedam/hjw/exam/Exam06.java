package com.yedam.hjw.exam;

import java.util.Scanner;

public class Exam06 {
	Student[] students = new Student[10];
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1:등록|2:조회|3:리스트|4:수정");
			System.out.println("선택 > ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름 :");
				String name = scn.nextLine();
				System.out.println("학번");
				int num = scn.nextInt();
				System.out.println("영어점수");
				int engscore = scn.nextInt();
				System.out.println("수학점수");
				int mathscore = scn.nextInt();
			
				Student stu = new Student(name, num, engscore, mathscore);
				addStu(stu, students);
				
			}
			if (menu == 2) {// 조회
				System.out.println("학번 입력");
				int no = scn.nextInt();
				Student stu = getNum(no);

			}
			if (menu == 3) {// 리스트
				stuList(students);
			}
			if (menu == 4) {// 수정
				System.out.println("조회할 학번 입력");
				int stunum = scn.nextInt();
				scn.nextLine();
				System.out.println("수정할 영어점수 입력");
				String engscore = scn.nextLine();
				int eng = 0;
				if (engscore != null && !engscore.contentEquals(""))
					eng = Integer.parseInt(engscore);
				System.out.println("수정할 수학점수 입력");
				String mathscore = scn.nextLine();
				int math = 0;
				if (mathscore != null && !mathscore.contentEquals(""))
					math = Integer.parseInt(mathscore);

			}
		}
	}
}
