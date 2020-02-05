package com.yedam.hjw.api.string연습;

public class ByteToStringExample {
public static void main(String[] args) {
	byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
	
	String str1 = new String(bytes);
	System.out.println(str1);
	
	String str2 = new String(bytes, 6 , 4);
	System.out.println(str2);
	

	String subject = "자바 프로그래밍";
	char charValue = subject.charAt(4);
	System.out.println(charValue);
	
}
}
