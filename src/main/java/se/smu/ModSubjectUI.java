/**
 * title : ModSubjectUI.java
 * author : 김한동 (aggsae@gmail.com)
 * version : 5.0.0.
 * since : 2018 - 05 - 07
 * brief : 과목 항목 수정 UI
 * -----------------------------------
 * history
 *   author  version     date                               brief
 *   안동주       0.0.0.   2018-05-22                           초안 작성
 *   김한동       1.0.0.   2018-05-25                       패키지 추가, 주석 작성
 *   김한동       2.0.0.   2018-05-28              textpane 부분 label 로 수정, 버튼 기능 활성화
 *   김한동       3.0.0.   2018-05-29                    실제 수정 기능 클래스로 따로 구현
 *   김한동       3.1.0.   2018-05-29          기존 저장된 과목명을 통해 과목을 확인하고 수정할 수 있는 기능 구현
 *   김한동       3.2.0.   2018-05-29                       삭제 버튼 및 기능 추가
 *   김한동       3.2.1.   2018-05-29               과목 삭제 시 해당 todo도 삭제되는 부분 주석 추가
 *   김한동       3.2.2.   2018-05-30                   과목 삭제 메세지 출력, todo 삭제 주석 삭제
 *   김한동       4.0.0.   2018-06-01                       중복과목에 대한 처리
 *   김한동       5.0.0.   2018-06-01                           최종본 작성
 * -----------------------------------
 */

package se.smu;

