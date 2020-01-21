
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
	}
}
