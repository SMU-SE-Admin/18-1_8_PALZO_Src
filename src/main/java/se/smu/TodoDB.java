/**
 * title : TodoDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : TodoDB 클래스
 * -----------------------------------
 * history
 *   author  version     date              brief
 *   김한동       0.0.0.   2018-05-18          초안 작성
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
				// 기본 변수 선언
				int nUllcheck = 0;
				String dAtabase;
				Scanner iN = new Scanner(System.in);
				Connection cOnn = null;
				String sQl;
				Statement st = null;
				PreparedStatement pst = null;
				ResultSet rs = null;
		
				// DB 연결
				Class.forName(DBConn.forName);
				cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
				
				st = cOnn.createStatement();
				rs = st.executeQuery("SHOW DATABASES");
				
				// DB에 UserDB가 존재하는지 확인
				while(rs.next()) {
					dAtabase = rs.getString("TODODB");
					if(dAtabase.equals("TodoDB"))
						nUllcheck = 1;
				}
				
				// DB가 존재하지 않을 경우 DB 생성
				if(nUllcheck == 0) {
					sQl = "CREATE DATABASE TodoDB";
					st.execute(sQl);
					sQl = "USE TodoDB";
					st.execute(sQl);
					sQl = "CREATE TABLE TodoData (todoname char(20), endday(20), realendday(20), complete(10), importance(10), alarm(5))";
					st.execute(sQl);
				}
				
				// DB가 존재할 경우 DB에 입력
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