package com.space.lambda.ex04;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

public class Test {
	
	public static void main(String[] args) {
		IntConsumer intConsumer
			//= x -> System.out.println(x);
			//= x -> A.mA(x);
			= A::mA;
/*		
		A a = new A();
		LongConsumer longConsumer
			//= y -> System.out.println(y);
			//= y -> a.mB(y);
			= a::mB;
*/		
		ObjDoubleConsumer<A> objDoubleConsumer
			//= (obj, d) -> System.out.println(d);
			//= (obj, d) -> obj.mC(d);
			= A::mC;
		
		Supplier<A> supplier
			//= () -> new A();
			= A::new;
		
		supplier.get();
		
		IntFunction<A> intFunction
			//= x -> new A(x);
			= A::new;
		intFunction.apply(0);
	}		
}
