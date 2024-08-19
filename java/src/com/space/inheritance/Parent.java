package com.space.inheritance;

class Parent {
	
	int amount = 1000;
	
	int work(int time) {
		return time * 50; 
	}

	void save(int money) {
		amount = amount + money;
	}
	
	static void meetFriend(String name) {
		System.out.println("놀다");
	}
		
}
