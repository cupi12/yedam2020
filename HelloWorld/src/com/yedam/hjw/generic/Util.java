package com.yedam.hjw.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.set(t);
		return box;
		
			
		}

}
