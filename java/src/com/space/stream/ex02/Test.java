package com.space.stream.ex02;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Java",5500));
		books.add(new Book("Html",2500));
		books.add(new Book("Java",5500));
		
		
		List<Book> newBooks=
			books.stream()
				.sorted()
				.toList();
		
		books.stream()
			.distinct()
			.forEach(book -> System.out.println(book));

	}

}
