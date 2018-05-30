/**
 * title : DBConn.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 3.0.0.
 * since : 2018 - 05 - 07
 * brief : DB 연동 클래스
 * -----------------------------------
 * history
 *   author  version     date                      brief
 *   김한동       0.0.1.   2018-05-15                  초안 작성
 *   김한동       0.0.2.   2018-05-16             데이터베이스 연결자 통합
 *   김한동       1.0.0.   2018-05-23                DB에 직접 접속
 *   김한동       2.0.0.   2018-05-24    DB 접속 시 Insert문에 오류 발생하여 URL 수정
 *   김한동       3.0.0.   2018-05-30                 최종본 작성
 * -----------------------------------
 */

package ㄴe.smu;

public class DBConn {
	public static String forName = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
	
	//test DB에 직접 접속하여 table로 데이터를 다루는 코드
	//public static String URL = "jdbc:mysql://localhost:3306/test";

	public static String ID = "root";
	public static String PW = "1q2w3e4r";
}