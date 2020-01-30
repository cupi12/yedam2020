package classes;

public class People {
//필드와 메서드를 정의, 
	String name;
	int age;
	String job;
	int height;

	People() {

	}

	People(String name, int age, int height, String job) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.job = job;
	}

	void pname() {

		System.out.println("이름은 " + name + "입니다.");
	}

	void page() {
		System.out.println("나이는 " + age + "입니다.");
	}

	void pjob() {
		System.out.println("직업은 " + job + "입니다.");
	}

	void pheight() {
		System.out.println("키는 " + height + "입니다.");
	}
}