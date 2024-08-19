package com.space.basic;

public class EducationManagement {

	String getMessage(char grade) {
		
		String message = "";
		
		switch (grade) {
		case 'A':
			message = "매우 우수합니다.";
			System.out.println("매우 우수합니다.");
			//break;

		case 'B':
			message = "우수합니다.";
			System.out.println("우수합니다.");
			//break;			
			
		default:
			message = "등급을 확인하세요~";
			System.out.println("등급을 확인하세요~");
			//break;
		}
		
		return message;
	}
}
