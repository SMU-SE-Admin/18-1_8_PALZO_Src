/**
 * title : DBConn.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 0.0.1.
 * since : 2018 - 05 - 07
 * brief : DB ���� String
 * -----------------------------------
 * history
 *   author  version     date              breif
 *   ���ѵ�       0.0.1.   2018-05-15          �ʾ� �ۼ�
 *   ���ѵ�       0.0.2.   2018-05-16     �����ͺ��̽� ������ ����
 *   
 *   
 * -----------------------------------
 */

package se.smu;

public class DBConn {
	//������ DB ����
	public static String forName = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306";
	
	//DB �α��� ����
	public static String ID = "root";
	public static String PW = "1q2w3e4r";
	
	//������ DB ����
	public static String USERDB = "USE UserDB";
	public static String SUBJECTDB = "USE SubjectDB";
	public static String TODODB = "USE TodoDB";
}
