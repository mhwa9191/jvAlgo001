package com.jv.algoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
//완전탐색
public class Wires {

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
	
	public static int sol(int n, int[][] wires) {
		int answer = -1;
		//끊고 이어지는 게 있는 경우 +1 없으면 끝내고
		//끊어진 곳에서 각각 총 개수를 확인해서 갯수 비교 값
		//작은 수만 남김 가장 작은 수가 최선의 방법
		answer=n;
		
		for(int i=0; i<wires.length; i++) {
			int start1=wires[i][0];
			int start2=wires[i][1];
			System.out.println(start1+" :: "+start2);
			
			ArrayList<int[]> wiresList= new ArrayList<int[]>();
			for(int j=0; j<wires.length; j++) {
				if(i!=j) {
					wiresList.add(wires[j]);
					//System.out.println(Arrays.toString(wires[j]));
				}
			}
			//System.out.println("wiresList "+wiresList);

			int cnt1=1;
			int cnt2=1;
			
			Stack<Integer> stack1=new Stack<Integer>(); // 다시 확인할 숫자 목록
			for(int k=0; k<wiresList.size();k++) {
				if(start1==wiresList.get(k)[0]) {
					//System.out.println(Arrays.toString(wiresList.get(k)));
					cnt1++;
					stack1.add(wiresList.get(k)[1]); // 연결되니까 다시 확인 필요
					wiresList.remove(k);
					k--; //지웠으니 다시 줄여주기
				}else if(start1==wiresList.get(k)[1]) {
					//System.out.println(" "+Arrays.toString(wiresList.get(k)));
					cnt1++;
					stack1.add(wiresList.get(k)[0]);
					wiresList.remove(k);
					k--;
				}
			}
			//System.out.println("stack1  "+stack1);
			cnt1=check(wiresList, stack1, cnt1);
			System.out.println("?? "+cnt1);
			
			
			
			
			Stack<Integer> stack2=new Stack<Integer>();
			for(int k=0; k<wiresList.size();k++) {
				if(start2==wiresList.get(k)[0]) {
					//System.out.println(" "+Arrays.toString(wiresList.get(k)));
					cnt2++;
					stack2.add(wiresList.get(k)[1]);
					wiresList.remove(k);
					k--;
				}else if(start2==wiresList.get(k)[1]) {
					//System.out.println(" "+Arrays.toString(wiresList.get(k)));
					cnt2++;
					stack2.add(wiresList.get(k)[0]);
					wiresList.remove(k);
					k--;
				}
			}
			//System.out.println("stack2  "+stack2);
			cnt2=check(wiresList, stack2, cnt2);
			System.out.println("!! "+cnt2);
			
			
			System.out.println("cnt1 "+cnt1+"  cnt2 "+cnt2);
			System.out.println("**** "+Math.abs(cnt1-cnt2));
			int cnt= Math.abs(cnt1-cnt2);
            if(cnt>=0 && answer> cnt){
                answer=cnt;
            }
		}
		
		return answer;
	}
	
	public static int check(ArrayList<int[]> wiresList, Stack<Integer> stack, int cnt) {
		
		while(!stack.isEmpty()) {
			int check=stack.pop();
			for(int k=0; k<wiresList.size();k++) {
				if(check==wiresList.get(k)[0]) {
					//System.out.println("== "+Arrays.toString(wiresList.get(k)));
					cnt++;
					stack.add(wiresList.get(k)[1]); // 연결되니까 다시 확인 필요
					wiresList.remove(k);
					k--; //지웠으니 다시 줄여주기
				}else if(check==wiresList.get(k)[1]) {
					//System.out.println("== "+Arrays.toString(wiresList.get(k)));
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
