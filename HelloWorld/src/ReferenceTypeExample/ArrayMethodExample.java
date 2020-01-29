package ReferenceTypeExample;

public class ArrayMethodExample {
	public static void main(String[] args) {
		int[] intAry = { 3, 7, 5, 8, 4 };
		System.out.println("배열의 길이는 : " + intAry.length);
		int sum = 0;
		sum = sumArrayMethod(intAry);
		System.out.println(sum);
		int[] intAry2 = { 13, 17, 15, 18, 14 };
		sum = sumArrayMethod(intAry2);
		System.out.println(sum);
		int[] intAry3 = { 23, 57, 35, 18, 14 };
		sum = sumArrayMethod(intAry3);
		System.out.println(sum);
		int j = 0;
		int sum2 = 0;
		for (int i = 1; i <= 4; i++) {
			sum += intAry[i];
		}
		System.out.println("(for) intAry 배열의 합계는 : " + sum);
//		{
//			while (j <= 4) {
//				sum2 += intAry[j];
//				j++;
//
//			}
//			System.out.println("(while) intAry 배열의 합계는 : " + sum);
//		}

	}

	// 배열의 요소의 합을 계산하는 method.
public static int sumArrayMethod(int[] a) {
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum +=a[i];}
	return sum;
//public static int sumArrayMethod(int[] a) {
//	int sum = 0;
//	for (int i= 0; i< a.length; i++) {
//		sum +=a;
//		return sum;
//		public static int sumArrayMethod(int[] a) {
//		int	sum = 0;
//			sum +=a
//					return sum;;
//	public static int sumArrayMethod(int[] a) {
//		sum = 0;
//		for (int i = 0; i < a.length; i++)
//			sum += a;
//		return sum;

	}
}}}}
