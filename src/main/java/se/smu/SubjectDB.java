/**
 * title : SubjectDB.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 2.0.0.
 * since : 2018 - 05 - 07
 * brief : SubjectDB Ŭ����
 * -----------------------------------
 * history
 *   author  version     date                           brief
 *   ���ѵ�       0.0.0.   2018-05-18                       �ʾ� �ۼ�
 *   ���ѵ�       1.0.0.   2018-05-22             DBConn USE UserDB String �� ��ü
 *   ���ѵ�       1.0.1.   2018-05-23      DB ���� ���� �� Table�� ����, ���ʿ��� ��ĳ�� import ����
 *   ���ѵ�       2.0.0.   2018-05-25               Table ���� �� �߻��ϴ� ���� �ذ�
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class SubjectDB {
	void SubjectData(String Subject, String Professor, int subjectYear, int subjectSem, String subjectDate, int subjectStart, int subjectEnd, String room) {
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
				if(dataBase.equals("subjectdb"))
					checkNull = 1;
			}
			
			if(checkNull == 0) {
				sQl = "CREATE DATABASE subjectDB";
				st.execute(sQl);
				sQl = "USE SubjectDB";
				st.execute(sQl);
				sQl = "CREATE TABLE SubjectData(Subject char(20) NOT NULL PRIMARY KEY, Professor char(10) NOT NULL, "
						+ "subjectYear int(5) NOT NULL, subjectSem int(5) NOT NULL, subjectDate char(5) NOT NULL, "
						+ "subjectStart int(5) NOT NULL, subjectEnd int(5) NOT NULL, room char(10) NOT NULL)";
				st.execute(sQl);
			}
			
			else {
				sQl = "USE SubjectDB";
				st.execute(sQl);
				
				sQl = "INSERT INTO SubjectData(Subject, Professor, subjectYear, subjectSem, subjectDate, subjectStart, subjectEnd, room) "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
				pst = cOnn.prepareStatement(sQl);
				
				pst.setString(1, Subject);
				pst.setString(2, Professor);
				pst.setInt(3, subjectYear);
				pst.setInt(4, subjectSem);
				pst.setString(5, subjectDate);
				pst.setInt(6, subjectStart);
				pst.setInt(7, subjectEnd);
				pst.setString(8, room);
				pst.executeUpdate();
				
				rs = pst.executeQuery("SELECT * FROM SubjectData");
			}
			
			rs.close();
			pst.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SubjectDB();
	}
}