package com.jv.algo;

import java.util.Arrays;

public class SafeTest {
	public static void main(String[] args) {
		int[][] safe= {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},
		                   {0, 0, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
	//출력
		for(int i=0; i<safe.length;i++) {
			System.out.println(Arrays.toString(safe[i]));
		}

		for(int i=0; i<safe.length;i++) {
			for(int j=0; j<safe[0].length; j++) {
				if(safe[i][j]==1) {
					System.out.println(i+" :: "+j);
					// (i-1,j-1)(i-1,j)(i-1,j+1)(i,j-1)(i,j+1)(i+1,j-1)(i+1,j)(i+1,j+1)
					for(int r=i-1;r<i+2;r++) {
						if(r<0 || r>=safe.length ) {
							continue;
						}else {
							for(int c=j-1;c<j+2;c++) {
								if(c<0 || c>=safe[0].length ||safe[r][c]==1) {
									continue;
								}else {
									safe[r][c]=9;
								}
							}
						}
					}
				}
			}
		}
		
		
	//출력
		for(int i=0; i<safe.length;i++) {
			System.out.println(Arrays.toString(safe[i]));
		}
	}
}
