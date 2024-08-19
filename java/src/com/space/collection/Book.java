package com.space.collection;

public class Book implements Comparable<Book> {
	
	private String name;
	private int price;
	
	public Book() {}
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	//어떤책객체.compareTo(또다른북개체);
	
	@Override
	public int compareTo(Book book) {
		
		int nameCmp = this.getName().compareTo(book.getName());// -, 0, +
		return (nameCmp != 0 ? nameCmp : Integer.compare(book.getPrice(), this.getPrice()));
				
		//return this.getName().compareTo(book.getName());
		//return Integer.compare(this.getPrice(), book.getPrice());
	}	
	
	
	
}










