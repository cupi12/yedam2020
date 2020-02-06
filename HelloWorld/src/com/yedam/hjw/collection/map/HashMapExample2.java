package com.yedam.hjw.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student {
	int stdNo;
	String name;

	public Student(int stdNo, String name) {
		super();
		this.stdNo = stdNo;
		this.name = name;
	}

	@Override
	public int hashCode() { // 재정의
		return this.stdNo;
	}

	@Override
	public boolean equals(Object obj) { // 재정의
		Student s1 = (Student) obj;
		return this.name.contentEquals(s1.name);
	}

}

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(111, "이다혜"), 30); // 값을 넣어줌 이다혜 30이 키값
		map.put(new Student(111, "신아라"), 40);
		map.put(new Student(111, "이지원"), 50);
		map.put(new Student(111, "이다혜"), 60);
		System.out.println(map.size());
		Set<Student> set = map.keySet(); // keySet key에 해당하는 값들을 가지고 set에 담아줌.
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) { // 반복자를 통해 중복된 값을 제일 마지막 값으로 덮음
			Student key = iter.next();
			System.out.println(key.name + ", " + key.stdNo + ", " + map.get(key));
		}
	}
}
