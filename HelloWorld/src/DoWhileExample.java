import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		//import를 주어야 scanner 가능
		Scanner scn = new Scanner(System.in);
		System.out.println("메세지를 입력하세요");
		System.out.println("종료하려면 q 입력>");
		String input = "";
		do {
			System.out.println(">");
			//사용자가 출력한 값을 가져오시오
			//input에 입력 받는다
			input = scn.nextLine();
			//input값 출력
			System.out.println("==>" + input);
			//만약 q를 누르면 반복, q를 누르지 않으면 빠져나감
			//! 부정을 사용하여 거짓 참 입력
		}while (!input.equals("q"));
		System.out.println("프로그램 종료");
		
		
		
		
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while (i ==5);

	}

}
