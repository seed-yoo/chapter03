package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		// 클래스 정보보기
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("=================================");
		
		// toString()
		System.out.println(p00.toString());
		System.out.println(p01);
		System.out.println(p02.toString());
		
	}
}
