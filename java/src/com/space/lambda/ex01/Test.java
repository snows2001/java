package com.space.lambda.ex01;

public class Test {

	public static void main(String[] args) {
		A a1 = new AA();
		
		A a2 = new A() {
			
			@Override
			public void mA() {
				System.out.println("내부 익명 클래스");		
			}
			
		};
		
		A a3 = () -> {
			System.out.println("람다식");	
		};
		
		a1.mA();
		a2.mA();
		a3.mA();
		
		
	}
}
