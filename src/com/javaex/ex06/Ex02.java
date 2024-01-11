package com.javaex.ex06;

public class Ex02 {
	
	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		/*
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		System.out.println(a + b);
		*/
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();					// trim()은 양쪽 끝의 공백을 없애준다.
		System.out.println(a);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		System.out.println("=======================");
		
		String[] sArray = a.split(",");
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("=======================");
		
		String str = "Hello JAVA!";
		System.out.println(str.substring(3));
		System.out.println(str.substring(1, 7));
		
		
		
		
		
		
		
		
	}
}
