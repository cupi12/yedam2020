package com.yedam.hjw.generic;

import java.util.ArrayList;
import java.util.List;

import com.yedam.hjw.generic.before.Apple;
import com.yedam.hjw.interfaces.model.Employees;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("hello"); //
		String str = box.get();

		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		// set = appleBox.get();

		List<String> list = new ArrayList<>();
		list.add("hello");
		list.add("World");
		for (String str : list) {
			System.out.println(str);
		}

		List<Employees> empList = null;
		
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple());

		List ist = new ArrayList();
		ist.add(new Apple());
		ist.add("Hello");
		for (Object obj : ist) {
			System.out.println(obj);
		}
	}
}
