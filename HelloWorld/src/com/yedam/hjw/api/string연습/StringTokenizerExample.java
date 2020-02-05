package com.yedam.hjw.api.string연습;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		//전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();  //>>countTokens 꺼내지 않고 남아있는 토큰의 수 
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		} // end of for
		System.out.println();
		
		//남아있는 토큰을 확인하고 while문으로 루핑
		
		st= new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {  //hasMoreTokens >> 남아있는 토큰을 확인하는 메소드
			String token = st.nextToken();
			System.out.println(token);
		}
	}// end of main
}
