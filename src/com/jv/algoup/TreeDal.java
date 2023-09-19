package com.jv.algoup;

import java.util.Arrays;

public class TreeDal {
	public static void main(String[] args) {
		int n4 = 4;
		int n5 = 5;
		
		int n = n5;
		int[] answer = new int[(n*(n+1))/2];
		int[][] matrix = new int[n][n];
		
		int x = -1, y=0;
		int num = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(i%3==0) {
					x++;
				}else if(i%3==1) {
					y++;
					System.out.println(x+"x  y "+y);
				}else if(i%3==2) {
					x--;
					y--;
				}
				matrix[x][y] = num++;
				for(int mm=0; mm<matrix.length;mm++) {
					System.out.println(Arrays.toString(matrix[mm]));					
				}
				System.out.println("++");					
			}
		}
		int k = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matrix[i][j] == 0) {
					break;
				}
				answer[k++] = matrix[i][j];
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
		
//		int[] answer= {};
//		int len=0;
//		for(int i=1; i<=n4; i++) {
//			len+=i;
//		}
//		System.out.println(len);
//		answer= new int[len];
//		System.out.println(Arrays.toString(answer));
//		
//		int num=1;
//		int k=0;
//		for(int i=0; i<len; i+=k) {
//			answer[i]=num;
//			k++;
//			num++;
//			System.out.println(k);
//			if(k==n4) {
//				for(int j=i+1; j<len; j++) {
//					answer[j]=num;
//					num++;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(answer));
		
	}
}
