package com.space.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