import se.smu.*;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class ModSubjectUI extends JFrame {
	static String subjectBtnName;
	//DB에서 수정할 항목 불러올 변수
	static String subjectName;
	static String professorName;
	static String subjectYearName;
	static String subjectSemName;
	static String subjectDateName;
	static String subjectStartName;
	static String subjectEndName;
	static String subjectRoomName;
	//수정할 내용 입력받을 변수
	static String inputSubject;
	static String inputProfessor;
	static String inputSubjectYear;
	static String inputSubjectSem;
	static String inputSubjectDate;
	static String inputSubjectStart;
	static String inputSubjectEnd;
	static String inputSubjectRoom;
	
	private JPanel contentPane;
	private JTextField subjectTextField;
	private JTextField professorTextField;
	private JTextField yearTextField;
	private JTextField semTextField;
	private JTextField startTextField;
	private JTextField endTextField;
	private JTextField roomTextField;
	private JTextField subjectDateTextField;

	public ModSubjectUI(String subjectBtnName) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 403);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//삭제버튼
		JButton deleteButton = new JButton("삭제");
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		deleteButton.setBackground(Color.DARK_GRAY);
		deleteButton.setBounds(430, 210, 100, 30);
		contentPane.add(deleteButton);
		
		//변경 버튼
		JButton modifySubject = new JButton("\uBCC0\uACBD");
		modifySubject.setBackground(Color.DARK_GRAY);
		modifySubject.setForeground(Color.WHITE);
		modifySubject.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		modifySubject.setBounds(430, 245, 100, 30);
		contentPane.add(modifySubject);
		
		//취소버튼
		JButton cancelModify = new JButton("\uCDE8\uC18C");
		cancelModify.setForeground(Color.WHITE);
		cancelModify.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		cancelModify.setBackground(Color.DARK_GRAY);
		cancelModify.setBounds(430, 280, 100, 30);
		contentPane.add(cancelModify);
		
		JLabel subjectLabel = new JLabel();
		subjectLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectLabel.setText("\uACFC\uBAA9\uBA85");
		subjectLabel.setBounds(50, 90, 80, 30);
		contentPane.add(subjectLabel);
		
		JLabel professorLabel = new JLabel();
		professorLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		professorLabel.setText("\uB2F4\uB2F9\uAD50\uC218");
		professorLabel.setBounds(50, 130, 87, 27);
		contentPane.add(professorLabel);
		
		JLabel yearLabel = new JLabel();
		yearLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		yearLabel.setText("\uAC15\uC758년도");
		yearLabel.setBounds(50, 170, 87, 27);
		contentPane.add(yearLabel);
		
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		timeLabel.setText("\uAC15\uC758\uC2DC\uAC04");
		timeLabel.setBounds(50, 210, 87, 27);
		contentPane.add(timeLabel);
		
		JLabel roomLabel = new JLabel();
		roomLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		roomLabel.setText("\uAC15\uC758\uC2E4");
		roomLabel.setBounds(50, 250, 87, 27);
		contentPane.add(roomLabel);
		
		JLabel subjectTextField = new JLabel();
		subjectTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectTextField.setText(subjectBtnName);
		subjectTextField.setBounds(150, 90, 184, 24);
		contentPane.add(subjectTextField);
		
		//DB연결해서 subjectBtnName일 때의 값들을 setText
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
				if(subjectName.equals(subjectBtnName)) {
					professorName = rs.getString("Professor");
					subjectYearName = rs.getString("subjectYear");
					subjectSemName = rs.getString("subjectSem");
					subjectDateName = rs.getString("subjectDate");
					subjectStartName = rs.getString("subjectStart");
					subjectEndName = rs.getString("subjectEnd");
					subjectRoomName = rs.getString("room");
				}
			}

			rs.close();
			st.close();
		} catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		professorTextField = new JTextField();
		professorTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		professorTextField.setText(professorName);
		professorTextField.setColumns(10);
		professorTextField.setBounds(150, 130, 184, 24);
		contentPane.add(professorTextField);
		
		yearTextField = new JTextField();
		yearTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		yearTextField.setText(subjectYearName);
		yearTextField.setColumns(10);
		yearTextField.setBounds(150, 170, 56, 24);
		contentPane.add(yearTextField);
		
		JLabel textPane_5 = new JLabel();
		textPane_5.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_5.setText("\uB144\uB3C4");
		textPane_5.setBounds(211, 170, 45, 24);
		contentPane.add(textPane_5);
		
		semTextField = new JTextField();
		semTextField.setColumns(10);
		semTextField.setText(subjectSemName);
		semTextField.setBounds(260, 170, 35, 24);
		contentPane.add(semTextField);
		
		JLabel textPane_6 = new JLabel();
		textPane_6.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_6.setText("\uD559\uAE30");
		textPane_6.setBounds(300, 170, 45, 24);
		contentPane.add(textPane_6);
		
		startTextField = new JTextField();
		startTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		startTextField.setText(subjectStartName);
		startTextField.setColumns(10);
		startTextField.setBounds(232, 210, 35, 30);
		contentPane.add(startTextField);
		
		JLabel textPane_7 = new JLabel();
		textPane_7.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_7.setText("\uC2DC");
		textPane_7.setBounds(269, 210, 24, 24);
		contentPane.add(textPane_7);
		
		JLabel textPane_8 = new JLabel();
		textPane_8.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_8.setText("\uC2DC");
		textPane_8.setBounds(349, 210, 34, 24);
		contentPane.add(textPane_8);
		
		endTextField = new JTextField();
		endTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		endTextField.setText(subjectEndName);
		endTextField.setColumns(10);
		endTextField.setBounds(314, 210, 35, 30);
		contentPane.add(endTextField);
		
		JLabel textPane_9 = new JLabel();
		textPane_9.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		textPane_9.setText("~");
		textPane_9.setBounds(291, 210, 26, 24);
		contentPane.add(textPane_9);
		
		roomTextField = new JTextField();
		roomTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		roomTextField.setText(subjectRoomName);
		roomTextField.setColumns(10);
		roomTextField.setBounds(150, 250, 56, 24);
		contentPane.add(roomTextField);
		
		subjectDateTextField = new JTextField();
		subjectDateTextField.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		subjectDateTextField.setText(subjectDateName);
		subjectDateTextField.setBounds(150, 210, 80, 30);
		contentPane.add(subjectDateTextField);
		
		/*
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC6D4\uC694\uC77C", "\uD654\uC694\uC77C", "\uC218\uC694\uC77C", "\uBAA9\uC694\uC77C", "\uAE08\uC694\uC77C", "\uD1A0\uC694\uC77C", "\uC77C\uC694\uC77C"}));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		comboBox.setBounds(150, 210, 80, 30);
		contentPane.add(comboBox);
		*/
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 600, 70);
		contentPane.add(panel);
		
		JLabel label = new JLabel("\uACFC\uBAA9\uBCC0\uACBD");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 35));
		panel.add(label);
		
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String sQl;					
					Connection cOnn = null;
					Statement st = null;
					PreparedStatement pst = null;
					ResultSet rs = null;
					
					Class.forName(DBConn.forName);
					cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
					
					st = cOnn.createStatement();
					sQl = "USE SubjectDB";
					st.execute(sQl);
					rs = st.executeQuery("SELECT * FROM SubjectData");
					
					while(rs.next()) {
						subjectName = rs.getString("Subject");
					
						if(subjectBtnName.equals(subjectName)) {
							sQl = "DELETE FROM SubjectData WHERE Subject =" + "\'" + subjectName + "\'";
							st.execute(sQl);
						}
					}

					rs.close();
					st.close();
				} catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
			}
		});
		
		modifySubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
						String sQl;					
						Connection cOnn = null;
						Statement st = null;
						PreparedStatement pst = null;
						ResultSet rs = null;
						
						Class.forName(DBConn.forName);
						cOnn = DriverManager.getConnection(DBConn.URL, DBConn.ID, DBConn.PW);
						
						st = cOnn.createStatement();
						sQl = "USE SubjectDB";
						st.execute(sQl);
						rs = st.executeQuery("SELECT * FROM SubjectData");
						
						while(rs.next()) {
							subjectName = rs.getString("Subject");
							if(subjectName.equals(subjectBtnName)) {
								inputSubject = subjectTextField.getText();
								inputProfessor = professorTextField.getText();
								inputSubjectYear = yearTextField.getText();
								inputSubjectSem = semTextField.getText();
								inputSubjectDate = subjectDateTextField.getText();
								inputSubjectStart = startTextField.getText();
								inputSubjectEnd = endTextField.getText();
								inputSubjectRoom = roomTextField.getText();
								
								if(inputProfessor.length() == 0 || inputSubjectYear.length() == 0 || inputSubjectSem.length() == 0 || inputSubjectDate.length() == 0 || inputSubjectStart.length() == 0 || inputSubjectEnd.length() == 0 || inputSubjectRoom.length() == 0) {
										ReEnterRequest noNull = new ReEnterRequest();
										noNull.setVisible(true);
										dispose();
										MainUI reEnterThing = new MainUI();
										reEnterThing.setVisible(true);
								}
								else {
									if(inputSubject.equals(subjectName)) {
										NameOverlap usedSubject = new NameOverlap();
										usedSubject.setVisible(true);
										dispose();
									}
									else {
										new ModSubjectActive(inputSubject, inputProfessor, inputSubjectYear, inputSubjectSem, inputSubjectDate, inputSubjectStart, inputSubjectEnd, inputSubjectRoom);
										MainUI reEnterThing = new MainUI();
										reEnterThing.setVisible(true);
										dispose();
									}
								}			
						}
				}
				}catch(ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		
		cancelModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainUI backToMain = new MainUI();
				backToMain.setVisible(true);
				dispose();
			}
		});

	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModSubjectUI frame = new ModSubjectUI(subjectBtnName);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
