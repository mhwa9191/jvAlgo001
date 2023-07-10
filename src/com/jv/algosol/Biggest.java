package com.jv.algosol;

public class Biggest {

	public static void main(String[] args) {
		String str1="12223";
		String str2="111999333";
		String str3="123";
		
		System.out.println("str1 :: "+solution(str1));
		System.out.println("str2 :: "+solution(str2));
		System.out.println("str3 :: "+solution(str3));
	}

	private static int solution(String str) {
		int biggest = -1;
		for(int i=0; i<str.length()-2; i++) {
			if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)) {
				biggest = Math.max(biggest, Integer.parseInt(str.substring(i, i+3)));
			}
		}
		
		return biggest;
	}
}

//토스 NEXT
//Core Banking/Server 직군
// 숫자로만 이루어진 문자열 + 길이가 3인 substring을 10진수로 읽은 숫자 + 각 자리의 숫자가 모두 같음
// 만약 여러개 존재하면 가장 큰 수를, 가장 큰 수가 000이라면 0을, 없다면 -1 리턴
