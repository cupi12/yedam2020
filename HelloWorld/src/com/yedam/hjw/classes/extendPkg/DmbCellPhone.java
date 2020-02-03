package com.yedam.hjw.classes.extendPkg;

public class DmbCellPhone extends CellPhone { // dmbcellphone이 cellphone을 상속받는다라고 정의
	int channel;

	public DmbCellPhone() {
		super();
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // 부모 클레스가 가지고 있는 매개값이 2개인 생성자
		// super은 부모클레스를 가르치는 것이다.
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 : " + channel + "번 DMB방송 수신.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + " 번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 수신 종료.");
	}
}