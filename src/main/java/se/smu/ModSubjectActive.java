/**
 * title : ModSubjectActive.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 0.0.0.
 * since : 2018 - 05 - 07
 * brief : 과목 항목 수정 실제 실행 클래스
 * -----------------------------------
 * history
 *   author  version     date                          brief
 *   김한동       0.0.0.    2018-05-29                      초안 작성
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;

public class ModSubjectActive {
	static String subjectName;
	static String professorName;
	static String subjectYearName;
	static String subjectSemName;
	static String subjectDateName;
	static String subjectStartName;
	static String subjectEndName;
	static String subjectRoomName;
	
	static String inputSubject;
	static String inputProfessor;
	static String inputSubjectYear;
	static String inputSubjectSem;
	static String inputSubjectDate;
	static String inputSubjectStart;
	static String inputSubjectEnd;
	static String inputSubjectRoom;
	
	public ModSubjectActive(String inputSubject, String inputProfessor, String inputSubjectYear, String inputSubjectSem, String inputSubjectDate, String inputSubjectStart, String inputSubjectEnd, String inputSubjectRoom) {
		
		this.inputSubject = inputSubject;
		this.inputProfessor = inputProfessor;
		this.inputSubjectYear = inputSubjectYear;
		this.inputSubjectSem = inputSubjectSem;
		this.inputSubjectDate = inputSubjectDate;
		this.inputSubjectStart = inputSubjectStart;
		this.inputSubjectEnd = inputSubjectEnd;
		this.inputSubjectRoom = inputSubjectRoom;
		
		try {
			String sQl;
			Connection cOnn = null;
			Statement st = null;
			ResultSet rs = null;
			
			Class.forName(DBConn.forName);
			cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
			
			st = cOnn.createStatement();
			sQl = "USE SubjectDB";
			st.execute(sQl);
			rs = st.executeQuery("SELECT * FROM SubjectData");
			
			while(rs.next()) {
				subjectName = rs.getString("Subject");
				professorName = rs.getString("Professor");
				subjectYearName = rs.getString("subjectYear");
				subjectSemName = rs.getString("subjectSem");
				subjectDateName = rs.getString("subjectDate");
				subjectStartName = rs.getString("subjectStart");
				subjectEndName = rs.getString("subjectEnd");
				subjectRoomName = rs.getString("room");
				
				if(inputSubject.equals(subjectName))
				{
					sQl = "UPDATE SubjectData SET Subject = " + "\'" + inputSubject + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET Professor = " + "\'" + inputProfessor + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET subjectYear = " + "\'" + inputSubjectYear + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET subjectSem = " + "\'" + inputSubjectSem + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET subjectDate = " + "\'" + inputSubjectDate + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET subjectStart = " + "\'" + inputSubjectStart + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET subjectEnd = " + "\'" + inputSubjectEnd + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
					st.execute(sQl);
					sQl = "UPDATE SubjectData SET room = " + "\'" + inputSubjectRoom + "\'" + "WHERE Subject ="
							+ "\'" + subjectName + "\'";
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
		new ModSubjectActive(inputSubject, inputProfessor, inputSubjectYear, inputSubjectSem, inputSubjectDate, inputSubjectStart, inputSubjectEnd, inputSubjectRoom);
	}
}
