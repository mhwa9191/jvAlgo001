package com.jv.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapSort {
//	{1=0.125, 2=0.42857142857142855, 3=0.5, 4=0.5, 5=0.0}
	public static void main(String[] args) {
		HashMap<Integer, Double> stage= new HashMap<Integer, Double>();
		Double[] point= {0.125,0.42857142857142855,0.5,0.5,0.0};
		int[] rank= new int[5];
		
		for(int i=0; i<point.length; i++) {
			stage.put(i+1, point[i]);
		}
		System.out.println(stage);
		//{1=0.125, 2=0.42857142857142855, 3=0.5, 4=0.5, 5=0.0}
//Á¤·Ä
		List<Integer> keys=new ArrayList<Integer>(stage.keySet());
		Collections.sort(keys,(a2,a1) -> (stage.get(a1).compareTo(stage.get(a2))));
		System.out.println(keys);
		//[3, 4, 2, 1, 5]
		for(int i=0; i<keys.size(); i++) {
			rank[i]=keys.get(i);
		}
		System.out.println(Arrays.toString(rank));
		//[3, 4, 2, 1, 5]
	
//		for(int i=1; i<stage.size()-1; i++) {
//			if(stage.get(i)<=stage.get(i+1)) {
//				int temp=0;
//				temp=rank[i];
//				rank[i]=rank[i+1];
//				rank[i+1]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(rank));
	}
}
