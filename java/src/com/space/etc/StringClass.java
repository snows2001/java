package com.space.etc;

public class StringClass {
	
	public static void main(String[] args) {
		
		String s01 = new String("dog");
		
		char[] c = {'d','o','g'};
		String s02 = new String(c);
		
		String s03 = "dog";
		String s04 = "dog";
		
		String s05 = new String("dog");
		
		System.out.println(s01==s02);//false
		System.out.println(s03==s04);//true
		System.out.println(s04==s05);//false
		
		System.out.println(s01.length());//문자열 길이
		System.out.println(s01.charAt(1)); //특정 인덱스의 문자를 리턴해요.
		
		String s06 = "friend";
		String s07 = "FRIEND";
		
		System.out.println(s06.equals(s07));//false
		System.out.println(s06.equalsIgnoreCase(s07));//true
		
		String s08 = "123456-0234567";
		System.out.println(s08.substring(7,8));
		System.out.println(s08.substring(7));
		
		String s09 = "    A   A    ";
		System.out.println(s09.trim());
		System.out.println(s09.trim().replace(" ", ""));
				
		String str = "A";
		System.out.println(str.hashCode());
		
		str += "BC";
		//ABC
		System.out.println(str.hashCode());
		
		StringBuffer str2 = new StringBuffer("X");
		System.out.println(str2.hashCode());
		
		str2.append("YZ");
		System.out.println(str2);//XYZ
		System.out.println(str2.hashCode());
	}

}











