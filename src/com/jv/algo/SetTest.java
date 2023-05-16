package com.jv.algo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		String[] str= {"c","a","b","a"};
		Set<String> set=new LinkedHashSet<String>();
		for(String s:str) {
			set.add(s);
		}
		System.out.println("set  "+set);
		
		
		//replaceAll
		String s="a";
		String ss="abc";
		
		ss.replaceAll(s, "");
		System.out.println(ss); //abc
		
		ss=ss.replaceAll(s, "");
		System.out.println(ss); //bc
		
		//Á¤·Ä
		String abcd="bcad";
		ArrayList<String> list=new ArrayList<String>();
		for(String ab: abcd.split("")) {
			list.add(ab);
		}
		System.out.println("list  "+list);
		list.remove("a");
		System.out.println("list  "+list);
		list.sort(null);
	}
}