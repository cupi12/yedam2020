package com.yedam.hjw.classes.extendPkg;

public class DriveExample {

	public static void main(String[] args) {
		Drive d1 = new Drive();

		Vehicle vehicle = new Vehicle();
		d1.drive(vehicle); // 실행

		vehicle = new Bus(); // Promotion(자동형변환)
		d1.drive(vehicle); // 실행

		vehicle = new Truck(); // Promotion(자동형변환)
		d1.drive(vehicle); // 실행

	}

}

//vehicle 에 어떤 인스턴스가 담겨지느냐에 따라 값이 달라짐을 알 수 있다. 다형성의 예