package com.yedam.hjw.classes.extendPkg;

public class UnivFriend extends Friend {
	private String university; // private에서 다른클레스에서 쓸 수 있게 하기 위하여 source - getset메서드 가져옴

	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}

	public String getUniversity() {// get : 값을 가져옴
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	} //get set 메서드 종료

	@Override
	public void showInfo() { //부모클레스가 가진 showinfo클레스를 그대로 다시 쓰겠다. (재정의)
		super.showInfo(); 
		System.out.println("학교친구 이름은" + super.getName());
		System.out.println("학교친구 전화번호는 " + super.getPhone());
		System.out.println("학교는 " + university);
	}//override

}
