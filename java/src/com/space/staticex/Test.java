package com.space.staticex;

class Test {  

	public static void main(String[] args) {
		
		Person p1 = new Person("A");
		System.out.println(Person.population);
		
		Person p2 = new Person("B");
		System.out.println(Person.population);
		
		Person p3 = new Person("C");		
		System.out.println(Person.population);
	
		
		Person.mA();
		
		Person.population = 50; 
		System.out.println(Person.population);//
	}
}
