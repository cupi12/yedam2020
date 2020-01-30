package classes;

public class StudentExample {
	public static void main(String[] args) {
		//생성자를 통해 각각의 필드에 값을 담는 경우
		Student sn = new Student("choi",20,180,70);
		System.out.println(sn.name);
		System.out.println(sn.age);
		System.out.println(sn.height);
		System.out.println(sn.weight);
		// Student클레스의 stdnt 변수를 만들고, Student()라는 인스턴스를 만들어서 stdnt에 담는다.
		Student stnt = new Student(); // Student 클레스의 인스턴스를 하나 만들었다. new라는 키워드가 인스턴스를 만드는 키워드
		//필드구문
		stnt.name = "hong";
		stnt.age = 20;
		stnt.height = 170;
		stnt.weight = 65;
		//필드구문 종료
		System.out.println(stnt.name);
		System.out.println(stnt.age);
		System.out.println(stnt.height);
		System.out.println(stnt.weight);
		stnt.study();
		stnt.eat();
		stnt.getAge();
		System.out.println(stnt.getAge());
		
		Student snt = new Student();
		snt.name = "choi";
		snt.age = 27;
		snt.height = 179;
		snt.weight = 68;
		System.out.println(snt.name);
		System.out.println(snt.age);
		System.out.println(snt.height);
		System.out.println(snt.weight);
		System.out.println(snt.getAge());
	}
}
