package com.space.collection;

import java.util.HashSet;
import java.util.Set;

public class BuildingTest {

	public static void main(String[] args) {
		
		Set<Building> buildings = new HashSet<Building>();
		buildings.add(new Building("A", "서울특별시"));
		buildings.add(new Building("A", "서울특별시"));
		
		System.out.println("================================");
		
		for (Building building : buildings) {
			System.out.println(building);
		}
		
	}

}
