package com.jv.algo;

public class TileFibonacci {
	public static void main(String[] args) {
		int n=4;
		int answer=0;
		
		//������ ���̰� 2�� ��
		answer=fobonacci(n);
		System.out.println(answer);
		
		//������ ���̰� 3�� ��
		
		
	}
	public static int fobonacci(int n) {
		//������ ���̰� 2�� ��
		//�Ǻ���ġ����
		int[] arr=new int[n];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<n;i++) {
			int num=arr[i-1]+arr[i-2];
			arr[i]=num%1000000007;
		}
		return arr[n-1];
	}
}
