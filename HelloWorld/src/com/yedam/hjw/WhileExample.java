package com.yedam.hjw;
//값이 6일 경우에 반복문을 그만 두겠다.
public class WhileExample {

	public static void main(String[] args) {
		int i = 0;
		while (true) {
			i = (int) (Math.random() * 6);
			System.out.println(i);
			i++;
			if (i == 5) {
				break;
			}
		}

	}

}
