package com.space.lambda.ex03;

import java.util.function.Function;

public class ExFunction {

	public static void main(String[] args) {
		
		Function<String, Integer> toIntFunction
			= str -> Integer.parseInt(str);
			
		System.out.println(toIntFunction.apply("123"));
		
		Function<String, String> toStrFunction
			= str -> str.toLowerCase();
		
		System.out.println(toStrFunction.apply("ABC"));	
				
		Function<Book, String> function
			= book -> book.getName();
			
		System.out.println(function.apply(new Book("자바")));	
				
	}
}
