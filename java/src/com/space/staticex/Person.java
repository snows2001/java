package com.space.staticex;

class Person {
	
	String name;    //이름
	static int population; //총인구수
	
	Person(String name){
		this.name = name;
		population++;
	}
	
	static void mA() {
		System.out.println("호출됨");
	}
	
	static {		
		population = 100;
	}
	
}
