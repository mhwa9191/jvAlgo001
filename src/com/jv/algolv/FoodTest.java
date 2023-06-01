package com.jv.algolv;

public class FoodTest {
	public static void main(String[] args) {
		// 통과 (12.97ms, 74.1MB)
		int[] food= {1, 3, 4, 6};
		//result "1223330333221"
		// 3/2 =1 1은 1번
		// 4/2 =2 2는 2번
		// 6/2 =3 3은 3번
		String output="";
		int index=1;
		for(int i=1;i<food.length;i++) {
			for(int j=0;j<food[i]/2;j++) {
				output+=index+"";
			}
			index++;
		}
		System.out.println("output "+output);
		StringBuilder sb=new StringBuilder(output).reverse();
		System.out.println("sb "+sb);
		
		//repeat
		String a="123";
		a=a.repeat(2);
		System.out.println(a);
		
		
		// 참고 통과 (2.00ms, 73.4MB)
		StringBuilder builder = new StringBuilder();
        for (int i=1; i<food.length; i++) {
            int result = food[i] / 2;
            builder.append(String.valueOf(i).repeat(result));
        }
        String answer = builder + "0";
        System.out.println(answer+builder.reverse());
        
	}
}
