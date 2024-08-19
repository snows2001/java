package com.space.lambda.ex03;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ExOperator {

	public static void main(String[] args) {
		UnaryOperator<Integer> unaryOperator
			= num -> num * num;
			
		System.out.println(unaryOperator.apply(5)); // 25
		
		BinaryOperator<Double> binaryOperator
			= (num1, num2) -> num1 + num2;
		
		System.out.println(binaryOperator.apply(10.2, 5.5)); //15.7
			
		
	}
}
