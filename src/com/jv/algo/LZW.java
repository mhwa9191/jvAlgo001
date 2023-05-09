package com.jv.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LZW {
	public static void main(String[] args) {
		String str="ABNABNBN";            
//		System.out.println(str.substring(1,3)); // 1<= 위치 <3 
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//사전 Map
		Map<String, Integer> mapp=new HashMap<String, Integer>();
		int in =1;
		for(char i='A';i<='Z';i++) {
			mapp.put(i+"", in++); //i+"" i는char이므로
		}
				
		//문자열 확인
		int len=str.length();
		for(int i=0; i<len; i++) {
			int cnt=1;
			while(i+cnt<=len && mapp.containsKey(str.substring(i,i+cnt))) {
				//사전에 이미 있는 문자라면 길이를 늘리기 즉, 없는 문자열까지 찾음
				cnt++;
			}
			if(i+cnt>len) { //남은 문자열보다 찾은길이가 커지면 끝냄
				list.add(mapp.get(str.substring(i)));
				break;
			}
			mapp.put(str.substring(i,i+cnt), in++); //사전 Map 에 없는 문자열 추가하기
			System.out.println(mapp); 
			
			list.add(mapp.get(str.substring(i,i+cnt-1))); //추가한 사전에서 찾기
			System.out.println(list); 
			if(cnt>1) {i+=cnt-2;} //찾은 문자열 길이만큼 건너뛰기
		}
		System.out.println(list); //[1, 2, 14, 27, 14, 28]
	}
}
