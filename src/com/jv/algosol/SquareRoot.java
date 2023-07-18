package com.jv.algosol;

public class SquareRoot {
//Á¦°ö±Ù
	public static void main(String[] args) {
		long num1 = 121;
		long num2 = 3;
		
		System.out.println("sol1 :: "+solution(num1));
		System.out.println("sol2 :: "+solution(num2));
		
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
}
