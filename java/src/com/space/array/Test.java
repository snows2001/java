package com.space.array;

public class Test {

	public static void main(String[] args) {
		//EducationManagement.xxx(5);
		
		double[] scores = {10.2, 15.2};
		
		double avg = EducationManagement.getAvg(scores);
		System.out.println(avg);
		System.out.println(avg + 10);
		
		System.out.println(EducationManagement.getAvg(scores));
		
	}  

}
