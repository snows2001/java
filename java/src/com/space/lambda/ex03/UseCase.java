package com.space.lambda.ex03;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UseCase {
	
	static <T> void mA(Consumer<T> consumer) {}		
	static <T> void mB(Supplier<T> supplier) {}
	static <T, R> void mC(Function<T, R> function) {}	
	static <T> void m​D(UnaryOperator<T> operator) {}
	static <T> void mF(Predicate<T> predicate) {}
	

}
