package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		
		System.out.println(obj.getClass());	// 클래스정보
		System.out.println(obj.toString());	// java.lang.Object@58ceff1
		System.out.println(obj.hashCode());	// 주소
		System.out.println(obj.equals(obj));// 두개의 객체가 같은가?
		
		System.out.println("===================================================");
		
		// 클래스정보
		System.out.println(obj.getClass());	// 클래스정보
		
		// obj.toString()
		System.out.println(obj.toString());	// 클래스정보
		System.out.println(obj);	// 클래스정보
		
		// hashCode()
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println(obj01.hashCode());	// 주소
		System.out.println(obj02.hashCode());	// 주소
		System.out.println(obj03.hashCode());	// 주소
		
		// equals()
		System.out.println(obj01.equals(obj01));// 두개의 객차가 같은가?
		System.out.println(obj01.equals(obj02));// 두개의 객차가 같은가?
		
		System.out.println(obj01==obj01);
		System.out.println(obj01==obj03);
		
		
		
		
		
	}
}
