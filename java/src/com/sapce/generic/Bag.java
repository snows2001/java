package com.sapce.generic;

public class Bag {
	
	public <T extends Item> void put(T t) {
		System.out.println(t + " 가방에 넣다!");
	}

}


