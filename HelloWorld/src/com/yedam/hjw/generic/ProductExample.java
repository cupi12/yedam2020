package com.yedam.hjw.generic;

class Television {
	
}

public class ProductExample {
	public static void main(String[] args) {
		Product<Television, String> p1 = new Product<>();
		
		p1.setKind(new Television());
		Television t1 = new Television();
		p1.setModel("smartTV");
		Television tel1 = p1.getKind();
		String str1 = p1.getModel();
	}
}
