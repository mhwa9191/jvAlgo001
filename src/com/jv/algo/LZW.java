package com.jv.algo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LZW {
	public static void main(String[] args) {
		String str="ABNABNBN";            
//		System.out.println(str.substring(1,3)); // 1<= ��ġ <3 
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//���� Map
		Map<String, Integer> mapp=new HashMap<String, Integer>();
		int in =1;
		for(char i='A';i<='Z';i++) {
			mapp.put(i+"", in++); //i+"" i��char�̹Ƿ�
		}
				
		//���ڿ� Ȯ��
		int len=str.length();
		for(int i=0; i<len; i++) {
			int cnt=1;
			while(i+cnt<=len && mapp.containsKey(str.substring(i,i+cnt))) {
				//������ �̹� �ִ� ���ڶ�� ���̸� �ø��� ��, ���� ���ڿ����� ã��
				cnt++;
			}
			if(i+cnt>len) { //���� ���ڿ����� ã�����̰� Ŀ���� ����
				list.add(mapp.get(str.substring(i)));
				break;
			}
			mapp.put(str.substring(i,i+cnt), in++); //���� Map �� ���� ���ڿ� �߰��ϱ�
			System.out.println(mapp); 
			
			list.add(mapp.get(str.substring(i,i+cnt-1))); //�߰��� �������� ã��
			System.out.println(list); 
			if(cnt>1) {i+=cnt-2;} //ã�� ���ڿ� ���̸�ŭ �ǳʶٱ�
		}
		System.out.println(list); //[1, 2, 14, 27, 14, 28]
	}
}
