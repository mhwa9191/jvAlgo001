package com.jv.algo;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 4, 3, 6};
		int N=4;
		System.out.println(Arrays.toString(arr)+"  N:"+N);
		int min=10;
		int index=0;
		Arrays.sort(arr);
		int[] output=new int[arr.length];
		int[] result=new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			output[i]=arr[i]-N;
			if(min>Math.abs(output[i])) {
				min=Math.abs(output[i]);
				index=i;
			}
		}
		System.out.println("-N  "+Arrays.toString(output));
		System.out.println(min+" : "+index);
		int start =output[index];
		for(int j=0; j<output.length-1;j++) {
			for(int i=0; i<output.length-1-j;i++) {
				if(Math.abs(output[i])<Math.abs(output[i+1]) ) {
					int temp=output[i];
					output[i]=output[i+1];
					output[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(output));
		
		for(int j=0;j<result.length;j++) {
			result[j]=output[output.length-j-1];
		}
		System.out.println(Arrays.toString(result));
		
	}
}
