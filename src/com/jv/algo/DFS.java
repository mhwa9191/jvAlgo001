package com.jv.algo;

public class DFS {
	//퀸은 좌우대각선으로 이동가능함
	//퀸끼리 공격할 수 없는 조건이려면 우선 같은 행에는 하나의 퀸만 가능함
	
	public static void main(String[] args) {
		int N=4; //4행4열
		int[] arr=new int[N];
				
		int count=nQueen(0,N,arr); //시작0
		System.out.println(count);
	}
	
	//가능한 경우 확인
	public static int nQueen(int index,int N,int[] row) {
		int cnt=0;
		if(index==N) { // N개가 되면 갯수 증가
			cnt++;
		}else {
			for(int i=0; i<N;i++) {
				row[index]=i;
				if(possible(index,row)) { // 가능할 경우 재귀
					cnt+=nQueen(index+1,N,row);
				}
			}
		}
		return cnt;
	}
	
	//위치 확인
	public static boolean possible(int col,int[] row) {
		Boolean bool=true;
		for (int i=0;i<col;i++) {
			//같은 열에 위치 또는 대각선에 위치
			if(row[col]==row[i] || Math.abs(col-i)==Math.abs(row[col]-row[i])) {
				bool= false;
				break;
			}
		}
		return bool;
	}
}
