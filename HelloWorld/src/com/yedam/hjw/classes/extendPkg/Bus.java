package com.yedam.hjw.classes.extendPkg;

public class Bus extends Vehicle {

	@Override
	void run() {
		System.out.println("버스가 달립니다.");
		super.run();
	}

}
