/**
 * title : DBConn.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.0.
 * since : 2018 - 05 - 07
 * brief : DB 연동 String
 * -----------------------------------
 * history
 *   author  version     date              brief
 *   김한동       0.0.1.   2018-05-15          초안 작성
 *   김한동       0.0.2.   2018-05-16     데이터베이스 연결자 통합
 *   김한동       1.0.0.   2018-05-23        DB에 직접 접속
 * -----------------------------------
 */

package se.smu;

public class DBConn {
	//접속할 DB 정보
	public static String forName = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306/test";
	
	//DB 로그인 정보
	public static String ID = "root";
	public static String PW = "1q2w3e4r";
}