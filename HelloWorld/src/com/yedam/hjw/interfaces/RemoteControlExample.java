package com.yedam.hjw.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;   
		rc = new Television();      //rc는 구현값을 실행해줌
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		Television t1 = new Television();
		Audio a1 = new Audio();
		rc = t1;
		rc = a1;
	}
}
