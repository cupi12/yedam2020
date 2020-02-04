package com.yedam.hjw.classes.extendPkg;

public class Friend {
	private String name;
	private String phone;

	public Friend(String name, String phone) { // 생성자 생성
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() { // get set 생성
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() { 
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	public void showInfo() {
		System.out.println("이름은 " + name);
		System.out.println("전화번호는" + phone);
	}

}
