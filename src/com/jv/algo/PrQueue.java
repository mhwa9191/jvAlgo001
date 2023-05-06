package com.jv.algo;

import java.util.PriorityQueue;

public class PrQueue {

	public static void main(String[] args) {
		
		//priority queue
		PriorityQueue<Integer> priQueue = new PriorityQueue<Integer>();
		
		priQueue.add(3);
		priQueue.add(1);
		priQueue.add(3);
		priQueue.add(2);
		//[1, 2, 3, 3]
		
		priQueue.remove(2);
		//[1, 3, 3]

		priQueue.remove(3);
		//[1, 3]

		priQueue.add(2);
		System.out.println(priQueue); 
		//[1, 3, 2]

		//우선순위 숫자는 가장 낮은 값
		System.out.println(priQueue.peek()); 
		// 1
		
		System.out.println("============="); 
	}
}
