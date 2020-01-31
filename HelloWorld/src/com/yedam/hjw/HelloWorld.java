package com.yedam.hjw;

public class HelloWorld {
	/*
	 * 여러 라인을 주석처리할 때 사용합니다. 작성자 하준원
	 */
	public static void main(String[] args) {
		int age = 27;
		// age라고 하는 변수에 27이라는 값을 담겠다.
		int year = 2020;
		// 타입을 적어주고, 변수를 적어줌
		System.out.println("Hello, welcome to the java world");
		System.out.println("올해는 " + year);

		// +는 SQL의 CONCAT 과 같음
		System.out.println("나이는 " + age);
		System.out.println(year + age);
		System.out.println("올해는 " + year + "내 나이는" + age + " 입니다");
		System.out.println("올해는" + year);
		System.out.println("내 나이는 " + age + "입니다");
//year, age는 숫자라서 더하면 값끼리 더하게 된다.
		
		long height = 17900000000L;
		int weight = 68;
		year = 2021;
		
		int firstDayOfYear =1;
		
		//int타입의 sum을 long으로 변환시켜주는법
		long sum = 0;
		int firstValue = 2000000000;
		int secondValue = 1000000000;
		sum = (long)firstValue + secondValue;
		System.out.println("두 수의 합은 : " + sum);
		System.out.println("내 몸무게는" +  height + " 입니다");

		//여러개의 변수를 같은 타입으로 저장할때
		int num1, num2, num3 ;
		//num1 num2 초기화를 시켜준다. (할당, 대입, 초기화)
		num1 = 10;
		num2 = 20;
		//num1, num2초기화를 하지 않으면 에러가 뜬다.
		//num1, num2를 초기화 시켜주고 summary를 num1 + num2 로 초기화시켜줌
		int summary = num1 + num2;
		System.out.println("summary의 값은: " + summary);
		
		
	}
}

