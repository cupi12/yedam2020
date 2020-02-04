package com.yedam.hjw.classes.abstractPkg;

public abstract class Animal {

	String kind;// 필드

	// 기본 생성자 존재.
	void breathe() { // 메소드
		System.out.println("숨을 쉽니다.");
	}

	abstract void sound();// 추상메소드
	abstract void sleep();
}
