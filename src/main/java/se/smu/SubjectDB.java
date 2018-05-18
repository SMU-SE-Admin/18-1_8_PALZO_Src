/**
 * title : SubjectDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : SubjectDB 클래스
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

public class SubjectDB {
	void SubjectTable(String subname, String prof, String subday, String subtime, String subyear, String subsem, String subroom) {
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
					dAtabase = rs.getString("SUBJECTDB");
					if(dAtabase.equals("SubjectDB"))
						nUllcheck = 1;
				}
				
				// DB가 존재하지 않을 경우 DB 생성
				if(nUllcheck == 0) {
					sQl = "CREATE DATABASE SubjectDB";
					st.execute(sQl);
					sQl = "USE SubjectDB";
					st.execute(sQl);
					sQl = "CREATE TABLE SubjectData (subname char(20), prof char(10), subday char(10), subtime char(10), subyear char(5), subsem char(5), subroom(10))";
					st.execute(sQl);
				}
				
				// DB가 존재할 경우 DB에 입력
				else {
					sQl = "USE SubjcetDB";
					sQl = "INSERT INTO SubjectData (subname char(20), prof char(10), subday char(10), subtime char(10), subyear char(5), subsem char(5), subroom(10))";
					pst = cOnn.prepareStatement(sQl);
					rs = pst.executeQuery("SELECT * FROM SubjectData");
				}
				
				pst.setString(1, subname);
				pst.setString(2, prof);
				pst.setString(3, subday);
				pst.setString(4, subtime);
				pst.setString(5, subyear);
				pst.setString(6, subsem);
				pst.setString(7, subroom);
				pst.executeUpdate();
				
				rs.close();
				pst.close();
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SubjectDB();
	}
}