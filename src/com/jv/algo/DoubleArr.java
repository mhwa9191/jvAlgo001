package com.jv.algo;

import java.util.Arrays;

public class DoubleArr {

	public static void main(String[] args) {
		int[][] arr1= {{1,4},{2,3},{4,1}}; 
		int[][] arr2= {{2,3},{1,4}};
		
		//System.out.println(arr1.length); //3
		//System.out.println(arr1[0].length); //2

		// arr1*arr2 결과
		int[][] arr=new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				for (int k=0; k<arr2.length; k++) {
					arr[i][j]+=arr1[i][k]*arr2[k][j];	
				}
			}
		}
		
		//확인
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");			
			}
			System.out.println(); //행바꿈
		}
		// 00 01  00 01 = 00*00+01*10 00*10+01*11
		// 10 11  10 11   10*00+11*10 10*10+11*11
		// 20 21          20*00+21*10 20*10+21*11
		
		
		
		//직사각형 문제 확인
		int[][] arrr= {{1,1},{2,1},{2,2},{1,2}};
		int a=arrr[0][0];
		int b=arrr[0][1];
		int x=0;
		int y=0;
		int x1=0;
		int x2=0;
		for(int i=0; i<arrr.length;i++) {
			System.out.println(Arrays.toString(arrr[i]));
			if(arrr[i][0]==a &&arrr[i][1]!=b) {
				y=Math.abs(b-arrr[i][1]);
			}else if(arrr[i][0]!=a &&arrr[i][1]!=b) {
				x1=arrr[i][1];
			}else if(arrr[i][0]!=a &&arrr[i][1]==b) {
				x2=arrr[i][1];
			}
		}
		x=Math.abs(x1-x2);
		System.out.println("x "+x+"  y "+y); //x 1  y 1
		
		
		// 비교는 한번씩만 하면 됨
		int[][] dots= {{-1,1},{1,1},{-1,-1},{1,-1}};
		int result = 0;
        int aa=dots[0][0];
        int bb=dots[0][1];
        int xx=0;
        int yy=0;
        for(int i=0;i<dots.length;i++){
            if(dots[i][0]!=aa){
                xx=Math.abs(aa-dots[i][0]);
            }else if(dots[i][0]!=b){
                yy=Math.abs(bb-dots[i][1]);
            }
        }
        result=xx*yy;
        System.out.println("xx "+xx+"  yy "+yy); //xx 2  yy 2
	}

}

