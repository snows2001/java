package com.space.lambda.ex04;

//메소드 참조
public class A {
	
	//정적메소드
	static void mA(int i) {
		System.out.println(i);
	}
			
	//일반메소드
	void mB(long l) {
		System.out.println(l);
	}
	
	//일반메소드
	void mC(double d) {
		System.out.println(d);
	}
	
	A(){
		System.out.println("A()");
	}
	
	A(int i){
		System.out.println("A(int i)");
	}
	
}
