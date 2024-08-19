package com.space.etc;

import java.util.Objects;

public class ObjectEx {

	//Object 최상위 클래스
	public static void main(String[] args) {
		
		Point point1 = new Point(1,2);
		Point point2 = new Point(3,4);
	
		System.out.println(point1.hashCode());
		System.out.println(point1.toString());
		System.out.println(point1.getClass());
		
		System.out.println(point2.hashCode());
		
		//== , equals() 차이?
		
		System.out.println("(3 == 3) :" + (3 == 3));//true
		System.out.println("(3 == 5) :" + (3 == 5));//false
		
		System.out.println(((Integer)3).equals(3)); //true
		System.out.println(((Integer)3).equals(5));	//false
		
		String str01 = new String("ABC");
		String str02 = new String("ABC");
		
		System.out.println("String :" + (str01==str01)); //true?
		System.out.println("String :" + (str01==str02)); //false?
		
		System.out.println("equals  :"+ str01.equals(str01)); //true?
		System.out.println("equals  :"+ str01.equals(str02)); //true?
		
		
		System.out.println(point1 == point1); //true
		System.out.println(point1 == point2); //false
		
		System.out.println(point1.equals(point1)); //true
		System.out.println(point1.equals(point2)); //false
		
		System.out.println(point1); 
		System.out.println(str01.toString()); 
		
		System.out.println(Objects.hash("A", "B", 3));
		System.out.println(Objects.hash("A", "B", 3));	
		System.out.println(Objects.hash("A", "B", 5));		
				
	}
}
