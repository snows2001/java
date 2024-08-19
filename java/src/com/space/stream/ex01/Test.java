package com.space.stream.ex01;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Java",5500,false));
		books.add(new Book("Html",2500,true));
		books.add(new Book("Css",1555,true));
		
		for (Book book : books) {
			if(book.isEbook()) {
				//System.out.println(book);
			}
		}
		//전자책만 출력하기
		books.stream()
			.filter(book -> book.isEbook()) //책2권
			.forEach(book -> System.out.println(book));
		
		//전자책의 가격만 출력하기
		books.stream()
			.filter(book -> book.isEbook()) //책2권
			.filter(book -> book.getPrice() >= 2000) //2000원 이상인 책1권
			.mapToInt(book -> book.getPrice()) //2500
			.forEach(price -> System.out.println(price));
		
		//전자책 가격의 평균
		double avgEbook =
			books.stream()
				.filter(book -> book.isEbook()) //책2권
				.mapToInt(book -> book.getPrice()) //2500, 1555
				.average()
				.getAsDouble();
		
		System.out.println(avgEbook);

		
	}
}
