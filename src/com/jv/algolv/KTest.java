package com.jv.algolv;

import java.util.Arrays;

public class KTest {
	public static void main(String[] args) {
		int[] arr= {1, 5, 2, 6, 3, 7, 4};
		int[][] com= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
// [5,6,3]
		
		for(int[] c:com) {
			int start=c[0];
			int end=c[1];
			int len=end-start+1;
			int[] output=new int[len];
			for(int i=0;i<len;i++) {
				output[i]=arr[start+i-1];
			}
			Arrays.sort(output);
			System.out.println(Arrays.toString(output));
			System.out.println(output[c[2]-1]);
			
			
			//Âü°í
			int[] array2= {1, 5, 2, 6, 3, 7, 4};
			int[][] commands2= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
			int[] answer2 = new int[commands2.length];

	        for(int i=0; i<commands2.length; i++){
	            int[] temp = Arrays.copyOfRange(array2, commands2[i][0]-1, commands2[i][1]);
	            Arrays.sort(temp);
	            answer2[i] = temp[commands2[i][2]-1];
	        }
	        System.out.println(Arrays.toString(answer2));
		}
	}
}
