package com.space.lambda.ex02;

public class Test {

	public static void main(String[] args) {
		
		A a = () -> 
			System.out.println("A");
	
		
		B b = str -> 
			System.out.println(str);
	
		
		C c = () -> "C";
		
		
		D d = (x, y) -> x + y;
			
	}
}
