package com.jv.algolv;

import java.util.Arrays;

public class ArrTest {
	
	static int zero=0;
	static int one=0;
	public static void main(String[] args) {
		int[][] arr= {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		int[] result=new int[2];
		
		back(arr,0,0,arr.length);
		
		result[0]=zero;
		result[1]=one;
		System.out.println(Arrays.toString(result)); //result=[4,9];

	}
	
	public static void back(int[][] arr,int startR, int startC, int len) {
		int check=arr[startR][startC];
		boolean bool=true;
		
		for(int i=startR;i<startR+len; i++) {
			for(int j=startC; j<startC+len;j++) {
				if(arr[i][j] != check) { bool=false; break;	}
			}
		}
		if(bool) {
			if(check==0) {zero++;}
			else {one++;}
			return;
		}
		//4µîºÐ
		back(arr,startR,startC,len/2);
		back(arr,startR,startC+len/2,len/2);
		back(arr,startR+len/2,startC,len/2);
		back(arr,startR+len/2,startC+len/2,len/2);
		
	}
}
