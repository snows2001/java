package com.space.interfaceex;

interface A {	
	double PI = 3.14;	
	void methodA();	
	
	static void methodB() {
		System.out.println("난 인터페이스의 정적 메소드 입니다.");
	}	
	default void methodC() {
		System.out.println("난 인터페이스의 디폴드 메소드 입니다");
	}	
}
