/**
 * title : UserDB.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 1.0.1.
 * since : 2018 - 05 - 07
 * brief : UserDB 클래스
 * -----------------------------------
 * history
 *   author  version     date                           brief
 *   김한동       0.0.0.   2018-05-18                       초안 작성
 *   김한동       0.0.1.   2018-05-18                       오타 수정
 *   김한동       1.0.0.   2018-05-22             DBConn USE UserDB String 값 대체
 *   김한동       1.0.1.   2018-05-23      DB 직접 접속 후 Table로 접근, 불필요한 스캐너 import 삭제
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class UserDB {
	public static void main(String[] args) {
		try {
			//Table 접속 변수 선언
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			//Table 접속
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