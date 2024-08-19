package com.space.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
		
		que.offer("A");
		que.offer("B");
		que.offer("C");
		
		while(que.peek()!=null)
			System.out.println(que.poll());
		
	}
}
