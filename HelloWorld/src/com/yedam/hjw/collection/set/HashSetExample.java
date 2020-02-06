package com.yedam.hjw.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<>();
		strSet.add("Java");
		strSet.add("Oracle");
		strSet.add("Program");
		strSet.add("Java");
		System.out.println(strSet.size());  //3개만 나옴, 중복값은 허용하지 않아서
		
		for(String str : strSet) {
			System.out.println(str);
		}
	}
}
