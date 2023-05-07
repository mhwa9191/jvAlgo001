package com.jv.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrListRemove {
	public static void main(String[] args) {
		int[] arr= {4,3,1,2};
		int min=11;
		Map<Integer, Integer> mapArr=new HashMap<Integer, Integer>();
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			mapArr.put(arr[i],i);
			arrlist.add(i, arr[i]);
		}
		
		System.out.println("min "+min); //min 1
		System.out.println("index : "+mapArr.get(min)); //index : 2
		mapArr.remove(min);
		System.out.println("mapArr "+mapArr); //mapArr {2=3, 3=1, 4=0}
		arrlist.remove(arrlist.indexOf(min));
		System.out.println("arrlist "+arrlist); //arrlist [4, 3, 2]
		
		int[] result= {};
		if(min==10) {
			result=new int[] {-1};
		}else {
			result=new int[arr.length-1];
			for(int i=0;i<arr.length-1;i++) {
				result[i]=arrlist.get(i);
			}
		}
		System.out.println("result "+Arrays.toString(result)); //result [4, 3, 2]
		System.out.println("=============");
				
		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(List.of(4,3,1,2));
		int del2=3;
		arrlist2.remove(arrlist2.indexOf(del2));
		System.out.println("arrlist2 "+arrlist2);
		
		ArrayList<Integer> arrlist3 = new ArrayList<Integer>(List.of(4,3,1,2));
		int del3=3;
		int indexDel3=arrlist3.indexOf(del3);
		arrlist3.remove(indexDel3);
		System.out.println("arrlist3 "+arrlist3);
		System.out.println("=============");
		
	}
}
