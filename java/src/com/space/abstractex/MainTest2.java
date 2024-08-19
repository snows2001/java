package com.space.abstractex;

public class MainTest2 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.sleep();
		dog.bear();
		
		Mammal mammal = new Dog();
		//3개
		
		Animal animal = new Dog();
		animal.bear(); //xxxxxxxxxx

	}

}
