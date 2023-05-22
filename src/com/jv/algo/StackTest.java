package com.jv.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		String str="aAb1B2cC34oOp";
		str=str.replaceAll("[^0-9]", "-");
		Stack<String> stack=new Stack<String>();
		ArrayList<String> list = new ArrayList<String>(); 
		String strs="";
		for(String s:str.split("")) {
			if(stack.isEmpty()){
				stack.add(s);
				System.out.println("--  "+s);
			}else if(stack.peek().equals("-") && !s.equals("-") ) {
				strs+=s;
				stack.add(s);
				System.out.println("--strs  "+strs);
			}else if(!stack.peek().equals("-") && !s.equals("-")) {
				strs+=s;
				stack.pop();
				stack.add(s);
				System.out.println("---strs  "+strs);
			}else if(!stack.peek().equals("-") && s.equals("-")) {
				stack.pop();
				list.add(strs);
				System.out.println("strs--  "+strs);
				strs="";
			}
		}
		System.out.println("list  "+list);
		System.out.println("--------------");
		
		
		//
		String str2="aAb1B2cC34oOp";
		str2=str2.replaceAll("[^0-9]", " ");
		String[] arr=str2.split(" ");
		System.out.println("str2  "+str2+"\n arr"+Arrays.toString(arr));
		for(String a:arr) {
			if(a.equals(null) || a.equals("")) {
				System.out.println("::");				
			}else {
				System.out.println(Integer.parseInt(a));				
			}
		}
		for(String a:arr) {
			if(!a.equals("")) {
				System.out.println(Integer.parseInt(a));				
			}else {
				System.out.println("::");				
			}
		}
		
	}

}
