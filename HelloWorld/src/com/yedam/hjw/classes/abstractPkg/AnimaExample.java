package com.yedam.hjw.classes.abstractPkg;

public class AnimaExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상클래스는 직접 인스턴스를 생성하지 못한다.
		Cat cat = new Cat();
		cat.sound();
		cat.breathe(); // 부모클래스가 가진 breathe 사용 가능

		Dog dog = new Dog();
		dog.sound();
		dog.breathe();

		Animal animal = null;
		animal = cat;
		animal.sound();

		animal = dog;
		animal.sound();

		System.out.println("====================================");
		animalSound(cat);
		animalSound(dog);
	}

	static void animalSound(Animal animal) {
		animal.sound();
	}
}