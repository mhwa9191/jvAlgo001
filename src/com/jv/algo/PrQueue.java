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

		//�켱���� ���ڴ� ���� ���� ��
		System.out.println(priQueue.peek()); 
		// 1
		
		System.out.println("============="); 

		int[] list= {10,20,40};
		testPrQ(list);
	}

	private static void testPrQ(int[] list) {
		int output=0;
		PriorityQueue<Integer> testQ = new PriorityQueue<Integer>();
		
		//�켱���� ť�� �ٲ�
		for (Integer in : list) {
			testQ.add(in);
		}
		
		//ī���� ������ 1�� �ƴҶ� ���� �ݺ�
		while (testQ.size() != 1) {
			int first = testQ.poll(); //�켱������ �̱�
			int second = testQ.poll();
			int sum= first+second;
			output+=sum;
			testQ.add(sum);
//			System.out.println(testQ);
		}
		System.out.println(output);
	}
	
	
}
