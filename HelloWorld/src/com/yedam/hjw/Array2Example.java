package com.yedam.hjw;

public class Array2Example {

	public static void main(String[] args) {
		int[] intAry = new int[5];
		for (int i = 0; i < 5; i++) {
			intAry[i] = i * 10 + 10;

		}
		System.out.println("배열의 벙뮈내에서 값을 실행");
		for (int i = 0; i <= 4; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("=============");
		int[] intAry2 = new int[100];
//		for (int i =0; i<100; i++) {
//			intAry2[i]=(i+1)*5;
//			System.out.print(intAry2[i] + " ");
//			//5로 나눈 나머지가 4가 나옴. (배열은 0부터 시작함)
//			if(i % 5 == 4) {
//			System.out.println();
//			}
//
//			}
		int i = 0;
		while (i <= 99) {
			intAry2[i] = (i + 1) * 5;

			System.out.print(intAry2[i] + " ");
			
			if (intAry2[i] % 25 == 0) {
				System.out.println();
			}
			i++;
		}
	}
}
