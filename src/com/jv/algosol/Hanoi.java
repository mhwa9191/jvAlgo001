package com.jv.algosol;

import java.util.Arrays;

public class Hanoi {

	private static int index=0;
	public static void main(String[] args) {
		int num1 = 2;
		
		System.out.println("sol num1 "+Arrays.deepToString(solution(num1))); //[ [1,2], [1,3], [2,3] ]

	}
	
	public static int[][] solution(int n) {
		int len=(int)Math.pow(2, n)-1;
        int[][] answer = new int[len][2];

        hanoi(n,1,2,3,answer);
        
        return answer;
    }
	public static void hanoi(int n, int start, int mid, int end, int[][]answer) {
		if(n==1) {
			answer[index++] = new int[] {start,end};
		}
		else {
			hanoi(n-1,start,end,mid,answer);// start ���� mid �� n-1 ���� �ű�
			answer[index++] = new int[] {start,end};
			hanoi(n-1,mid,start,end,answer);//mid ���� end �� n-1 ���� �ű�
		}
	}
}
