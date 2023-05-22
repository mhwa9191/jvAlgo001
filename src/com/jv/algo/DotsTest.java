package com.jv.algo;

import java.util.ArrayList;

public class DotsTest {
	public static void main(String[] args) {
		int[][] dots= {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		ArrayList<Double> gradi=new ArrayList<Double>();
		for(int i=0; i<dots.length;i++) {
			for(int j=i+1;j<dots.length;j++) {
				System.out.println(i+"   "+j);
				System.out.print("y값--  "+dots[j][1]+" "+dots[i][1]);
				System.out.println(" x값 "+dots[j][0]+" "+dots[i][0]+"  " );
				
				double gra=(dots[j][1]-dots[i][1])/(double)(dots[j][0]-dots[i][0]);
				gradi.add(gra);
			}
		}
		System.out.println(gradi);
		for(int i=0; i<gradi.size();i++) {
			double num1=gradi.get(i);
			for(int j=i+1;j<gradi.size();j++){
				System.out.print("   gradi.get(i) "+gradi.get(i));
				System.out.println("   gradi.get(j) "+gradi.get(j));
				if(gradi.get(i).equals(gradi.get(j))) {
					System.out.print("   equals 값 "+gradi.get(j));
				}
				if(num1==gradi.get(j)) {
					System.out.println("   == 값 "+num1);	
				}
			}
		}
	}
}
