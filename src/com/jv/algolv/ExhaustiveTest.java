package com.jv.algolv;

public class ExhaustiveTest {
	public static void main(String[] args) {
		String word1="AAAAE";
		String word2="AAAE";
		String word3="I";
		String word4="EIO";
		
		System.out.println("::: word1 solution "+solution(word1)+"\n");
		System.out.println("::: word2 solution "+solution(word2)+"\n");
		System.out.println("::: word3 solution "+solution(word3)+"\n");
		System.out.println("::: word4 solution "+solution(word4));

	}

	public static int solution(String word) {
		int get = 0;
		int per=((((5+1)*5+1)*5+1)*5+1)*5; // 3905
		System.out.println("\tper  "+per);
		
		for(String w: word.split("")){
			get+= "AEIOU".indexOf(w)*(per/=5)+1;
			System.out.println("per  "+per+"  get "+get);
		}
		return get;
	}
}
