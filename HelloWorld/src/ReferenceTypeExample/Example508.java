package ReferenceTypeExample;

public class Example508 {

	public static void main(String[] args) {
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		double avg = 0.0;
		int count1 = 0;// aryavg(array);
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];

			}
			count1 += innerAryCnt(array[i]);

		}
		avg = (double) sum / count1;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}

	public static int innerAryCnt(int[] ary) {
		return ary.length;
	}

	public static int aryavg(int[][] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			count = count + array[i].length;
		}
		return count;

	}

}
