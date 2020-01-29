package ReferenceTypeExample;

public class GetMaxValueExample {
	public static void main(String[] args) {
		int[] intAry = { 8, 7, 10, 5, 9 };
		System.out.println(intAry.length);
		int com = 5;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] < com) {
				com = intAry[i];
			} else {
				com = com;
			}
		}
		System.out.println(com);
	}

	public static int getMaxValue(int[] ary) {
		int max = 0;
		int com = 1;
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] > com)
				com = ary[i];

		}
		return com;
	}
}
