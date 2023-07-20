package com.jv.algosol;

import java.util.Arrays;

public class Hanoi2 {
// 전역변수 안쓰는 방법
//	private static int index=0;
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int num3 = 4;
		
		System.out.println("sol num1 "+Arrays.deepToString(solution(num1))); //[ [1,2], [1,3], [2,3] ]
		System.out.println();
		System.out.println("sol num2 "+Arrays.deepToString(solution(num2))); //[[1, 3], [1, 2], [3, 2], [1, 3], [2, 1], [2, 3], [1, 3]]

		System.out.println();
		System.out.println("sol num3 "+Arrays.deepToString(solution(num3)));
	}
	
	public static int[][] solution(int n) {
		int len=(int)Math.pow(2, n)-1;
        int[][] answer = new int[len][2];
        
        hanoi(n,1,2,3,answer,0);
        
        return answer;
    }
	public static int hanoi(int n, int start, int mid, int end, int[][]answer, int index) {
		
		if(n==1) {
			answer[index++] = new int[] {start,end};
			System.out.println("n=1 index "+index+"  start,end "+start+","+end);
			return 1;
		}
		else {
			int a=hanoi(n-1,start,end,mid,answer,index);// start 에서 mid 로 n-1 원판 옮김
			index=index+a;
			answer[index++] = new int[] {start,end};
			System.out.println("   index "+index+"  start,end "+start+","+end+"\t::n "+n);
			hanoi(n-1,mid,start,end,answer,index);//mid 에서 end 로 n-1 원판 옮김
			
			return (int)Math.pow(2, n)-1;
		}
	}
}
