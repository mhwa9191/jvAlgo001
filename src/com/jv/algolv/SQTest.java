package com.jv.algolv;

import java.util.Arrays;
import java.util.Stack;

public class SQTest {
// Ω∫≈√ ≈•
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,0,1,1};
		// [1,3,0,1]
		int[] answer= {};
		
		Stack<Integer> stack= new Stack<Integer>();
		System.out.println(stack);
		
		for(int a:arr) {
			if(stack.isEmpty()) {
				stack.add(a);
			}else if(stack.peek()!=a) {
				stack.add(a);
			}
		}
		System.out.println(stack);
		
		answer=new int[stack.size()];
		for(int i=0;i<stack.size();i++) {
			answer[i]=stack.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
