
public class Exercise04 {

	public static void main(String[] args) {
//		int i, j;
//		//random함수를 while 안에 넣은 이유는 i, j값을 계속 변환시켜주기 위함이다.
//		while (true) {
//			i = (int) (Math.random() * 6) + 1;
//			j = (int) (Math.random() * 6) + 1;
//			System.out.println(" ( " + i + " )( " + j + " )");
//			if (i + j == 5)
//				break;
//		}
for(int i=1; i<=5; i++) {
	for(int j=1; j<=i; j++)
		System.out.print("*");
System.out.println();
}
		
	
	}

}
