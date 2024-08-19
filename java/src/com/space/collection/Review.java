package com.space.collection;

import java.time.LocalDate;
import java.util.Comparator;

public class Review implements Comparable<Review>{
	
	private int helpCount; //도움이 돼요 수
	private LocalDate date; //작성일자
	
	public Review(int helpCount, LocalDate date) {
		this.helpCount = helpCount;
		this.date = date;
	}
	
	public int getHelpCount() {
		return helpCount;
	}
	public void setHelpCount(int helpCount) {
		this.helpCount = helpCount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Review [helpCount=" + helpCount + ", date=" + date + "]";
	}

	//기본 정렬
	@Override
	public int compareTo(Review review) {
		return Integer.compare(review.getHelpCount(), this.getHelpCount());		
	}
	
	public static final Comparator<Review> DATE_DESC_ORDER = new Comparator<Review>(){	
		
			@Override
			public int compare(Review review1, Review review2) {
				
				return review2.getDate().compareTo(review1.getDate());
			}
			
	};
	
	public static final Comparator<Review> DATE_DESC_ORDER_L
		=(review1, review2)-> review2.getDate().compareTo(review1.getDate());
	
	public static final Comparator<Review> DATE_ASC_ORDER_L
		=(review1, review2)-> review1.getDate().compareTo(review2.getDate());
}













