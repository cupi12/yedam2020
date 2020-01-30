package classes;

public class Method {

//		int num1 = 10, num2 = 15;
//		int result = sum(num1, num2) * minus(num1, num2);
//		System.out.println(result);
	
//필드 공식 지정
	int leftField;
	int rightField;

	public int getLeftFiled() {
		return leftField;
	}

	public void setLeftFiled(int leftFiled) {
		this.leftField = leftFiled;
	}

	public int getRightField() {
		return rightField;
	}

	public void setRightField(int rightField) {
		this.rightField = rightField;
	}

	public int thisSum() {
		return leftField + rightField;
	}
	public int thisMinus() {
		return leftField - rightField;
	}
	//필드 공식 끝
//매개변수 공식 지정
	public int sum(int a, int b) {
		int result = 0;
		result= a+b;
		return result;
	}

	public int minus(int a, int b) {
		return a - b;
	}
	//배개변수 공식 끝
}
