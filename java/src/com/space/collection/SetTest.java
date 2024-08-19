package com.space.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	
	public static void main(String[] args) {
		Set<String> strSet = new HashSet<String>();
		//순서가 없고, 중복된 데이터 안들어 갑니다.
		strSet.add("A");
		strSet.add("A");
		strSet.add("B");
		strSet.add("1");
		
		for (String string : strSet) {
			System.out.println(string);
		}
		
		Set<Building> buildings = new HashSet<Building>();
		buildings.add(new Building("A", "서울특별시"));
		buildings.add(new Building("A", "서울특별시"));
		
		for (Building building : buildings) {
			System.out.println(building);
		}
		
	}

}
