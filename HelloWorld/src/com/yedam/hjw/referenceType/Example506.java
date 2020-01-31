package com.yedam.hjw.referenceType;

public class Example506 {

	public static void main(String[] args) {
		int max = 0;
		int max2 = 0;
		int j = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		while (j < array.length) {
			if (array[j] > max2) {
				max2 = array[j];

			}
			j++;

		}
		System.out.println("while max : " + max2);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("for max : " + max);

	}

}
