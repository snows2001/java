package com.sapce.method;

public class J{
	int a = 0;
	
	public static void main(String[] args) {
		int a = 0;
		
		for (int i = 0; i < 5; i++) {
			if(i==3) {break;} 
			a+=i;//1+2 
		}
		
		System.out.println(a);//3
		
		a = 0; //0
		for (int i = 0; i < 5; i++) {
			if(i==3) {continue;}
			a+=i;//1+2+4
		}
		
		System.out.println(a);//7
		
		J j = new J();
		j.methodA();
		
	}
	
	public void methodA() {
		for (int i = 0; i < 5; i++) {
			
			if(i==3) {
				i=methodB();
			}
			
			a+=i; //1+2+5
		}
		System.out.println(a);//8
	}
	
	public int methodB() {
		return 5;
	}
}
