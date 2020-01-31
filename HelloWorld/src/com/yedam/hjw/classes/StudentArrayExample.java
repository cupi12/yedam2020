package com.yedam.hjw.classes;

public class StudentArrayExample {
	public static void main(String[] args) {
		// 기본유형 - 값을 직접 넣어줌
		int[] intAry = { 1, 2, 3 };

		// 참조유형 - 값을 참조해서 가져옴 Student를 담을 수 있는 배열 생성함.
		Student[] stdAry = new Student[3];

		Student sn = new Student("choi", 20, 180, 70);

		Student stnt = new Student();
		stnt.setName("hong");
//		stnt.age = 23;
		stnt.setAge(20);
		stnt.setHeight(170);
		stnt.setWeight(65);

		Student snt = new Student();
		snt.setName("ha");
//		snt.age = 27;
		snt.setAge(28);
		snt.setHeight(179);
		snt.setWeight(68);

		stdAry[0] = sn;
		stdAry[1] = snt;
		stdAry[2] = stnt;

		for (int i = 0; i < stdAry.length; i++) {
//			if(stdAry[i].name.equals("ha"))
			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
		}
	}
}
