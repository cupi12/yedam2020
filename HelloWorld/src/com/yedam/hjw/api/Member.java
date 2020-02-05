package com.yedam.hjw.api;

public class Member {
	String name;
	int age;

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.age==m.age && this.name.equals(m.name);
	
	
	}//문자열이 같은지 알아볼때는 'equals', 숫자 '=='

	@Override
	public int hashCode() {
		
		return age;
	}

}