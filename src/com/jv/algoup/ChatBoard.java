package com.jv.algoup;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ChatBoard {
	public static void main(String[] args) {
		String[] board1 = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
		System.out.println(sol(board1));
		
		String[] board2 = {".D.R", "....", ".G..", "...D"};
	}
	
	public static int sol(String[] board) {
		int answer = 0;

		String[][] map = new String[board.length][board[0].length()];
		
		//시작점
		int[] startR = {0,0};
		for(int i=0; i<board.length; i++) {
			if(board[i].contains("R")) {
				startR = new int[] {i,board[i].indexOf("R")};
			}
		}
		//System.out.println(Arrays.toString(startR));
		
		//G
		int[] wyG = {0,0};
		for(int i=0; i<board.length; i++) {
			if(board[i].contains("G")) {
				wyG = new int[] {i,board[i].indexOf("G")};
			}
		}
		//맵
		for(int i=0; i<map.length; i++) {
			map[i]=board[i].split("");
		}
		
		//map 확인
		for(int i=0; i<map.length;i++) {
			System.out.println(Arrays.toString(map[i]));
		}
		
		//다음이 D 혹은 밖 이면 현재값 +1 //현재가 G면 end
		int[][] vst = new int[board.length][board[0].length()];
		chat(map,vst, startR);
		
		
		answer = vst[wyG[0]][wyG[1]];
		if(answer==0) {
			answer=-1;
		}
		return answer;
	}
	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	public static void chat(String[][] map, int[][] vst, int[] startR) {
		int x= startR[0];
		int y = startR[1];
		
		Queue<int[]> que = new LinkedList<int[]>();
		que.add(new int[] {x,y});

		while(!que.isEmpty()) {
			int[] cur = que.remove();
			int cX = cur[0];
			int cY = cur[1];
			
//			if(map[cX][cY].equals("G")) {
//				System.out.println("GGGGG");
//				break;
//			}
			
			for(int i=0; i<4; i++) {
				int nX = cX + dx[i];
				int nY = cY + dy[i];
				
				
				while(nX>=0 && nX<map.length && nY>=0 && nY<map[0].length) {
					//System.out.println("-");
					if (map[nX][nY].equals("D")) {
						break;
					}
					nX += dx[i];
					nY += dy[i];
				}
				if(vst[nX-dx[i]][nY-dy[i]]==0 && !map[nX-dx[i]][nY-dy[i]].equals("R")) {
					vst[nX-dx[i]][nY-dy[i]]=vst[cX][cY]+1;
					que.add(new int[] {nX-dx[i], nY-dy[i]});
					//break;
				}
			}
			
		}
		for(int i=0; i<vst.length;i++) {
			System.out.println(Arrays.toString(vst[i]));
		}
		
		
	}
}
