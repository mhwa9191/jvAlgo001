package com.jv.algoup;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Ǯ�� ����
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
		
		//maps �� �湮����� ������ �ʺ� �켱 Ž���� �����Ѵ�.
		bfs(maps, vst);
		
		//������ ���� �� ���� Ȯ���Ѵ�.
		answer = vst[maps.length-1][maps[0].length-1];
		
		//�湮���� ���� 0 �� ��� �Ұ����� ����̹Ƿ� -1�� ����Ѵ�.
		if(answer==0) {
			answer = -1;
		}
				
		return answer;
		
	}	

	//�ʺ� �켱 Ž��
	public static void bfs(int[][] maps, int[][] vst) {
		int x = 0;
		int y = 0;
		vst[x][y]=1;
		Queue<int[]> que =new LinkedList<int[]>();
		que.add(new int[] {x,y});
		
		while(!que.isEmpty()) {
			//queue �������鼭 �湮�� Ȯ����.
			int[] current = que.remove();
			int cX = current[0];
			int cY = current[1];
			
			for(int i=0; i<4; i++) {
				int nX = cX + dx[i];
				int nY = cY + dy[i];
				
				//maps�� ������ �Ѿ�� �ʰ� Ȯ����.
				if(nX<0 || nX>maps.length-1 || nY<0 ||nY>maps[0].length-1) {
					continue;
				}

				//������ġ�� �湮���� ���� 0�� ���� maps���� 1�� ���
				//����湮������ +1�� �Ͽ� ���� �湮���� ǥ����.
				//queue�� �̿��Ͽ� �����湮��ġ�� ����.
				if(vst[nX][nY]==0 && maps[nX][nY]==1) {
					vst[nX][nY] = vst[cX][cY]+1;
					que.add(new int[] {nX,nY});
				}				
			}
		}
	}
		
}

