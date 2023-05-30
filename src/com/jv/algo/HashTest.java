package com.jv.algo;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	//해시 > 완주하지 못한 선수
	public static void main(String[] args) {
		String[] ps= {"mislav", "stanko", "mislav", "ana"};
		String[] cs= {"stanko", "ana", "mislav"};
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String p:ps) {
//			if(map.containsKey(p)) {
//				int add= map.get(p)+1;
//				map.put(p, add);
//			}else {
//				map.put(p, 1);
//			}
			map.put(p, map.getOrDefault(p, 0)+1);
		}
		System.out.println("map "+map);

		for(String c:cs) {
//			if(map.containsKey(c)) {
//				int minus= map.get(c)-1;
//				map.put(c, minus);
//			}
			map.put(c, map.get(c)-1);
		}
		System.out.println("map "+map);
		
		for(String k: map.keySet()) {
			if(map.get(k)>0) {
				System.out.println(k);
				break;
			}
		}
	}

}
