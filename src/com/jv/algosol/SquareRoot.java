package com.jv.algosol;

public class SquareRoot {
//Á¦°ö±Ù
	public static void main(String[] args) {
		long num1 = 121;
		long num2 = 3;
//		long num3 = 5000000000; out of range!!
		
		System.out.println("sol1 :: "+solution(num1));
		System.out.println("sol2 :: "+solution(num2));

		System.out.println("2 sol1 :: "+solution2(num1));
		System.out.println("2 sol2 :: "+solution2(num2));
		
	}
	
	public static long solution(long n) {
        long answer = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(i*i==n){
                answer=(i+1)*(i+1);
                break;
            }else{
                answer=-1;
            }
        }
        
        return answer;
	}

	public static long solution2(long n) {
        long answer = 0;
        double sqr=Math.sqrt(n);        
        if((sqr*10)%10==0) {
//        	System.out.println(sqr+1);
//        	System.out.println(Math.round(sqr));
        	answer=(Math.round(sqr)+1)*(Math.round(sqr)+1);
        }else {
        	answer=-1;
        }
               
        return answer;
	}
}
