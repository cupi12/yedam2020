package com.yedam.hjw.classes;

public class SoftArray {

	public static void main(String[] args) {
		int[] sortAry = { 15, 13, 20, 25, 7, 17 };
		for (int i = 0; i < sortAry.length - 1; i++) {
			for (int j = i + 1; j < sortAry.length; j++) {
				int temp = 0;
				if (sortAry[i] < sortAry[j]) {
					sortAry[i] = temp;
					sortAry[i] = sortAry[j];
					sortAry[j] = temp;
				}

			}for(int k=0; k<sortAry.length; k++) {
				System.out.println(sortAry[k]);}
			
		}

	}

}
