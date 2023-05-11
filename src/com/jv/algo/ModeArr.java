package com.jv.algo;

import java.time.LocalDate;
import java.util.*;
public class ModeArr {

	public static void main(String[] args) {	
		int[] array= {1,3,2,3,3,2,4};
        int answer = 0;
        Arrays.sort(array); //����
        HashMap<Integer,Integer> modeNum=new  HashMap<Integer,Integer>();
        modeNum.put(array[0],1); //�ʱⰪ����
        
        int cnt=1;
        for(int i=1; i<array.length;i++){ //�̹� �ʱⰪ �����Ͽ����Ƿ� 1���� ����
            if(array[i]==array[i-1]){ //sort �����Ͽ����Ƿ� �񱳰��� �������� ������ ���� ����
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
                list.add(key); //������ ���� �ٸ� ���� ���� �� �����Ƿ�
            }
        }
        if(list.size()!=1){ //������ ���� �ٸ� ���� �����Ѵٸ�
            answer=-1;
        }else{
            answer=list.get(0);
        }
        System.out.println(modeNum); //���ں� ����Ȯ��
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
