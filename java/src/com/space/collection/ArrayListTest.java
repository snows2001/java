package com.space.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(1);		
		intList.add(2);
			
		Collections.sort(intList, Collections.reverseOrder());		
				
		for (Integer integer : intList) {
			System.out.println(integer);
		}
				
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("JAVA", 500));		
		books.add(new Book("java", 1000));		
		books.add(new Book("JavaScript", 10000));		
		books.add(new Book("Html", 5000));		
		books.add(new Book("CSS", 3000));		
		books.add(new Book("javascript", 2500));
				
		for (Book book : books) {
			System.out.println(book);
		}
		
		//java 단어가 들어간 책만 출력하기
		//5000 이상인 책만 출력하기
		
		
	}
}











