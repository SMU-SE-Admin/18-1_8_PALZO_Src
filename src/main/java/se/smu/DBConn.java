/**
 * title : DBConn.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.1.
 * since : 2018 - 05 - 07
 * brief : DB 연동 String
 * -----------------------------------
 * history
 *   author  version     date              breif
 *   김한동       0.0.1.   2018-05-15          초안 작성
 *   김한동       0.0.2.   2018-05-16     데이터베이스 연결자 통합
 *   
 *   
 * -----------------------------------
 */

package se.smu;

public class DBConn {
	//접속할 DB 정보
	public static String forName = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306";
	
	//DB 로그인 정보
	public static String ID = "root";
	public static String PW = "1q2w3e4r";
	
	//각각의 DB 정의
	public static String USERDB = "USE UserDB";
	public static String SUBJECTDB = "USE SubjectDB";
	public static String TODODB = "USE TodoDB";
}
