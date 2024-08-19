package com.space.a;

public class B {
	public void test() {
		A a1 = new A();
		A a2 = new A(5);
		A a3 = new A(5.0);
		//A a4 = new A("");
		
		a1.a();
		//a1.d();
		
		A.sa();
		//A.sd();
		
		System.out.println(a1.a);
		//System.out.println(a1.d);
				
		System.out.println(A.sa);
		//System.out.println(A.sd);
	}

}
