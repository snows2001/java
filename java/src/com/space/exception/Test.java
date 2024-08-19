package com.space.exception;

public class Test {

	public static void main(String[] args) {

		try {
			
			int i = 3/0;
				
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException 발생");
		} finally {
			System.out.println("정상종료");
		}

		try {
			exception();
			
		} catch(ArrayIndexOutOfBoundsException ex) {
			
		} catch(IndexOutOfBoundsException ex) {
			
		}
		
		
	}
	
	public static void exception() throws ArrayIndexOutOfBoundsException, IndexOutOfBoundsException{
		
		int [] array = new int[5];
		System.out.println(array[5]);

	}
	
}















