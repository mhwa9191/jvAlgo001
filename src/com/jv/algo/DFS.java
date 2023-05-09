package com.jv.algo;

public class DFS {
	//���� �¿�밢������ �̵�������
	//������ ������ �� ���� �����̷��� �켱 ���� �࿡�� �ϳ��� ���� ������
	
	public static void main(String[] args) {
		int N=4; //4��4��
		int[] arr=new int[N];
				
		int count=nQueen(0,N,arr); //����0
		System.out.println(count);
	}
	
	//������ ��� Ȯ��
	public static int nQueen(int index,int N,int[] row) {
		int cnt=0;
		if(index==N) { // N���� �Ǹ� ���� ����
			cnt++;
		}else {
			for(int i=0; i<N;i++) {
				row[index]=i;
				if(possible(index,row)) { // ������ ��� ���
					cnt+=nQueen(index+1,N,row);
				}
			}
		}
		return cnt;
	}
	
	//��ġ Ȯ��
	public static boolean possible(int col,int[] row) {
		Boolean bool=true;
		for (int i=0;i<col;i++) {
			//���� ���� ��ġ �Ǵ� �밢���� ��ġ
			if(row[col]==row[i] || Math.abs(col-i)==Math.abs(row[col]-row[i])) {
				bool= false;
				break;
			}
		}
		return bool;
	}
}
