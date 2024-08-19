package com.space.lambda.ex03;

import java.util.function.Consumer;

public class Test {
	public static void main(String[] args) {		
		
		Consumer<Integer> consumer = num -> System.out.println(num);
		
		UseCase.mA(consumer);
		UseCase.mA(num -> System.out.println(num));	
		
		

	}
}