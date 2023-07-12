package com.jv.algosol;

import java.util.Arrays;
import java.util.HashMap;

public class ReportTest {
	public static void main(String[] args) {
		String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
		String[] report1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k1 = 2;

		String[] id_list2 = {"con", "ryan"};
		String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k2 = 3;
		
		System.out.println("sol1  :: "+Arrays.toString(solution(id_list1,report1,k1))); //[2,1,1,0]
		System.out.println("sol2  :: "+Arrays.toString(solution(id_list2,report2,k2))); //[0,0]

	}

	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer= new int[id_list.length];

		HashMap<String, String> map=new HashMap<String, String>();
		//나를 신고한 목록을 만들고 중복되면 체크안됨
		for(int i=0; i<report.length; i++) {
			String[] temp=report[i].split(" ");
//			System.out.println("신고한 유저: "+temp[0]+",  신고된 유저: "+temp[1]);
			String report_user=temp[0];
			String reported_user=temp[1];
			if(map.get(reported_user)==null) {
				map.put(reported_user, report_user);
			}else if(map.get(reported_user).contains(report_user)) {
				continue;
			}else {
				map.put(reported_user, map.get(reported_user)+" "+report_user);
			}
			
		}
		System.out.println(map);
		
		for(int i=0; i<id_list.length; i++) {
			if(map.get(id_list[i])==null) {answer[i]=0;}
			else {
			answer[i]=map.get(id_list[i]).split(" ").length;
			}
		}
		//정지된 유저 확인됨
		
		//결과 알림
		
		
		return answer;
	}
}
