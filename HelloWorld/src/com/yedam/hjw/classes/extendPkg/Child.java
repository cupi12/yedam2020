package com.yedam.hjw.classes.extendPkg;

public class Child extends Parent { //Parent클래스를 상속받는 Child 클레스 extends를 사용하여 지정함
	String field2;
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
	}
	void method2() {
		System.out.println("자식클래스의 메소드2");
	}
	@Override
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}
}
