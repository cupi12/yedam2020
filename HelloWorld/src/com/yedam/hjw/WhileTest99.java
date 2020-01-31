package com.yedam.hjw;

public class WhileTest99 {

	public static void main(String[] args) {
		System.out.println("    1단                  2단                   3단              4단                   5단                       6단               7단                  8단                 9단");
		int i = 1;
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.print(j + " X " + i + " = " + (i * j) + "|");
				j++;
				if (j == 10) {
					i++;
					System.out.println();					
				}
			}

		}

	}

}
