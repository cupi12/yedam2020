package com.yedam.hjw.common;

public class Singleton {
	private static Singleton s1 = new Singleton();

	private Singleton() {//생성자를 막음

	}

	static Singleton getInstance() {//method getinstance를 통해서만 만들수있따. 항상 동일한 인스턴스를 가지고 있다.
		return s1;
	}
}
