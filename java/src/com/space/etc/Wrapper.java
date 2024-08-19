package com.space.etc;

public class Wrapper {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(3);
		System.out.println(i.floatValue());
		
		int a = i.intValue();
		
		//문자열을 숫자로 변경
		int b = Integer.parseInt("12");
		
		Integer i02 = 3; //오토 박싱
		
		int i03 = i02; //오토 언박싱
		
	}
}
