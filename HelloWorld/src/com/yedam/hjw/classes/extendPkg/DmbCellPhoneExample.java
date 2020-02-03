package com.yedam.hjw.classes.extendPkg;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d1 = new DmbCellPhone("sky", "white", 10);
		d1.powerOn(); // CellPhone의 메소드
		d1.turnOnDmb(); // DmbCellPhone 메소드
		d1.changeChannel(20);
		d1.turnOffDmb();
		d1.sendMessage("반갑습니다");
		d1.receiveMessage("안녕하세요");
		d1.powerOff();

		CellPhone c1 = new DmbCellPhone();
		// 부모는 자식인스턴스를 담을 수 있다.
		// 자식을 부모에게 담을때는 자동 형변환이 일어남.
		if (c1 instanceof DmbCellPhone) {
			DmbCellPhone d2 = (DmbCellPhone) c1;
			// 부모를 자식인스턴스에 담을때는 강제형변황(캐스팅)을 해줘야함.
			d2.turnOnDmb();
			d2.changeChannel(40);
			d2.turnOffDmb();
		}
			CellPhone c2 = new CellPhone();
			if(c2 instanceof DmbCellPhone) {
			DmbCellPhone d3 = (DmbCellPhone) c2;
			}else {
				System.out.println("casting 불가");
			}
		}
}