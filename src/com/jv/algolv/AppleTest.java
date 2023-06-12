package com.jv.algolv;

import java.util.Arrays;

public class AppleTest {
	public static void main(String[] args) {
		int k1=3; //최대점수
		int m1=4; //한 상자 개수
		int[] score1= {1, 2, 3, 1, 2, 3, 1};
		System.out.println("sol "+sol(k1,m1,score1));
		//8
		
		
		int k2=4;
		int m2=3;
		int[] score2= {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
		System.out.println("sol "+sol(k2,m2,score2));
		//33
		
	}

	private static int sol(int k, int m, int[] score) {
		Arrays.sort(score);
		System.out.println(Arrays.toString(score));
		
		int output=0;
		for(int i=score.length-m; i>=0; i-=m) {
			System.out.println(score[i]);
			output+=score[i]*m;
		}
		return output;
	}

}
