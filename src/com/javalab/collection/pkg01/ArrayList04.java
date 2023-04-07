package com.javalab.collection.pkg01;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 ** [Raw Data]
   "제목1", "내용1", "글쓴이1"
   "제목2", "내용2", "글쓴이2"
   "제목3", "내용3", "글쓴이3"
   "제목4", "내용4", "글쓴이4"
   "제목5", "내용5", "글쓴이5" 
 */
public class ArrayList04 {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : "+size);
		System.out.println();
		
		//2번째 인덱스의 객체 가져와서 출력하기
		Board board = list.get(2);
		//System.out.println("2번째 인덱스 :" + board.getSubject() + board.getContent() + board.getWriter());
		System.out.println(board.toString());	
	
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent()+ "\t" + b.getWriter());
		}
		System.out.println();
		
		//특정 인덱스의 객체 가져오기
		
		//객체 삭제
		list.remove(2);	//배열 중간을 삭제하면 중간을 비우지않고 밀리거나 매꿔준다	공간을 비우지않음
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject() + "\t" + b.getContent()+ "\t" + b.getWriter());
		}
		System.out.println();
		
		//"제목11", "내용11", "글쓴이11" <- list 인덱스 1번에 넣으세요
		list.set(1, new Board("제목11", "내용11", "글쓴이11"));	//새로넣으면 밀리지않고 갱신됨
		for (Board board1 : list) {
			System.out.println(board1.toString());
		}
		
	}// main end
}

class Board{
	private String subject; 
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
		
	
	
}