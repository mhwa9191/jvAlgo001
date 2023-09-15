package com.jv.algoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
//¿ÏÀüÅ½»ö
public class Wires2 {

	public static void main(String[] args) {
		int n1 = 9;
		int[][] wires1 = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
	
		System.out.println(Arrays.deepToString(wires1));
		System.out.println(sol(n1, wires1));
		System.out.println("   >>sol");
		
		int n2 = 4;
		int[][] wires2 = {{1,2},{2,3},{3,4}};
		System.out.println(sol(n2, wires2));
		System.out.println("   >>sol");
	}
	
	
	private static ArrayList<int[]> wiresList;
	private static Stack<Integer> stack;
	
	public static int sol(int n, int[][] wires) {
		int answer = -1;
		answer=n;
		
		for(int i=0; i<wires.length; i++) {
			int start=wires[i][0];
		
			wiresList= new ArrayList<int[]>();
			for(int j=0; j<wires.length; j++) {
				if(i!=j) {
					wiresList.add(wires[j]);
				}
			}

			int cnt1=1;
			
			stack=new Stack<Integer>(); 
			stack.add(start);
			
			cnt1=check(cnt1);
			System.out.println("cnt1 "+cnt1);
			System.out.println("* * * * "+Math.abs(cnt1-(n-cnt1)));
			int count= Math.abs(cnt1-(n-cnt1));
            if(answer> count){
                answer=count;
            }
		}
		
		return answer;
	}
	
	public static int check(int cnt) {
		
		while(!stack.isEmpty()) {
			int check=stack.pop();
			for(int k=0; k<wiresList.size();k++) {
				if(check==wiresList.get(k)[0]) {
					cnt++;
					stack.add(wiresList.get(k)[1]);
					wiresList.remove(k);
					k--;
				}else if(check==wiresList.get(k)[1]) {
					cnt++;
					stack.add(wiresList.get(k)[0]);
					wiresList.remove(k);
					k--;
				}
			}
		}
		
		return cnt;
	}
	
}