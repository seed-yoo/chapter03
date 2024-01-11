package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int a = 3;		// 문제 없음
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum.toString());
		
		Integer v01 = 3;	// 자동 박싱
		System.out.println(v01.toString());
		
		int v02 = i;
		System.out.println(v02);	// 자동 언박싱
		
		/*
		Integer r01 = 100;
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);
		*/
		
		// 문자열 --> 정수
		int result = Integer.parseInt("12345");
		System.out.println(result + 3);			// 결과값 : 12345(int) + 3(int) => 12348
		
		/*
		String str = "안녕하세요";
		String result02 = str.valueOf(555);
		System.out.println(result02 + 2);
		*/
		
		// 정수 --> 문자열
		String result02 = String.valueOf(1000);
		System.out.println(result02 + 2);		// 결과값 : 1000(String) + 2(int) => 10002
		
		String result03 = "" + 999;
		System.out.println(result03);
		
//		System.out.println("999" + 2);
		
		
		
		
		
		
		
		
	}
}
