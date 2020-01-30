package classes;

public class peopleExample {
	public static void main(String[] args) {
		
		
		People peo2 = new People("bill", 22, 178, "개발자");
		System.out.println(peo2.name);
		System.out.println(peo2.age);
		System.out.println(peo2.height);
		System.out.println(peo2.job);
		System.out.println("===============");
		
		
		People peo = new People();
		peo.name = "김금자";
		peo.age = 20;
		peo.height = 168;
		peo.job = "백수";
		System.out.println(peo.name);
		System.out.println(peo.age);
		System.out.println(peo.height);
		System.out.println(peo.job);
		peo.pname();
		peo.page();
		peo.pheight();
		peo.pjob();
		System.out.println("==========================");
		People peo1 = new People();
		peo1.name = "sam";
		peo1.age = 33;
		peo1.height = 184;
		peo1.job = "개발자";
		System.out.println(peo1.name);
		System.out.println(peo1.age);
		System.out.println(peo1.height);
		System.out.println(peo1.job);
		peo1.pname();
		peo1.page();
		peo1.pheight();
		peo1.pjob();

	}

}