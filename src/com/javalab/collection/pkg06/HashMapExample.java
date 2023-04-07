package com.javalab.collection.pkg06;

import java.util.*;

//key는 중복되면안됨 유니크하게 구분해야함

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);	//제외
		map.put("동장군", 80);
		map.put("홍길동", 95);	//나중에 들어온게 된다
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";			
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println( );
		
		//키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();	// 모든 킬르 Set 컬렉션에 담아서 반환
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();	// k의 type은 String(이름)
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
			
		}
		System.out.println();
		
		//키로 엔트리 삭제
		//map.remove("홍길동");
		Integer score = map.remove("홍길동");	//삭제된 키와 매핑되는 값을 반환
		System.out.println("score : " + score);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}
}
