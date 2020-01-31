package com.yedam.hjw;

public class StringExample {

	public static void main(String[] args) {
		System.out.println(3 + 5);
		System.out.println("두 수의 합은 " + 8 + " 입니다.");
		System.out.println(3 + 5 + " 입니다.");
		System.out.println("두 수의 합 " + (3 + 5) + " 입니다.");

		if (5 % 3 != 0) {
			System.out.println("입니다.");
		}
		int var1 = 11;
		if (var1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		System.out.println(3==1);
		
		int var3 = 10, var4 = 20;
				if(var3 < var4) {
			System.out.println(var3);
		}else {
			System.out.println(var4);
		}
				int biggerValue = 0;
				if(var3 >= var4) {
					biggerValue = var3;
				}else {
					biggerValue = var4;
				}
				System.out.println("큰 수는 " + biggerValue);
				//              10      20
				biggerValue = (var3 >= var4) ? var3 : var4;
				System.out.println("큰수는 " + biggerValue);
	}

}
