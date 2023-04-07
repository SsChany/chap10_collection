package com.javalab.collection.pkg07_01;

import java.util.*;

public class HashMapMain {

	public static void main(String[] args) {
		
		//1. 과일 객체 생성
		Fruit Apple = new Fruit("Apple", 3000);
		Fruit Banna = new Fruit( "Banna", 3500);
		Fruit Orange = new Fruit("Orange", 4000);
		//Map<String, Integer> map = new HashMap<>();
		
		//2. 과일 객체를 담을 박스 객체 생성
		Box<Fruit> box = new Box<>();
		box.addItem(Apple);	//박스 객체에 과일 추가
		box.addItem(Banna);
		box.addItem(Orange);
		
		//3. 박스의 내용 확인
		//System.out.println(box.getItems());
		for (Fruit fruit : box.getItems()) {
			System.out.println(fruit.getName() + " \t " + fruit.getPrice());
		}
		System.out.println();
		
		//4. 야채 객체 생성
		//"시금치", 1500	변수명: 시금치
		//"양배추", 2500	변수명: 양배추
		//"대파", 3500	변수명: 대파
		Vegitable 시금치 = new Vegitable("시금치", 1500);
		Vegitable 양배추 = new Vegitable("양배추", 2500);
		Vegitable 대파 = new Vegitable("대파", 3500);
		
		//2. 야채 객체를 담을 박스 객체 생성
		Box<Vegitable> box2 = new Box<Vegitable>();
		box2.addItem(시금치);
		box2.addItem(양배추);
		box2.addItem(대파);
		
		for (Vegitable vegitable : box2.getItems()) {
			System.out.println(vegitable.getName() + " \t " +vegitable.getPrice());
		}
		System.out.println();
		
		
		
	}
}
