package com.jv.algoup;

import java.util.Arrays;

public class TreeDal {
	public static void main(String[] args) {
		int n4 = 4;
		int n5 = 5;
		int[] answer= {};
		int len=0;
		for(int i=1; i<=n4; i++) {
			len+=i;
		}
		System.out.println(len);
		answer= new int[len];
		System.out.println(Arrays.toString(answer));
		
		int num=1;
		int k=0;
		for(int i=0; i<len; i+=k) {
			answer[i]=num;
			k++;
			num++;
			System.out.println(k);
			if(k==n4) {
				for(int j=i+1; j<len; j++) {
					answer[j]=num;
					num++;
				}
			}
			
		}
		System.out.println(Arrays.toString(answer));
		
	}
}
