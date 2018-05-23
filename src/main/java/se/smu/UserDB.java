/**
 * title : UserDB.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 1.0.1.
 * since : 2018 - 05 - 07
 * brief : UserDB Ŭ����
 * -----------------------------------
 * history
 *   author  version     date                           brief
 *   ���ѵ�       0.0.0.   2018-05-18                       �ʾ� �ۼ�
 *   ���ѵ�       0.0.1.   2018-05-18                       ��Ÿ ����
 *   ���ѵ�       1.0.0.   2018-05-22             DBConn USE UserDB String �� ��ü
 *   ���ѵ�       1.0.1.   2018-05-23      DB ���� ���� �� Table�� ����, ���ʿ��� ��ĳ�� import ����
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class UserDB {
	public static void main(String[] args) {
		try {
			//Table ���� ���� ����
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			//Table ����
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
			st = cOnn.createStatement();
			rs = st.executeQuery("SELECT * FROM UserDB");
			rs.close();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}