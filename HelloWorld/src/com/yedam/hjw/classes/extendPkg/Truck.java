package com.yedam.hjw.classes.extendPkg;

public class Truck extends Vehicle{
	@Override
	void run() {
		System.out.println("트럭이 달립니다.");
		super.run();
	}
	
}
