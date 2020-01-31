package com.yedam.hjw;
public class ForExample {
	public static void main(String[] args) {
		char program = 64;
		for (int i = 0; i < 26; i++) {
			program = (char) (program + 1);
			System.out.println(program);
		}
		boolean trueOrFalse = true; 
		if (3 != 5) {
			System.out.println("참입니다.");
		}
	}
}