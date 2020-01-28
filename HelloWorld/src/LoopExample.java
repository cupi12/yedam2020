//3의 배수이면서 7의 배수 출력 for문
public class LoopExample {

	public static void main(String[] args) {
		{
			for (int i = 1; i <= 100; i++) {
				if ((i % 3 == 0) && (i % 7 == 0))
					System.out.println(i);

				if(i==100) break;
			}
		}
		//3의 배수이면서 7의 배수 출력 while문
		int i = 1;
		while (i <= 100) {
			if ((i % 3 == 0) && (i % 7 == 0))
				System.out.println(i);
			i++;
		}
	}
}