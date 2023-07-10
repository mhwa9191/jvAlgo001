package com.jv.algosol;

import java.util.Arrays;

public class Keyboard {
	
	public static void main(String[] args) {
		
		String[] keymap1 = { "BCEFD", "ABACD"};
		String[] keymap2 = {"AA"};
		String[] keymap3 = {"AGZ", "BSSS"};
		
		String[] targets1 = {"ABCD","AABB"};
		String[] targets2 = {"B"};
		String[] targets3 = {"ASA","BGZ"};
		
		System.out.println("sol1 :: "+Arrays.toString(solution(keymap1, targets1))); //[9,4]
		System.out.println("sol2 :: "+Arrays.toString(solution(keymap2, targets2))); //[-1]
		System.out.println("sol3 :: "+Arrays.toString(solution(keymap3, targets3))); //[4, 6]
	}

	public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for(int i=0; i<targets.length; i++ ) {
        	int sum=0;
        	for(int j=0; j<targets[i].length(); j++) {
        		System.out.print(targets[i].charAt(j));
        
        		int click=-1;
        		for(int ts=0; ts<keymap.length; ts++ ) {
                	for(int t=0; t<keymap[ts].length(); t++) {
                		if(targets[i].charAt(j)==keymap[ts].charAt(t)) {
//                			System.out.print(" "+t+1+" "); //01 Ãâ·Â µ¡¼À °ýÈ£ ÁÖÀÇ
                			System.out.print(" "+(t+1)+" "); //1Ãâ·Â
                			if(click!=-1&& click<t+1) {continue;}
                			click=t+1;
                			break;                			
                		}
                	}
                }
        		System.out.println("click  :: "+click);
        		System.out.println();        		
        		sum+=click;
        	}
        	System.out.println("sum  :: "+sum);
        	answer[i]=sum;
        }
        
        
        return answer;
    }
}
