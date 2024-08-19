package com.space.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReviewTest {

	public static void main(String[] args) {
		List<Review> reviews = new ArrayList<Review>();
		
		reviews.add(new Review(5, LocalDate.of(2024, 10, 9)));
		reviews.add(new Review(1, LocalDate.of(2024, 10, 17)));
		reviews.add(new Review(3, LocalDate.of(2024, 10, 12)));
		reviews.add(new Review(9, LocalDate.of(2024, 10, 21)));
		reviews.add(new Review(3, LocalDate.of(2024, 10, 15)));
		
		//Collections.sort(reviews); //
		/*
		 * for (Review review : reviews) { System.out.println(review); }
		 */
		
		Collections.sort(reviews, Review.DATE_DESC_ORDER);
		for (Review review : reviews) {
			System.out.println(review);
		}
	}
	
}
