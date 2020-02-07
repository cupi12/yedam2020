package com.yedam.hjw.exam;

public class Student {
	String name; // 학생이름
	int num; // 학번
	int engscore; // 영어점수
	int mathscore; // 수학점수

	public Student(String name, int num, int engscore, int mathscore) {
		super();
		this.name = name;
		this.num = num;
		this.engscore = engscore;
		this.mathscore = mathscore;
	}

	public void addStu(Student stu, Student[] stus) { // 저장
		for (int i = 0; i < stus.length; i++) {
			if (stus[i] == null) {
				stus[i] = stu;
				break;
			}
		}
		System.out.println("입력완료");
	}// end of addStu

	public void stuList(Student[] stus) {// 리스트
		for (Student stu : stus) {
			if (stu != null) {
				System.out.println(stu);
			}
		}
	}

	// get set 메소드
	public String getName(int num) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getEngscore() {
		return engscore;
	}

	public void setEngscore(int engscore) {
		this.engscore = engscore;
	}

	public int getMathscore() {
		return mathscore;
	}

	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + ", engscore=" + engscore + ", mathscore=" + mathscore + "]";
	}

}// end of class
