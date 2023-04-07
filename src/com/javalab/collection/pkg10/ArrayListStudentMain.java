package com.javalab.collection.pkg10;

import java.util.*;

public class ArrayListStudentMain {

	public static void main(String[] args) {

		// 기본데이터
		String[] member2 = new String[10];
		member2[0] = "임재,20190509,20190510,8,남,30대후반";
		member2[1] = "성열,20190509,20190510,1,남,30대중반";
		member2[2] = "천재,20190509,20190510,3,남,30대초반";
		member2[3] = "현수,20190509,20190509,1,남,20대후반";
		member2[4] = "진우,20190509,20190510,2,남,30대초반";
		member2[5] = "영수,20190509,20190510,2,여,40대후반";
		member2[6] = "종화,20190509,20190509,0,남,20대후반";
		member2[7] = "윤정,20190509,20190510,3,여,40대후반";
		member2[8] = "종호,20190509,20190510,3,남,20대중반";
		member2[9] = "동현,20190509,20190510,5,남,20대중반";

		// 기본데이터를 가공하여 Member 객체로 만들고 저장할 ArrayList생성
		ArrayList<Member> list = new ArrayList<>();

		// 기본 데이털르 반복문을 통해서 Member 객체로 생성
		for (int i = 0; i < member2.length; i++) {
			String[] arr = member2[i].split(",");
			int numVisit = Integer.parseInt(arr[3]);
			char gender = arr[4].charAt(0);
			list.add(new Member(arr[0], arr[1], arr[2], numVisit, gender, arr[5]));
		}
		// 2. 이름이 "천재"인 회원을 찾고 별도의 메소드를 통해서 해당 회원을 출력하세요.
		printMember(list);
		System.out.println();

		// 3. 전체 회원을 출력해주는 메소드를 만드세요.
		printAllMember(list);
		System.out.println();
		// 4. 30대인 회원들을 찾아주는 메소드를 만들고 ArrayList에 담아서 반환하세요.
		// 반환받은 리스트를 main 메소드에서 출력하세요.
		List<Member> members30List = printThirtyMember(list);
		for (Member member21 : members30List) {
			System.out.println(member21.getName() + "\t" + member21.getJoinDate() + "\t" + member21.getLastVisitDate()
					+ "\t" + member21.getNumVisit() + "\t" + member21.getGender() + "\t" + member21.getAge());
		}
		System.out.println();
		// 5. 20대 후반들의 방문 회수를 구해주는 메소드를 만들어서 값을 반환받고 출력하세요.
		int count = printGetCount20(list);
		System.out.println(count);
	} // end of main

	private static int printGetCount20(ArrayList<Member> list) {
		int count = 0;
		for (Member member : list) {
			if (member.getAge().equals("20대후반")) {
				count += member.getNumVisit();

			}
		}
		return count;
	}

	private static ArrayList<Member> printThirtyMember(ArrayList<Member> list) {
		ArrayList<Member> members30List = new ArrayList<Member>();
		for (Member member : list) {
			String ageTest = member.getAge().substring(0, 2);
			if (Integer.parseInt(ageTest) == 30) {
				members30List.add(member);
			}
		}
		return members30List;
	}

	private static void printAllMember(ArrayList<Member> list) {
		for (Member member : list) {
			System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate() + "\t"
					+ member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
		}
	}

	private static void printMember(ArrayList<Member> list) {
		for (Member member : list) {
			if (member.getName().equals("천재")) {
				System.out.println(member.getName() + "\t" + member.getJoinDate() + "\t" + member.getLastVisitDate()
						+ "\t" + member.getNumVisit() + "\t" + member.getGender() + "\t" + member.getAge());
			}
		}
	}

}// end of class
