/**
 * title : DBConn.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 3.0.0.
 * since : 2018 - 05 - 07
 * brief : DB ���� Ŭ����
 * -----------------------------------
 * history
 *   author  version     date                      brief
 *   ���ѵ�       0.0.1.   2018-05-15                  �ʾ� �ۼ�
 *   ���ѵ�       0.0.2.   2018-05-16             �����ͺ��̽� ������ ����
 *   ���ѵ�       1.0.0.   2018-05-23                DB�� ���� ����
 *   ���ѵ�       2.0.0.   2018-05-24    DB ���� �� Insert���� ���� �߻��Ͽ� URL ����
 *   ���ѵ�       3.0.0.   2018-05-30                 ������ �ۼ�
 * -----------------------------------
 */

package ��e.smu;

public class DBConn {
	public static String forName = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
	
	//test DB�� ���� �����Ͽ� table�� �����͸� �ٷ�� �ڵ�
	//public static String URL = "jdbc:mysql://localhost:3306/test";

	public static String ID = "root";
	public static String PW = "1q2w3e4r";
}