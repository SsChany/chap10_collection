package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArrayList01 {
	
	public static void main(String[] args) {
		
		//ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();	//10칸짜리 String 담을 공간 확보 //10칸넘어가면 알아서추가됨
		
		//값 저장
		fruits.add("apple");	//"apple" String type
		fruits.add("banana");
		fruits.add("orange");
		
		//크기 조회
		int size = fruits.size();
		System.out.println("Arraylist 사이즈:" + size);
		System.out.println();
		
		//인덱스르 이용한 값 조회
		String fruit = fruits.get(1);	//()안에 숫자는 인덱스 숫자
		System.out.println("인덱스 1 : " + fruit);
		System.out.println();
		
		//반복(iterate) for-each loop
		System.out.println("요소 조회:");
		for (String f : fruits) {
			System.out.println(f);
		}
		System.out.println();
		
		//바나나 삭제
		fruits.remove("banana");
		System.out.println("Elements of the ArrayList after remival:");
		for (String f : fruits) {
			System.out.print(f+" ");
		}
	}
}
