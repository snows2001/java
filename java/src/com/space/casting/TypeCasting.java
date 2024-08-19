package com.space.casting;

public class TypeCasting {

	public static void main(String[] args) {
		//자동 형변환
		Dog dog = new Dog();
		//....		
		Animal animal = dog;
				
		
		//강제 형변환
		Animal animal2 = new Animal();
		
		//안전하게 형변환하기
		if(animal2 instanceof Cat) {
			Cat cat = (Cat)animal2;
		}
		
				
	}
}
