package com.space.stream.ex01;

public class Book {

	private String title;
	private int price;
	private boolean isEbook;
	
	public Book(String title, int price, boolean isEbook) {
		super();
		this.title = title;
		this.price = price;
		this.isEbook = isEbook;
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

	public boolean isEbook() {
		return isEbook;
	}

	public void setEbook(boolean isEbook) {
		this.isEbook = isEbook;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", isEbook=" + isEbook + "]";
	}
	
}
