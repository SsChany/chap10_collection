package com.javalab.collection.pkg01;

import java.util.ArrayList;

public class ArraiList03 {

	public static void main(String[] args) {
		
		ArrayList<Person> people = new ArrayList<>();
		
		Person person1 = new Person("john",25);
		Person person2 = new Person("Sarah",30);
		
		people.add(person1);
		people.add(person2);
		
		//추가 인원
		//"Mike", 27
		//"Jane", 18
		people.add(new Person("Mike", 27));	//바로객체추가
		people.add(new Person("Jane", 18));	//바로객체추가
		
		//향상된 for문
		for (Person person : people) {
			System.out.println(person.getName() + " is " + person.getAge() + " years old");
		}
		System.out.println();
		
		//일반 for문
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i).getName()+" is " + people.get(i).getAge()+ " years old");
		}
	}
}

/*
 * Person 클래스
 * @return
 */
class Person {// public은 위에 클래스꺼만 붙여야된다
	private String name;
	private int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}