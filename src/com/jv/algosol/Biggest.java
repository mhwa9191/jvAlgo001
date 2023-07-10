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

//�佺 NEXT
//Core Banking/Server ����
// ���ڷθ� �̷���� ���ڿ� + ���̰� 3�� substring�� 10������ ���� ���� + �� �ڸ��� ���ڰ� ��� ����
// ���� ������ �����ϸ� ���� ū ����, ���� ū ���� 000�̶�� 0��, ���ٸ� -1 ����
