package com.jv.algo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class ControllZ {
	public static void main(String[] args) {
		//Integer.parseInt
		String str="10 Z 20 Z 1";
		String[] strArr=str.split(" ");
		System.out.println(Arrays.toString(strArr));
		int num=Integer.parseInt(strArr[0]);
		for(int i=1; i<strArr.length;i++) {
			if(strArr[i].equals("Z")) {
				num-=Integer.parseInt(strArr[i-1]);
			}else {
			num+=Integer.parseInt(strArr[i]);
			}
			System.out.println(num);
		}
		System.out.println("------------------------");
		
		//STACK 활용
		String ss="10 Z 20 Z 1";
		int answer=0;
		Stack<Integer> stack=new Stack<Integer>();
		for(String s:ss.split(" ")) {
			if(s.equals("Z")) {
				stack.pop();
			}else {
				stack.push(Integer.parseInt(s));
			}
		}
		for(int n:stack) {
			answer+=n;
		}
		System.out.println(answer);
		System.out.println(ss.contains("a"));
		
		// set 을 배열로 변환
		String[] strs= {"a","b","b","c"};
		Set<String> set=new LinkedHashSet<String>(Arrays.asList(strs));
		set.add("a");
		System.out.println("set  "+set);
		String[] result=set.toArray(new String[0]);
		System.out.println("result  "+Arrays.toString(result));
		// set 을 배열로 변환 int Integer
		Integer[] ns= {1,2,2,3};
		Set<Integer> setn=new LinkedHashSet<Integer>(Arrays.asList(ns));
		setn.add(1);
		System.out.println("setn  "+setn);
		Integer[] resultn=setn.toArray(new Integer[0]);
		System.out.println("resultn  "+Arrays.toString(resultn));
		
	}

}
