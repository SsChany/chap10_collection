package com.javalab.collection.pkg10;

public class Member {
	
	private String name; // 이름
	private String joinDate; // 가입일
	private String lastVisitDate; // 최종방문일
	private Integer numVisit; // 방문횟수
	private Character gender; // 성별
	private String age; // 연령대
	
	
	public Member(String name, String joinDate, String lastVisitDate, Integer numVisit, Character gender, String age) {
		super();
		this.name = name;
		this.joinDate = joinDate;
		this.lastVisitDate = lastVisitDate;
		this.numVisit = numVisit;
		this.gender = gender;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}


	public String getLastVisitDate() {
		return lastVisitDate;
	}


	public void setLastVisitDate(String lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}


	public Integer getNumVisit() {
		return numVisit;
	}


	public void setNumVisit(Integer numVisit) {
		this.numVisit = numVisit;
	}


	public Character getGender() {
		return gender;
	}


	public void setGender(Character gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Member [name=" + name + ", joinDate=" + joinDate + ", lastVisitDate=" + lastVisitDate + ", numVisit="
				+ numVisit + ", gender=" + gender + ", age=" + age + "]";
	}


	
	
	
	
}
