package com.jv.algo;

public class StrPushTest {
	public static void main(String[] args) {
		String A="hello";
		String B="ohell";
		
		for(int i=0; i<A.length();i++) {
			System.out.print(A.charAt(i)+"\t");
		}
		
		// 
		int len=A.length();
		System.out.println("\nlen  "+len);
		int check=0;
		while(check<len) {
			String str="";
			for(int i=0; i<A.length();i++) {
				if(len-check+i>=len) {
					System.out.print(A.charAt(-check+i)+"\t");
					str+=A.charAt(-check+i);
				}else {
					System.out.print(A.charAt(len-check+i)+"\t");
					str+=A.charAt(len-check+i);
				}
			}
			System.out.println();
			if(str.equals(B)) {break;}
			else {check++;}
		}
		if(check==len) {check=-1;}
		System.out.println("check : "+check);
		
		
		System.out.println("\nrepeat temp ");
		//**Âü°í
		String temp =B.repeat(2);
		System.out.println(temp.indexOf(A));
		
	}
}
