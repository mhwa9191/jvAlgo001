package com.jv.algo;

public class DoubleArr {

	public static void main(String[] args) {
		int[][] arr1= {{1,4},{2,3},{4,1}}; 
		int[][] arr2= {{2,3},{1,4}};
		
		//System.out.println(arr1.length); //3
		//System.out.println(arr1[0].length); //2

		// arr1*arr2 ���
		int[][] arr=new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				for (int k=0; k<arr2.length; k++) {
					arr[i][j]+=arr1[i][k]*arr2[k][j];	
				}
			}
		}
		
		//Ȯ��
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");			
			}
			System.out.println(); //��ٲ�
		}
		
	}

}

// 00 01  00 01 = 00*00+01*10 00*10+01*11
// 10 11  10 11   10*00+11*10 10*10+11*11
// 20 21          20*00+21*10 20*10+21*11