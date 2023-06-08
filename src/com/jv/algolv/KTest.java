package com.jv.algolv;

import java.util.Arrays;

public class KTest {
	public static void main(String[] args) {
		int[] arr= {1, 5, 2, 6, 3, 7, 4};
		int[][] com= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
// [5,6,3]
		
		for(int[] c:com) {
			int start=c[0];
			int end=c[1];
			int len=end-start+1;
			int[] output=new int[len];
			for(int i=0;i<len;i++) {
				output[i]=arr[start+i-1];
			}
			Arrays.sort(output);
			System.out.println(Arrays.toString(output));
			System.out.println(output[c[2]-1]);
		}
			
		//참고
		int[] array2= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands2= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer2 = new int[commands2.length];

        for(int i=0; i<commands2.length; i++){
            int[] temp = Arrays.copyOfRange(array2, commands2[i][0]-1, commands2[i][1]);
            Arrays.sort(temp);
            answer2[i] = temp[commands2[i][2]-1];
        }
        System.out.println("answer2 "+Arrays.toString(answer2));
        
        
        //참고
        int[] answer=solution(array2,commands2);
        System.out.println("answer "+Arrays.toString(answer));
		}
		//
		static int[] solution(int[] array, int[][] commands) {
	        int n = 0;
	        int[] ret = new int[commands.length];

	        while(n < commands.length){
	            int m = commands[n][1] - commands[n][0] + 1;

	            if(m == 1){
	                ret[n] = array[commands[n++][0]-1];
	                continue;
	            }

	            int[] a = new int[m];
	            int j = 0;
	            for(int i = commands[n][0]-1; i < commands[n][1]; i++)
	                a[j++] = array[i];

	            sort(a, 0, m-1);

	            ret[n] = a[commands[n++][2]-1];
	        }

	        return ret;
	    }

	   static void sort(int[] a, int left, int right){
	        int pl = left;
	        int pr = right;
	        int x = a[(pl+pr)/2];
	        System.out.println("a "+Arrays.toString(a));

	        do{
	            while(a[pl] < x) pl++;
	            while(a[pr] > x) pr--;
	            if(pl <= pr){
	                int temp = a[pl];
	                a[pl] = a[pr];
	                a[pr] = temp;
	                pl++;
	                pr--;
	                System.out.println("a "+Arrays.toString(a));
	            }
	        }while(pl <= pr);

	        if(left < pr) sort(a, left, pr);
	        if(right > pl) sort(a, pl, right);
	    }
	
}
