
public class ForArrayExample {

	public static void main(String[] args) {
		// 문제 1. 1~100까지 담는 배열[100]
		// 문제 2. 각각의 값을 sum하는 for문, 홀수번째 배열들만
		int[] intAry = new int[100];
		for (int i = 0; i < 100; i++) {
			intAry[i] = i + 1;
			System.out.println(intAry[i]);
		}
		System.out.println("===================");
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				sum = sum + intAry[i];				
			}
			if (intAry[i] % 2 == 1){
				sum2 = sum2 + intAry[i];
			}
		}
		System.out.println("홀수번째  Array 값은 : " + sum);
		System.out.println("홀수값을 더한 Arry 값은 : " + sum2);
	}

}
