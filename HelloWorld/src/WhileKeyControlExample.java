
public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;

		while (run) {

			if (keyCode != 13 && keyCode != 10) {
				System.out.println("-------------------");
				System.out.println("1.증속  | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.println("선택 : ");
			}
			//사용자가 입력하는 키 값을 읽어서 keyCode에 넣어줌
			keyCode = System.in.read();
			System.out.println(keyCode);
			if (keyCode == 49) {// 1을 읽었을 경우
				speed=speed+10;
				System.out.println("현재속도 =" + speed);
			} else if (keyCode == 50) { // 2를 읽었을 경우
				speed=speed-10;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 51) {// 3을 읽었을 경우
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
}