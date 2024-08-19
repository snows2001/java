package com.space.abstractex;

public class MainTest {

	public static void main(String[] args) {
		X x = new X();
		x.a = new B();
		
		//x.mX(new A());
		x.mX(new B());
		x.mX(new C());
	}
}
