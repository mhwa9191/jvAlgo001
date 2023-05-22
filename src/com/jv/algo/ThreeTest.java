package com.jv.algo;

public class ThreeTest {
//15 25
//40 76
	public static void main(String[] args) {
		int N=90;
		int num=0;
		for(int i=1;i<=N;i++) {
			num++;
			while(check(num)) {
				num++;
			}
			System.out.print(num+"\t");
		}
	}
	public static Boolean check(int num) {
		boolean bool=false;
		if(num%3==0 || num%10==3 || num/10==3){bool=true;}
		if((num/10)%10==3){bool=true;} //130 131 라인 지나가기
		return bool;
	}
}
