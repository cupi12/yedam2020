package classes;

public class MethodExample {
	public static void main(String[] args) {
		
	Method m = new Method(); // m ->leftField, rightField
	m.setLeftFiled(30);// leftField의 값을 30으로 세팅
	m.setRightField(4); // RightField의 값을 4으로 세팅
	int result = m.thisSum() // (30 + 4) +
			+ m.thisMinus(); // (30 - 4)
	
	int result2 = m.sum(20, 10) * m.minus(30, 25);
	m.setLeftFiled(100);
	m.setRightField(50);
	result = m.thisSum() // (30 + 4) +
			+ m.thisMinus(); // (30 - 4)
	System.out.println("필드의 합 : " + result);
	System.out.println("두매개값의 합 : " + result2);
}

}