package com.yedam.hjw.generic.before;

public class Box {
	private Object obj; // Object는 모든 클레스의 최상위클레스이다. 어떠한 클레스의 값을 받을 수 있다.

	public void set(Object obj) {

		this.obj = obj;
	}
		public Object get() {
			return obj;
		}
}
