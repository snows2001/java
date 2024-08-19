package com.space.basic;

public class Math {
	
	int sum(int toNum) { //10 -> 55

		int result = 0;		
		int i = 1;
		
		do {
			result = result + i;
			i++;
		} while(i <= toNum);	
		
		return result;	
		

	}
}
