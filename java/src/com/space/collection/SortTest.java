package com.space.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(1);		
		intList.add(2);
		
		Collections.sort(intList);	//오름 차순
		//출력 1,2,3
		Collections.sort(intList, Collections.reverseOrder()); //내림차순
		//출력 3,2,1
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("B", 1000));		
		books.add(new Book("C", 10));
		books.add(new Book("B", 100));
		
		Collections.sort(books);
		
		for (Book book : books) {
			System.out.println(book);
		}
		
		int x = 3;
		int y = 5;
		System.out.println((x > y) ? 1 : 0);
		
		
		
	}
}










