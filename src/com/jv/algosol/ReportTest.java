package com.jv.algosol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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

		System.out.println();
		System.out.println("//sol1  :: "+Arrays.toString(solution2(id_list1,report1,k1))); //[2,1,1,0]
		System.out.println("//sol2  :: "+Arrays.toString(solution2(id_list2,report2,k2))); //[0,0]
	}

	//��Ȯ�� 29
	public static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer= new int[id_list.length];
		int[] result= new int[id_list.length];

		HashMap<String, String> map=new HashMap<String, String>();
		HashMap<String, String> map2=new HashMap<String, String>(); //���� �Ű��� ���
		//���� �Ű��� ����� ����� �ߺ��Ǹ� üũ�ȵ�
		for(int i=0; i<report.length; i++) {
			String[] temp=report[i].split(" ");
//			System.out.println("�Ű��� ����: "+temp[0]+",  �Ű�� ����: "+temp[1]);
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
		for(int i=0; i<report.length; i++) {
			String[] temp=report[i].split(" ");
//			System.out.println("�Ű��� ����: "+temp[0]+",  �Ű�� ����: "+temp[1]);
			String report_user=temp[0];
			String reported_user=temp[1];
			if(map2.get(report_user)==null) {
				map2.put(report_user, reported_user);
			}else if(map2.get(report_user).contains(reported_user)) {
				continue;
			}else {
				map2.put(report_user, map2.get(report_user)+" "+reported_user);
			}
		}
		System.out.println("map key�� �Ű��� ������ "+map);
		System.out.println("map2 :: "+map2);
		
		for(int i=0; i<id_list.length; i++) {
			if(map.get(id_list[i])==null) {
				result[i]=0;
			}
			else {
				result[i]=map.get(id_list[i]).split(" ").length;
			}
		}
		//������ ���� Ȯ�ε�
//		System.out.println(Arrays.toString(result));
		for(int i=0; i<id_list.length; i++) {
			if(result[i]>=k) {
//				System.out.println(" ���� :: "+id_list[i]);
			}
		}
		
		HashMap<String, Integer> id_report = new HashMap<String, Integer>();
		for(int i=0; i<id_list.length; i++) {
			if(map.get(id_list[i])==null) {
				id_report.put(id_list[i], 0);
			}else {
				id_report.put(id_list[i], map.get(id_list[i]).split(" ").length);
			}
		}
		System.out.println("id_report  "+id_report);
		
		//��� �˸�
		for(int i=0; i<id_list.length; i++) {
			if(map2.get(id_list[i])==null) {
				answer[i]=0;
			}else {
				for(String str : map2.get(id_list[i]).split(" ")) {
					if(id_report.get(str)>=k) {
						answer[i]++;
					}
				}
			}
			
		}		
		
		return answer;
	}
	
	
	//���
	public static int[] solution2(String[] id_list, String[] report, int k) { 
		int[] answer= new int[id_list.length];
		 
	    Set<String> set = new HashSet<>();
	    for (String str : report) {
	        set.add(str);
	    }
	    System.out.println("set "+set);

	    HashMap<String, String> map=new HashMap<String, String>();
		HashMap<String, String> map2=new HashMap<String, String>(); //���� �Ű��� ���
		//�Ű�� ���� ���
		ArrayList<String> list=new ArrayList<String>();
		Iterator<String> iter=set.iterator();		
		while(iter.hasNext()) {
			String[] temp=iter.next().split(" ");
			String report_user=temp[0];
			String reported_user=temp[1];
			list.add(reported_user);
			if(map2.get(report_user)==null) {
				map2.put(report_user, reported_user);
			}else {
				map2.put(report_user, map2.get(report_user)+" "+reported_user);
			}
		}
		System.out.println("map2 :: "+map2);
		System.out.println("list   "+list);
		
		
		HashMap<String, Integer> id_report = new HashMap<String, Integer>();
		for(int i=0; i<id_list.length; i++) {
			int num=0;
			for(String str:list) {
				if(id_list[i].equals(str)) {
					num++;
				}
			}
			id_report.put(id_list[i], num);
		}
		System.out.println("id_report  "+id_report);
		
		//��� �˸�
		for(int i=0; i<id_list.length; i++) {
			if(map2.get(id_list[i])==null) {
				answer[i]=0;
			}else {
				for(String str : map2.get(id_list[i]).split(" ")) {
					if(id_report.get(str)>=k) {
						answer[i]++;
					}
				}
			}
			
		}
		
		return answer;
	}
}
