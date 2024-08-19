package com.space.stream.ex02;

import java.util.Objects;

public class Book implements Comparable<Book>{
	
	private String title;
	private int price;	
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}


	@Override
	public int compareTo(Book book) {		
		return this.title.compareTo(book.title);
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	
}
