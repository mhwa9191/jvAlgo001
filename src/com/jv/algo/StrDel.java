package com.jv.algo;

public class StrDel {
	public static void main(String[] args) {
		String str="AbcabA";
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb); //AbcabA
		sb.append(str);
		System.out.println(sb); //AbcabAAbcabA
		System.out.println("=================");
		
		String strs="AbcabA";
		String s="b";
		char sC=s.charAt(0);
		StringBuilder sbs=new StringBuilder();
		for(int i=0; i<strs.length();i++) {
			char c=strs.charAt(i);
			//String strC=Character.toString(c); //char -> String
			if(sC!=c) {
				sbs.append(c);
			}
		}
		System.out.println(sbs); //AcaA
		System.out.println("=================");
		
//		replace !!
		String strst="AbcabA";
		String st="b";
		String answer=strst.replace(st, ""); 
		System.out.println(answer); //AcaA
		
	}
}
