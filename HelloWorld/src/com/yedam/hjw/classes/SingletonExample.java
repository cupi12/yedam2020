package com.yedam.hjw.classes;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		Student st1 = new Student();
		Student st2 = new Student();

		// 주소값이 같다
		System.out.println(s1 == s2);
		System.out.println(st1 == st2);
	}
}
