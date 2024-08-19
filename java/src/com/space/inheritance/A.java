package com.space.inheritance;

class A {
	Animal animal;
	
	void mA(Animal animal) {
		animal.play();
	}

	Animal mB() {
		return new Dog();
	}
	
	
}
