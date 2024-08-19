package com.space.array;

public class EducationManagement {
	//1.배열
	//2.두번째 for문
	//3.참조형 매개변수
	
	//배열을 매개변수로 받아서 평균을 리턴하는 메소드 

	static double getAvg(double[] scores) {//{10.2, 15.2}
			
		double sum = 0 ;
		
		for (double score : scores) {
			sum = sum + score; //10.2 + 15.2
		}
		
		return sum/scores.length;
	}
	
	//매개변수로 받은 배열의 모든 값에 10 곱한 배열을 리턴하세요.
	static double[] getArray(double[] scores) {
		double[] resultArray = new double[scores.length];
		
		for (int i = 0; i < scores.length; i++) {
			resultArray[i] = scores[i] * 10;
		}
		
		return resultArray;

	}

	
	//Test.java를 생성하고 main() getAvg() 메소드를 호출하세요.
}
