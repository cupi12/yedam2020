package com.yedam.hjw.classes;

//4보다 크거나 같으면 별을 찍고 4보다 작으면 별을 찍지 말라.
public class StarExample {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if ((i + j) < 4) {
					System.out.print(" ");
				} else if ((i + j) >= 4) {

					System.out.print("*");
				}

			}//end of for(j)
			System.out.println();
		}//end of for(i)
	}//end of main
}
