package com.yedam.hjw.generic;

public class Box<T> { // <T> 타입 파라미터
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}
}
