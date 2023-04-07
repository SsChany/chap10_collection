package com.javalab.collection.pkg07;

import java.util.*;

public class StudentCollectionMain {

	public static void main(String[] args) {

		Student stu1 = new Student(1, "John", 87);
		Student stu2 = new Student(2, "Mary", 90);
		Student stu3 = new Student(3, "Bob", 85);

		// ArrayList
		System.out.println("===============ArrayList==================");
		ArrayList<Student> studentListist = new ArrayList<>();
		studentListist.add(stu1);
		studentListist.add(stu2);
		studentListist.add(stu3);

		for (Student student : studentListist) {
			System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getScore());
			// System.out.println(student.toString());
		}
		System.out.println();

		// Set
		System.out.println("===================Set====================");
		Set<Student> students = new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		students.add(stu3); // 중복무시됨 //Set의 가장큰 특징 : 중복을 허용하지 않음

		for (Student student : students) {
			// System.out.println(student.toString());
			System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getScore());
		}
		System.out.println();

		// 반복자를 통한 출력
		Iterator<Student> iter = students.iterator();
		while (iter.hasNext()) {
			Student stu = iter.next();
			System.out.println(stu.getStudentId());
		}

		// 3. HashMap <Key, Value>
		System.out.println("=================HashMap==================");
		Map<Integer, Student> map = new HashMap<>();
		// map에 학생 객체 저장(추가)
		map.put(stu1.getStudentId(), stu1);
		map.put(stu2.getStudentId(), stu2);
		map.put(stu3.getStudentId(), stu3);
		for (Integer key : map.keySet()) { // key를 담고 있는 Set 반환
			System.out.println(
					map.get(key).getStudentId() + " " + map.get(key).getName() + " " + map.get(key).getScore());
			// System.out.println(key + " - " + map.get(key).toString());

		}
		System.out.println();

		Set<Integer> key = map.keySet(); // Set<K> //1. 키만 선별해서 Set<K> 반환
		Iterator<Integer> sIter = key.iterator(); // 반복자 얻음
		while (sIter.hasNext()) {
			Integer k = sIter.next();
			System.out.println(map.get(k).getStudentId() + " " + map.get(k).getName() + " " + map.get(k).getScore());
			System.out.println(k + " - " + map.get(k).toString());
		}

	}

}
