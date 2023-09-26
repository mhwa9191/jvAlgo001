package com.jv.algoup;

public class BinaryLinks {
	
	public static void main(String[] args) {
		int k1 = 3;
		int[] num1 = {12, 30, 1, 8, 8, 6, 20, 7, 5, 10, 4, 1}; 
		int[][] links1 = {{-1, -1}, {-1, -1}, {-1, -1}, {-1, -1}, {8, 5}, {2, 10}, {3, 0}, {6, 1}, {11, -1}, {7, 4}, {-1, -1}, {-1, -1}};		
		
		System.out.println(sol(k1, num1, links1));
	}
	
	public static int sol(int k, int[] num, int[][] links) {
        int answer = 0;
        
        for(int i=0; i<links.length; i++) {
        	if(links[i][0]==-1 && links[i][1]==-1) {
        		System.out.println(i+" 번째 -1");
        		int candi = num[i];
        		System.out.println(candi+" 응시자수 ");
        	}
        }
        
        return answer;
    }

}
