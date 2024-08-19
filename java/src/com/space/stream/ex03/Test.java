package com.space.stream.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
				
		List<Book> books = new ArrayList<Book>();
		
		books.add(new Book("Java","태양"));
		books.add(new Book("Html","달빛"));
		books.add(new Book("CSS", "태양"));
		
		Map<String, List<Book>> result
			= books.stream()
				.collect(
				Collectors.groupingBy(book -> book.getPublisher())						
			);
		
		result.forEach((publisher, listByPublisher)->{
			System.out.println(publisher);
			listByPublisher.forEach(book -> System.out.println(book));
		});
		
		Map<String, Long> result2
			= books.stream()
			  .collect(
					Collectors.groupingBy(book -> book.getPublisher(), Collectors.counting())			
			 );
		
		
		result2.forEach((publisher, count)->{
			System.out.println(publisher + " : " + count + "권");
		});
		
		int[] i = {5,3,3,4,5};
		Arrays.stream(i).sorted().forEach(x->System.out.println(x));
	}

}
