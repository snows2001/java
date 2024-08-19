package com.space.etc;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//ArrayList 만들어야 해요~
		
		System.out.println("=================================");
		System.out.println(" 1.입력하기 2.목록보기 3.검색하기 4.종료 ");				
		System.out.println("=================================");
	
		String menu = scanner.nextLine();
		int menuNo = Integer.parseInt(menu);
		
		if(menuNo==1) {
			System.out.println(menuNo + "를 선택하였습니다.");
			System.out.println("책이름 입력 : ");		
			String name = scanner.nextLine();
			
			System.out.println("책가격 입력 : ");	
			String strPrice = scanner.nextLine();
			int price = Integer.parseInt(strPrice);
			
		    //북객체
			
			//리스트 저장
			
		} else if(menuNo==2) {
			System.out.println("==========================");
			System.out.println("1.책이름순 2.책가격순");				
			System.out.println("==========================");
			//정렬되게 해주세요~
		}
		
		
		
		scanner.close();
		
	}
}
