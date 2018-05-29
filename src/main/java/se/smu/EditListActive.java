/**
 * title : EditListActive.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : to do 항목 수정 실제 실행 클래스
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   김한동       0.0.0.    2018-05-30                     초안 작성
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class EditListActive {
	static String todoName;
	static String subjectName;
	static int deadLineYear;
	static int deadLineMonth;
	static int deadLineDay;
	static int endYear;
	static int endMonth;
	static int endDay;
	static int completeRate;
	static int importantRate;
	static int alarmCheck;
	
	static String inputtodoName;
	static String inputsubjectName;
	static int inputdeadLineYear;
	static int inputdeadLineMonth;
	static int inputdeadLineDay;
	static int inputendYear;
	static int inputendMonth;
	static int inputendDay;
	static int inputcompleteRate;
	static int inputimportantRate;
	static int inputalarmCheck;
	
public EditListActive(String inputtodoName, String inputsubjectName, int inputdeadLineYear, int inputdeadLineMonth, int inputdeadLineDay, int inputendYear, int inputendMonth, int inputendDay, int  inputcompleteRate, int inputimportantRate, int inputalarmCheck) {
		
		this.inputtodoName = inputtodoName;
		this.inputsubjectName = inputsubjectName;
		this.inputdeadLineYear = inputdeadLineYear;
		this.inputdeadLineMonth = inputdeadLineMonth;
		this.inputdeadLineDay = inputdeadLineDay;
		this.inputendYear = inputendYear;
		this.inputendMonth = inputendMonth;
		this.inputendDay = inputendDay;
		this.inputcompleteRate = inputcompleteRate;
		this.inputimportantRate = inputimportantRate;
		this.inputalarmCheck = inputalarmCheck;
		
		try {
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			sQl = "USE TodoDB";
			st.execute(sQl);
			rs = st.executeQuery("SELECT * FROM TodoData");
			
			while(rs.next()) {
				todoName = rs.getString("TodoName");
				subjectName = rs.getString("Subject");
				deadLineYear = Integer.parseInt(rs.getString("DeadLineYear"));
				deadLineMonth = Integer.parseInt(rs.getString("DeadLineMonth"));
				deadLineDay = Integer.parseInt(rs.getString("DeadLineDay"));
				endYear = Integer.parseInt(rs.getString("EndYear"));
				endMonth = Integer.parseInt(rs.getString("EndMonth"));
				endDay = Integer.parseInt(rs.getString("EndDay"));
				completeRate = Integer.parseInt(rs.getString("CompleteRate"));
				importantRate = Integer.parseInt(rs.getString("ImportantRate"));
				alarmCheck = Integer.parseInt(rs.getString("AlarmCheck"));
				
				if(inputtodoName.equals(todoName))
				{
					sQl = "UPDATE TodoData SET Subject = " + "\'" + inputsubjectName + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET DeadLineYear = " + "\'" + inputdeadLineYear + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET DeadLineMonth = " + "\'" + inputdeadLineMonth + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET DeadLineDay = " + "\'" + inputdeadLineDay + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET EndYear = " + "\'" + inputendYear + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET EndMonth = " + "\'" + inputendMonth + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET CompleteRate = " + "\'" + inputcompleteRate + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET ImportantRate = " + "\'" + inputimportantRate + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					sQl = "UPDATE TodoData SET AlarmCheck = " + "\'" + inputalarmCheck + "\'" + "WHERE TodoName ="
							+ "\'" + todoName + "\'";
					st.execute(sQl);
					
					//rs = st.executeQuery("SELECT * FROM SubjectData");
				}
			}
			
			rs.close();
			st.close();
			
		} catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EditListActive(inputtodoName, inputsubjectName, inputdeadLineYear+2018, inputdeadLineMonth+1, inputdeadLineDay+1, inputendYear+2018, inputendMonth+1, inputendDay+1, inputcompleteRate*2, inputimportantRate*2, inputalarmCheck);
	}
}
