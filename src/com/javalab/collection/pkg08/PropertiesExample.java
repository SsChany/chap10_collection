package com.javalab.collection.pkg08;

import java.util.Properties;
/*
 * Properties
 * -hashTable의 자식 (하위 클래스)로서 hashTable 특징을 갖고있음
 * -key와 value가 Sting type 이어야함.
 * -key와 value가 "="로 매핑되어 있다.
 */
public class PropertiesExample {

   public static void main(String[] args) throws Exception{
      //Properties 컬렉션 생성
      Properties properties = new Properties();
      
      // PropertiesExample.class와 동일한 ClassPath에 있는
      // database.properties 파일 로드
      // getResourceAsSteam : 주어진 상대 경로의 리소스를 읽는 InputStream 반환
      properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
      
      // 주어진 키에 대한 값 읽기	//key부분  = value부분
      String driver = properties.getProperty("driver");
      String url = properties.getProperty("url");
      String username = properties.getProperty("username");
      String password = properties.getProperty("password");
      
      // 값 출력
      System.out.println("driver : " + driver);
      System.out.println("url : " + url);
      System.out.println("username : " + username);
      System.out.println("password : " + password);

   }

}