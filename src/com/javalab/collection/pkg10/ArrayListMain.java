package com.javalab.collection.pkg10;

import java.util.*;

public class ArrayListMain {
	public static void main(String[] args) {

		// [문제.1] 1,2,3,4,5,6,7,8,9,10 을 갖는 ArrayList를 생성하고 값을 출력하세요.

		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(new Integer(1));
//		list.add(new Integer(2));
//		list.add(new Integer(3));
//		list.add(new Integer(4));
//		list.add(new Integer(5));
//		list.add(new Integer(6));
//		list.add(new Integer(7));
//		list.add(new Integer(8));
//		list.add(new Integer(9));
//		list.add(new Integer(10));

		for (int i = 1; i < 11; i++) {
				list.add(i);
		}
		for (Integer integer : list) {
			System.out.print(integer+" ");
		}
		System.out.println();
		
		// [문제.2] 다음 값을 갖는 ArrayList를 생성하고 값을 출력하세요.
		//	Volvo
		//	Benz
		//	BMW
		//	Hyundai
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(new String("Volvo"));
		list2.add(new String("Benz"));
		list2.add(new String("BMW"));
		list2.add(new String("Hyundai"));
		
		for (String string : list2) {
			System.out.println(string);
		}
		System.out.println();
		
		//[문제.3] 다음 raw data를 담을 수 있는 Student 클래스를 설계하고 객체를 생성하여 ArrayList에 담고 출력하세요.
		ArrayList<Student> list3 = new ArrayList<>();
		list3.add(new Student("1234", "123456-1234567", "홍길동", 3, "천안", 210));
		list3.add(new Student("5678", "987456-2334567", "김길동", 4, "대전", 220));
		list3.add(new Student("8970", "357556-2334789", "이길동", 1, "서울", 230));
		
		for (Student student : list3) {
			//System.out.println(student.toString());
			System.out.println(student.getStudentId()+"\t"+student.getJumin()+"\t"+student.getName()+"\t"+student.getYear()+"\t"+student.getJuso()+"\t"+student.getDepartment());
		}
		
		
		


		
		
		
		
		

	}
}