package ReferenceTypeExample;

public class ForWhileExample {
	public static void main(String[] args) {

		int[] intAry = new int[10];
		{
			for (int i = 0; i < 10; i++) {
				intAry[i] = i + 1;
				System.out.print(intAry[i] + " | ");
			}
		}
		System.out.println();
		System.out.println("==================");
		int[][] intAry2 = new int[5][5];
		int count = 1;

		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				intAry2[i][j] = count++;
			}
		}
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {

				System.out.printf("%3d", intAry2[j][i]);

			}
			System.out.println();

		}
	}

}
