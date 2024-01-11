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
		
		String result01 = str.substring(3);
		String result02 = str.substring(1, 7);
		System.out.println(result01);
		System.out.println(result02);
		
		char result03 = str.charAt(8);
		System.out.println(result03);
		
		System.out.println(str.toString());
		
		System.out.println("=======================");
		
		String s01 = new String("안녕");
		String s02 = new String("안녕");
		
		if(s01 == s02) {
			System.out.println("주소만 같음 - 값(내용물)은 다름");
		}else {
			System.out.println("주소가 다름");
		}
		
		if(s01.equals(s02)) {
			System.out.println("글자가 같음");
		}else {
			System.out.println("글자가 다름");
		}
		
		System.out.println("=======================");
		String s03 = null;
		
		if("안녕".equals(s03)) {
			System.out.println("값(내용물) 같음");
		}else {
			System.out.println("값(내용물) 다름");
		}
		
		
		
		
		
	}
}
