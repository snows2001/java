package com.space.b;

import com.space.a.A;

public class X extends A{
	
	X(){
		super(5);
	}

	public void test() {
		X x = new X();
		
		x.b();
		System.out.println(x.b);
		
	}	
}
