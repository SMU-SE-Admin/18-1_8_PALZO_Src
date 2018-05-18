/**
 * title : TodoDB.java
 * author : ���ѵ� (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : TodoDB Ŭ����
 * -----------------------------------
 * history
 *   author  version     date              brief
 *   ���ѵ�       0.0.0.   2018-05-18          �ʾ� �ۼ�
 *      
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.util.Scanner;

public class TodoDB {
	void TodoTable(String todoname, String endday, String realendday, String complete, String importance, String alarm) {
		try {
				// �⺻ ���� ����
				int nUllcheck = 0;
				String dAtabase;
				Scanner iN = new Scanner(System.in);
				Connection cOnn = null;
				String sQl;
				Statement st = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
		
				// DB ����
				Class.forName(DBConn.forName);
				cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
				
				st = cOnn.createStatement();
				rs = st.executeQuery("SHOW DATABASES");
				
				// DB�� UserDB�� �����ϴ��� Ȯ��
				while(rs.next()) {
					dAtabase = rs.getString("TODODB");
					if(dAtabase.equals("TodoDB"))
						nUllcheck = 1;
				}
				
				// DB�� �������� ���� ��� DB ����
				if(nUllcheck == 0) {
					sQl = "CREATE DATABASE TodoDB";
					st.execute(sQl);
					sQl = "USE TodoDB";
					st.execute(sQl);
					sQl = "CREATE TABLE TodoData (todoname char(20), endday(20), realendday(20), complete(10), importance(10), alarm(5))";
					st.execute(sQl);
				}
				
				// DB�� ������ ��� DB�� �Է�
				else {
					sQl = "USE TodoDB";
					sQl = "INSERT INTO TodoData (todoname char(20), endday char(20), realendday char(20), complete char(10), importance char(10), alarm char(5))";
					pst = cOnn.prepareStatement(sQl);
					rs = pst.executeQuery("SELECT * FROM TodoData");
				}
				
				pst.setString(1, todoname);
				pst.setString(2, endday);
				pst.setString(3, realendday);
				pst.setString(4, complete);
				pst.setString(5, importance);
				pst.setString(6, alarm);
				pst.executeUpdate();
				
				rs.close();
				pst.close();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TodoDB();
	}
}