package com.jv.algoup;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//풀이 정리
public class DBfs {
	// DFS/BFS
	public static void main(String[] args) {
		int[][] maps1 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		System.out.println("maps1\t"+sol(maps1));
		
		int[][] maps2 = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		System.out.println("maps2\t"+sol(maps2));
	}

	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	public static int sol(int[][] maps) {
		int answer = 0;
		
		int[][] vst = new int[maps.length][maps[0].length];
		
		//maps 과 방문목록을 가지고 너비 우선 탐색을 시작한다.
		bfs(maps, vst);
		
		//마지막 도착 점 값을 확인한다.
		answer = vst[maps.length-1][maps[0].length-1];
		
		//방문하지 않은 0 일 경우 불가능한 경우이므로 -1을 출력한다.
		if(answer==0) {
			answer = -1;
		}
				
		return answer;
		
	}	

	//너비 우선 탐색
	public static void bfs(int[][] maps, int[][] vst) {
		int x = 0;
		int y = 0;
		vst[x][y]=1;
		Queue<int[]> que =new LinkedList<int[]>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			//queue 지워가면서 방문지 확인함.
			int[] current = que.remove();
			int cX = current[0];
			int cY = current[1];
			
			for(int i=0; i<4; i++) {
				int nX = cX + dx[i];
				int nY = cY + dy[i];
				
				//maps의 범위를 넘어가지 않게 확인함.
				if(nX<0 || nX>maps.length-1 || nY<0 ||nY>maps[0].length-1) {
					continue;
				}

				//다음위치가 방문한적 없는 0인 경우와 maps에서 1인 경우
				//현재방문지에서 +1을 하여 다음 방문지에 표시함.
				//queue를 이용하여 다음방문위치를 넣음.
				if(vst[nX][nY]==0 && maps[nX][nY]==1) {
					vst[nX][nY] = vst[cX][cY]+1;
					que.add(new int[] {nX,nY});
				}				
			}
		}
	}
		
}

