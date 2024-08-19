package com.space.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("naver", "www.naver.com");
		map.put("gg", "www.gg.com");
		map.put("daum", "www.daum.net");
		
		//System.out.println(map.get("naver"));
		
		Set<String> set = map.keySet();
		
		for (String str : set) {
			System.out.println(map.get(str));
		}
		
		//학생번호, 학생이름
		Map<Integer, String> map2 = new Hashtable<Integer, String>();
		
		map2.put(1, "최용준");
		map2.put(2, "최성진");
		map2.put(3, "박재연");
		
		//학생이름 모두 출력해주세요.
		
		Properties properties = new Properties();
		
		properties.setProperty("version", "1.0");
		System.out.println(properties.get("version"));
		
		
	}
}














