package com.jv.algosol;

public class Harshad {
	public static void main(String[] args) {
		int num1=10;
		int num2=13;
		
		System.out.println("sol num1 "+ solution(num1));
		System.out.println("sol num2 "+ solution(num2));
	}
	
	public static boolean solution(int num) {
		boolean answer=true;
		
		String str= String.valueOf(num);
		
		int sum=0;
		for(String s : str.split("")) {
			sum+=Integer.parseInt(s);
		}
		System.out.println(str);
		System.out.println(sum);
		if(num%sum!=0) {
			answer=false;
		}
		
		return answer;
	}

}
