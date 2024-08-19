package com.space.lambda.ex03;

import java.util.Random;
import java.util.function.Supplier;

public class ExSupplier {

	public static void main(String[] args) {
		Supplier<Integer> intSupplier
			= () -> new Random().nextInt(10);//0~9까지 리턴값이 리턴되요
			
		System.out.println(intSupplier.get());
		
		Supplier<Double> doubleSupplier
			= () -> Math.random();//0.0~1.0 미만의 실수
			
		System.out.println(doubleSupplier.get());	
	}	
}
