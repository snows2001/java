package com.space.lambda.ex03;

import java.util.function.Consumer;

public class ExConsumer {
	
	public static void main(String[] args) {
		Consumer<Integer> consumer
			= (x) -> {
				System.out.println(x);
			};
			
		consumer.accept(3);	
		
		Consumer<String> strConsumer
			= (x) -> {
				System.out.println(x);
			};
			
		strConsumer.accept("A");
		
		
	}

}
