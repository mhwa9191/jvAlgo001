package com.jv.algo;

import java.time.LocalDate;
import java.util.*;
public class ModeArr {

	public static void main(String[] args) {	
		int[] array= {1,3,2,3,3,2,4};
        int answer = 0;
        Arrays.sort(array); //정렬
        HashMap<Integer,Integer> modeNum=new  HashMap<Integer,Integer>();
        modeNum.put(array[0],1); //초기값설정
        
        int cnt=1;
        for(int i=1; i<array.length;i++){ //이미 초기값 설정하였으므로 1부터 시작
            if(array[i]==array[i-1]){ //sort 정렬하였으므로 비교가능 이전값과 같으면 갯수 증가
                cnt=cnt+1;
                modeNum.put(array[i],cnt);
            }else{
                modeNum.put(array[i],1);
                cnt=1;
            }
        }
        int maxNum= Collections.max(modeNum.values());
        
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(Integer key:modeNum.keySet()){
            if(modeNum.get(key).equals(maxNum)){
                list.add(key); //갯수가 같은 다른 수가 생길 수 있으므로
            }
        }
        if(list.size()!=1){ //갯수가 같은 다른 수가 존재한다면
            answer=-1;
        }else{
            answer=list.get(0);
        }
        System.out.println(modeNum); //숫자별 갯수확인
        System.out.println(answer);
        
        //cast
        int aa=1000;
        int a=0;
        a=(int) (aa*0.9);

        //today
        LocalDate toDay=LocalDate.now();
        System.out.println(toDay);
	}
	
}
