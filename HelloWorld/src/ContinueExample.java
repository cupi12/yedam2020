
public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 3 == 0)
				// 짝수일 경우 for문 다시 println 무시, 다시 반복
				continue;
			System.out.println("i => " + i);
		}

	}

}
