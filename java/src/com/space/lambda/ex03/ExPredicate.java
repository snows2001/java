package com.space.lambda.ex03;

import java.util.function.Predicate;

public class ExPredicate {

	public static void main(String[] args) {
		Predicate<String> predicate
			= str ->  str.length() > 5 ;
	
		System.out.println(predicate.test("ABC"));//false
		System.out.println(predicate.test("ABCDEF"));//true
		
		//숫자 1개 짝수이면 true, 홀수면 false
		
		Predicate<Integer> isEven
			= num -> num % 2 == 0;
		
		isEven.test(5);
		isEven.test(6);
	}
}
