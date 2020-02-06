package com.yedam.hjw.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; //리스트는 인터페이스이다.

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>(); // list인터페이스 arraylist가 구현클레스 할 수 있음. <list가 더 크다.>
		strList.add("하준원"); // 하나의 값을 추가할때는 .add를 사용한다.
		strList.add("박규림"); // strAry[0] = "하준원" strAry[2] = "박규림"
		strList.add("홍성우");
		System.out.println(strList.get(0)); // get메서드를 활용하여 배열의 ㄱ밧을 가져옴.

		strList.add(1, "이배진"); // 인덱스 값을 지정해줌. 1번 인덱스에 이배진 지정 후 원래 1번의 박규림을 2번으로 밀어줌
		System.out.println(strList.get(1));
		
		System.out.println("strList.add(1,이배진) 이후");
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		
		strList.remove(3); // 3번인덱스를 지움
		System.out.println("strList.remove(3) 이후");
		for (String str : strList) {
			System.out.println(str);
		}

		List<Integer> intList = new LinkedList<>(); // LinkedList는 구현클레스

	}
}
