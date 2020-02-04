package com.yedam.hjw.interfaces;

public interface RemoteControl {
	//(상수)필드
	public static final int MAX_VOLUME = 10; //필드 생성  final 사용시 값 바꿀수없음. public static final은 쓰던 안쓰던 상관없음.
	int MIN_VOLUME=0;
	//생성자없음.
	//interface에서 abstract를 쓰던 안쓰던 다 추상메소드이다. 
	public abstract void turnOn();
	public void turnOff();
}
