/**
 * title : TodoDB.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 2.0.0.
 * since : 2018 - 05 - 07
 * brief : TodoDB Ŭ����
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   ���ѵ�       0.0.0.   2018-05-18                      �ʾ� �ۼ�
 *   ���ѵ�       1.0.0.   2018-05-22             DBConn USE UserDB String �� ��ü
 *   ���ѵ�       1.0.1.   2018-05-23      DB ���� ���� �� Table�� ����, ���ʿ��� ��ĳ�� import ����
 *   ���ѵ�       2.0.0.   2018-05-25          Table ���� �� �߻��ϴ� ���� �ذ�
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class TodoDB {
	void TodoData(String TodoName, String Subject, int DeadLineYear, int DeadLineMonth, int DeadLineDay, int EndYear, int EndMonth, int EndDay, int CompleteRate, int ImportantRate, int AlarmCheck) {
		try {
			int checkNull = 0;
			String dataBase;
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			rs = st.executeQuery("SHOW DATABASES");
			
			while(rs.next()) {
				dataBase = rs.getString("Database");
				if(dataBase.equals("tododb"))
					checkNull = 1;
			}
			
			if(checkNull == 0) {
				sQl = "CREATE DATABASE TodoDB";
				st.execute(sQl);
				sQl = "USE TodoDB";
				st.execute(sQl);
				sQl = "CREATE TABLE TodoData"
						+ "(TodoName char(20) NOT NULL PRIMARY KEY, Subject char(20) NOT NULL, "
						+ "DeadLineYear int(5) NOT NULL, DeadLineMonth int(5) NOT NULL, DeadLineDay int(5) NOT NULL, "
						+ "EndYear int(5) NOT NULL, EndMonth int(5) NOT NULL, EndDay int(5) NOT NULL, "
						+ "CompleteRate int(5) NOT NULL, ImportantRate int(5), AlarmCheck int(5) NOT NULL)";
				st.execute(sQl);
			}
			
			else {
				sQl = "USE TodoDB";
				st.execute(sQl);
				
				sQl = "INSERT INTO TodoData(TodoName, Subject, DeadLineYear, DeadLineMonth, DeadLineDay, EndYear, EndMonth, EndDay, CompleteRate, ImportanceRate, AlarmCheck) "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				pst = cOnn.prepareStatement(sQl);
				
				pst.setString(1, TodoName);
				pst.setString(2, Subject);
				pst.setInt(3, DeadLineYear);
				pst.setInt(4, DeadLineMonth);
				pst.setInt(5, DeadLineDay);
				pst.setInt(6, EndYear);
				pst.setInt(7, EndMonth);
				pst.setInt(8, EndDay);
				pst.setInt(9, CompleteRate);
				pst.setInt(10, ImportantRate);
				pst.setInt(11, AlarmCheck);
				pst.executeUpdate();
				
				rs = pst.executeQuery("SELECT * FROM TodoData");
			}
			
			rs.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TodoDB();
	}
}